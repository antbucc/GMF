package RetrieveInstances.plugin;

/*Generated by MPS */

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import com.squareup.okhttp.Credentials;
import com.squareup.okhttp.MediaType;
import jetbrains.mps.progress.ProgressMonitorAdapter;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.baseLanguage.logging.runtime.model.LoggingRuntime;
import org.apache.log4j.Level;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.squareup.okhttp.RequestBody;
import java.util.UUID;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class RetrieveMethod implements Runnable {
  private static final Logger LOG = LogManager.getLogger(RetrieveMethod.class);
  private static String Token = "9f0dca02-0bf7-4419-b008-03d52d8fdeb2";
  private static String apiIstituteUrl = "https://climb.smartcommunitylab.it/v2/api/institute/TEST";
  private static String apiSchoolUrl = "https://climb.smartcommunitylab.it/v2/api/school/TEST";
  private static String apiGameUrl = "https://climb.smartcommunitylab.it/v2/api/game/TEST";
  private static String apiStudentsUrls = "https://climb.smartcommunitylab.it/v2/api/child/TEST";

  private static String apiGamificationEngine = "https://dev.smartcommunitylab.it/gamification/";
  private static String apiGameData = "https://dev.smartcommunitylab.it/gamification/data/game/";

  private static String apiPlayersState = "https://dev.smartcommunitylab.it/gamification/gengine/state/5c1a471be4b017b723f09a50?size=169";


  private static String apiGameModel = "https://dev.smartcommunitylab.it/gamification/model/game/5c1a471be4b017b723f09a50";

  private static String credentials = Credentials.basic("long-rovereto", "long_RoVg@me");

  public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");


  public RetrieveMethod(ProgressMonitorAdapter adapter, SModel model) {
    this.myAdapter = adapter;
    this.myModel = model;
  }


  public void run() {

    int count = 0;
    LoggingRuntime.logMsgView(Level.INFO, "------INSTANCES RETRIEVING STARTED-----", RetrieveMethod.class, null, null);
    SNode domain = createDomainInstance_7rmalq_a0d0w();
    SModelOperations.addRootNode(this.myModel, domain);

    try {
      GameModel gameModel = this.doGetGameModel(apiGameModel);

      GameContent gameInstances = this.doGetGameContent(apiPlayersState);

      for (PlayerState state : gameInstances.getContent()) {
        SNode playerState = this.addPlayerStateNode(state, gameModel);
        SModelOperations.addRootNode(this.myModel, playerState);
        count++;

      }
      LoggingRuntime.logMsgView(Level.INFO, "NUMBER OF INSTANCES: " + count, RetrieveMethod.class, null, null);

      // add the Institutes 
      Institute[] institutes = this.doGetInstitutes(apiIstituteUrl);
      for (int i = 0; i < institutes.length; i++) {

        Institute institute = institutes[i];
        SNode instituteNode = this.addInstituteNode(institute, domain);
        SModelOperations.addRootNode(this.myModel, instituteNode);

        //  add all the schools for each institute 
        School[] schools = this.doGetSchools(apiSchoolUrl, institute.objectId);
        for (int j = 0; j < schools.length; j++) {
          School school = schools[j];
          SNode schoolNode = this.addSchoolNode(school, instituteNode, domain);
          SModelOperations.addRootNode(this.myModel, schoolNode);

          // for each team of a school add the actual game state  
          Game[] gameModels = this.doGetGames(apiGameUrl, institute.objectId, school.objectId);
          for (int l = 0; l < gameModels.length; l++) {
            Game current = gameModels[l];
            SNode gameInstance = this.addGameNode(current, instituteNode, schoolNode);
            SModelOperations.addRootNode(this.myModel, gameInstance);
          }

          //  for each school get the participating class rooms 
          String[] classrooms = this.doGetClassrooms(apiGameUrl, institute.objectId, school.objectId);
          for (int k = 0; k < classrooms.length; k++) {
            String classroom = classrooms[k];
            SNode classroomNode = this.addClassRoomNode(classroom, school, instituteNode, domain, schoolNode);
            SModelOperations.addRootNode(this.myModel, classroomNode);

            //  add students part of each classroom 
            Student[] students = this.doGetStudents(apiStudentsUrls, institute.objectId, school.objectId);
            for (int m = 0; m < students.length; m++) {
              Student current = students[m];
              SNode studentNode = this.addStudentNode(current, instituteNode, school, classroomNode, domain);
              SModelOperations.addRootNode(this.myModel, studentNode);

            }
          }

        }

      }

      //  



    } catch (IOException e) {
    }

    this.myAdapter.step("Do some work tish write lock");

  }

  private final ProgressMonitorAdapter myAdapter;
  private SModel myModel;

  private SNode addMonitorNode(PlayerState playerState) {
    return null;
  }



  private SNode addPlayerStateNode(PlayerState playerState, GameModel gameModel) {
    SNode playerStateNode;
    playerStateNode = createPlayerState_7rmalq_a0b0fb(generateMonitor(playerState), getListPointConceptState(playerState), getListChallengeConceptState(playerState), playerState.playerId, playerState.playerId, playerState.gameId, gameModel.owner + "." + gameModel.name + "." + "GameInstances");
    return playerStateNode;
  }

  private SNode generateMonitor(PlayerState state) {

    int dailyspeed = 0;
    int neededDays = 14;
    int delay = 2;
    int totalKmChallengesWon = 0;
    int completitionPercentage = 40;
    int total_distance = 0;
    int total_PrizeWon = 0;
    //  total Distance 
    for (PointConceptState pointState : state.getState().getPointConcept()) {
      if (pointState.name.equalsIgnoreCase("total_distance")) {
        total_distance = pointState.getScore();
        break;
      }

    }
    if (state.getState().getChallengeConcept() != null) {
      for (ChallengeConceptState ccs : state.getState().getChallengeConcept()) {
        if (ccs.getFields().prizeWon) {
          int currentBonusScore = ccs.getFields().getBonusScore() / 1000;
          totalKmChallengesWon = totalKmChallengesWon + currentBonusScore;
        }
      }
    }

    int travelledDistance = total_distance - totalKmChallengesWon;
    int effectiveDays = 0;
    for (PointConceptState pointState : state.getState().getPointConcept()) {
      if (pointState.name.equalsIgnoreCase("participation_count")) {
        int size = pointState.getPeriods().getDaily().instances.size();
        effectiveDays = effectiveDays + size;
      }

    }
    dailyspeed = travelledDistance / effectiveDays;


    SNode monitor = createMonitor_7rmalq_a0s0hb(dailyspeed, neededDays, delay, completitionPercentage);

    return monitor;
  }

  private List<SNode> getListChallengeConceptState(PlayerState state) {

    List<SNode> result = new ArrayList<SNode>();
    if (state.getState().getChallengeConcept() != null) {
      for (ChallengeConceptState cs : state.getState().getChallengeConcept()) {
        SNode challengeConceptState;
        challengeConceptState = createChallengeConceptState_7rmalq_a0b0a0c0jb(cs.name, cs.modelName, cs.start, cs.state, cs.getFields().bonusScore, cs.getFields().VirtualPrize, cs.getFields().bonusPointType, cs.getFields().prizeWon);
        ListSequence.fromList(result).addElement(challengeConceptState);
      }

    }
    return result;
  }


  private List<SNode> getListPointConceptState(PlayerState state) {
    List<SNode> result = new ArrayList<SNode>();
    for (PointConceptState pcs : state.getState().getPointConcept()) {
      SNode pointConceptState;
      pointConceptState = createPointConceptState_7rmalq_a0b0b0mb(getPeriod(pcs), pcs.getName(), pcs.getScore());
      ListSequence.fromList(result).addElement(pointConceptState);
    }
    return result;
  }


  private SNode getPeriod(PointConceptState pcs) {
    int sizeDaily = pcs.getPeriods().getDaily().instances.keySet().size();
    int sizeWeekly = pcs.getPeriods().getWeekly().instances.keySet().size();
    SNode result = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04612d0cbcL, "GmML.structure.PointPeriodState"));
    result = createPointPeriodState_7rmalq_a0d0pb(sizeDaily, sizeWeekly);
    return result;
  }





  private String getCurrentName(PlayerState state) {
    String result = "";
    result = state.getState().getPointConcept().get(0).getName();
    return result;
  }

  private SNode addInstituteNode(Institute institute, SNode domain) {

    SNode instituteNode = createInstituteInstance_7rmalq_a0b0xb(domain, institute.address, institute.name, institute.ownerId, institute.objectId, SPropertyOperations.getString(domain, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "." + institute.name);
    return instituteNode;
  }

  private SNode addSchoolNode(School school, SNode instituteNode, SNode domain) {
    SNode schoolNode = createSchoolInstance_7rmalq_a0a0zb(instituteNode, school.address, school.name, school.objectId, SPropertyOperations.getString(domain, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "." + SPropertyOperations.getString(instituteNode, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "." + school.name);
    return schoolNode;
  }
  private SNode addClassRoomNode(String classroom, School school, SNode instituteNode, SNode domain, SNode schoolInstance) {
    SNode classroomNode = createClassroomInstance_7rmalq_a0a0ac(schoolInstance, classroom, SPropertyOperations.getString(domain, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "." + SPropertyOperations.getString(instituteNode, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "." + school.name + "." + classroom);
    return classroomNode;
  }

  private SNode addStudentNode(Student student, SNode instituteNode, School school, SNode classroomNode, SNode domain) {
    SNode studentNode = createStudentInstance_7rmalq_a0a0cc(classroomNode, student.name, student.surname, SPropertyOperations.getString(domain, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "." + SPropertyOperations.getString(instituteNode, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "." + school.name + "." + SPropertyOperations.getString(classroomNode, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "." + student.name);


    SModelOperations.addRootNode(this.myModel, studentNode);
    return studentNode;
  }

  private SNode addGameNode(Game game, SNode instituteNode, SNode schoolNode) throws IOException {
    ArrayList<SNode> experiencePointInstances = new ArrayList<SNode>();
    ArrayList<SNode> skillPointInstances = new ArrayList<SNode>();
    PointConceptState[] points = this.doGetGamePoints(apiGamificationEngine, game.gameId);
    for (PointConceptState point : points) {
      if (point.getName().contains("count")) {
        //  experience point 


      }
    }



    SNode gameInstance = createGameInstance_7rmalq_a0h0ec(instituteNode, schoolNode, schoolNode, game.gameName, game.gameId, game.gameDescription, game.from, game.to, SLinkOperations.getTarget(instituteNode, MetaAdapterFactory.getReferenceLink(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe312L, 0x29c2332daaaaee9aL, "domain")) + "." + SPropertyOperations.getString(instituteNode, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "." + SPropertyOperations.getString(schoolNode, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + ".GameInstances");
    return gameInstance;
  }

  private PlayerState doGetPlayerState(String url, String gameID, String playerID) throws IOException {
    OkHttpClient client = new OkHttpClient();

    String urlFinal = url + gameID + "/player/" + playerID + "/state";
    Request request = new Request.Builder().header("Authorization", credentials).url(urlFinal).build();

    Response response = client.newCall(request).execute();
    String result = response.body().string().toString();
    Gson gson = new Gson();

    PlayerState playerState = gson.fromJson(result, PlayerState.class);

    return playerState;

  }
  private GameContent doGetGameContent(String url) throws IOException {
    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder().header("Authorization", credentials).url(url).build();
    Response response = client.newCall(request).execute();

    String result = response.body().string().toString();
    Gson gson = new Gson();
    GameContent gameContent = gson.fromJson(result, GameContent.class);

    return gameContent;
  }


  private GameModel doGetGameModel(String url) throws IOException {
    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder().header("Authorization", credentials).url(url).build();
    Response response = client.newCall(request).execute();

    String result = response.body().string().toString();
    Gson gson = new Gson();

    GameModel gameModel = gson.fromJson(result, GameModel.class);

    return gameModel;
  }


  private Institute[] doGetInstitutes(String url) throws IOException {
    OkHttpClient client = new OkHttpClient();
    Request request = new Request.Builder().header("Authorization", Token).url(url).build();
    Response response = client.newCall(request).execute();
    String result = response.body().string().toString();

    Gson gson = new Gson();

    Institute[] istituti = gson.fromJson(result, Institute[].class);


    return istituti;

  }
  private School[] doGetSchools(String url, String instituteId) throws IOException {
    OkHttpClient client = new OkHttpClient();

    String urlFinal = url + "/" + instituteId;

    Request request = new Request.Builder().header("Authorization", Token).url(urlFinal).build();
    Response response = client.newCall(request).execute();
    String result = response.body().string().toString();
    Gson gson = new Gson();

    School[] schools = gson.fromJson(result, School[].class);

    return schools;

  }
  private String[] doGetClassrooms(String url, String instituteId, String schoolId) throws IOException {
    OkHttpClient client = new OkHttpClient();

    String urlFinal = url + "/" + instituteId + "/" + schoolId + "/classes";

    Request request = new Request.Builder().header("Authorization", Token).url(urlFinal).build();
    Response response = client.newCall(request).execute();
    String result = response.body().string().toString();

    Gson gson = new Gson();
    String[] classrooms = gson.fromJson(result, String[].class);
    return classrooms;
  }

  private Student[] doGetStudents(String url, String instituteId, String schoolId) throws IOException {
    OkHttpClient client = new OkHttpClient();

    String urlFinal = url + "/" + instituteId + "/" + schoolId;

    Request request = new Request.Builder().header("Authorization", Token).url(urlFinal).build();
    Response response = client.newCall(request).execute();
    String result = response.body().string().toString();

    Gson gson = new Gson();
    Student[] students = gson.fromJson(result, Student[].class);
    return students;

  }

  private Game[] doGetGames(String url, String instituteId, String schoolId) throws IOException {
    OkHttpClient client = new OkHttpClient();

    String urlFinal = url + "/" + instituteId + "/" + schoolId;

    Request request = new Request.Builder().header("Authorization", Token).url(urlFinal).build();
    Response response = client.newCall(request).execute();
    String result = response.body().string().toString();
    Gson gson = new Gson();
    Game[] games = gson.fromJson(result, Game[].class);
    return games;
  }

  private PointConceptState[] doGetGamePoints(String url, String gameID) throws IOException {
    OkHttpClient client = new OkHttpClient();

    String urlFinal = url + "model/game/" + gameID + "/point";

    Request request = new Request.Builder().header("Authorization", credentials).url(urlFinal).build();
    Response response = client.newCall(request).execute();
    String result = response.body().string().toString();
    Gson gson = new Gson();
    PointConceptState[] points = gson.fromJson(result, PointConceptState[].class);
    return points;
  }

  private String[] doGetGameActions(String url, String gameID) throws IOException {
    OkHttpClient client = new OkHttpClient();

    String urlFinal = url + "/model/game/" + gameID + "/action";

    Request request = new Request.Builder().header("Authorization", credentials).url(urlFinal).build();
    Response response = client.newCall(request).execute();
    String result = response.body().string().toString();
    Gson gson = new Gson();
    String[] actions = gson.fromJson(result, String[].class);
    return actions;
  }

  private BadgeCollection[] doGetGameBadgeCollections(String url, String gameID) throws IOException {
    OkHttpClient client = new OkHttpClient();

    String urlFinal = url + "/model/game/" + gameID + "/badges";

    Request request = new Request.Builder().header("Authorization", credentials).url(urlFinal).build();
    Response response = client.newCall(request).execute();
    String result = response.body().string().toString();
    Gson gson = new Gson();
    BadgeCollection[] collections = gson.fromJson(result, BadgeCollection[].class);
    return collections;
  }

  private Challenge[] doGetChallenges(String url, String gameID) throws IOException {
    OkHttpClient client = new OkHttpClient();

    String urlFinal = url + "/model/game/" + gameID + "/challenge";

    Request request = new Request.Builder().header("Authorization", credentials).url(urlFinal).build();
    Response response = client.newCall(request).execute();
    String result = response.body().string().toString();
    Gson gson = new Gson();
    Challenge[] challenges = gson.fromJson(result, Challenge[].class);
    return challenges;
  }

  private void doPostExample() throws IOException {
    OkHttpClient client = new OkHttpClient();
    String gameID = "5c13746ce4b018bc28780398";
    JsonObject obj = new JsonObject();
    obj.addProperty("id", gameID);
    obj.addProperty("name", "PuntoModels");
    String json = obj.toString();
    String urlFinal = apiGamificationEngine + "/model/game/" + gameID + "/point";
    RequestBody body = RequestBody.create(JSON, json);
    Request request = new Request.Builder().header("Authorization", credentials).url(urlFinal).post(body).build();
    Response response = client.newCall(request).execute();
  }
  private void doPostNewGame() throws IOException {
    OkHttpClient client = new OkHttpClient();
    JsonObject obj = new JsonObject();
    obj.addProperty("name", "NewGame_MODELS2019");

    // unique ID 
    String uniqueID = UUID.randomUUID().toString();
    obj.addProperty("id", uniqueID);

    String json = obj.toString();
    String urlFinal = apiGamificationEngine + "/model/game/";
    RequestBody body = RequestBody.create(JSON, json);
    Request request = new Request.Builder().header("Authorization", credentials).url(urlFinal).post(body).build();
    Response response = client.newCall(request).execute();
  }



  private static SNode createDomainInstance_7rmalq_a0d0w() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa2bdd31L, "GiML.structure.DomainInstance"), null, null, false);
    n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "TEST");
    n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, 0x115eca8579fL, "virtualPackage"), "TEST");
    return n1;
  }
  private static SNode createPlayerState_7rmalq_a0b0fb(SNode node0, Iterable<? extends SNode> seq0, Iterable<? extends SNode> seq1, Object p0, Object p1, Object p2, Object p3) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x16a9394b31c1a45bL, "GmML.structure.PlayerState"), null, null, false);
    {
      n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), p0 + "");
      n1.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x16a9394b31c1a45bL, 0x16a9394b31ca0af0L, "playerId"), p1 + "");
      n1.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x16a9394b31c1a45bL, 0x16a9394b31ca0e79L, "gameId"), p2 + "");
      SNode n2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x16a9394b335a44d7L, "GmML.structure.State"), null, null, false);
      for (SNode n : seq0) {
        n2.addChild(MetaAdapterFactory.getContainmentLink(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x16a9394b335a44d7L, 0x16a9394b335a4ab4L, "PointConcept"), SNodeOperations.copyIfNecessary(SNodeOperations.cast(n, MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x16a9394b335a4da5L, "GmML.structure.PointConceptState"))));
      }
      for (SNode n : seq1) {
        n2.addChild(MetaAdapterFactory.getContainmentLink(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x16a9394b335a44d7L, 0x7b087e04605a4906L, "ChallengeConcept"), SNodeOperations.copyIfNecessary(SNodeOperations.cast(n, MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04605a4d93L, "GmML.structure.ChallengeConceptState"))));
      }
      if (node0 != null) {
        n2.addChild(MetaAdapterFactory.getContainmentLink(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x16a9394b335a44d7L, 0x3488dc45bc5fa960L, "monitor"), SNodeOperations.copyIfNecessary(SNodeOperations.cast(node0, MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x3488dc45bc5907f5L, "GmML.structure.Monitor"))));
      }
      n1.addChild(MetaAdapterFactory.getContainmentLink(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x16a9394b31c1a45bL, 0x16a9394b3367f867L, "state"), n2);
      n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, 0x115eca8579fL, "virtualPackage"), p3 + "");
    }
    return n1;
  }
  private static SNode createMonitor_7rmalq_a0s0hb(Object p0, Object p1, Object p2, Object p3) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x3488dc45bc5907f5L, "GmML.structure.Monitor"), null, null, false);
    n1.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x3488dc45bc5907f5L, 0x3488dc45bc591a0cL, "DailySpeed"), p0 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x3488dc45bc5907f5L, 0x3488dc45bc5932ecL, "NeededDays"), p1 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x3488dc45bc5907f5L, 0x3488dc45bc5942bfL, "Delay"), p2 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x3488dc45bc5907f5L, 0x3488dc45bc594e10L, "CompletitionPercentage"), p3 + "");
    return n1;
  }
  private static SNode createChallengeConceptState_7rmalq_a0b0a0c0jb(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04605a4d93L, "GmML.structure.ChallengeConceptState"), null, null, false);
    {
      n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), p0 + "");
      n1.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04605a4d93L, 0x7b087e04605a915dL, "modelName"), p1 + "");
      n1.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04605a4d93L, 0x7b087e04605a9a68L, "start"), p2 + "");
      n1.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04605a4d93L, 0x7b087e04605abc56L, "state"), p3 + "");
      SNode n2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04608b2cf7L, "GmML.structure.ChallengeFieldState"), null, null, false);
      n2.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04608b2cf7L, 0x7b087e04608b89a0L, "bonusScore"), p4 + "");
      n2.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04608b2cf7L, 0x7b087e04608b906fL, "VirtualPrize"), p5 + "");
      n2.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04608b2cf7L, 0x7b087e04608b9bc4L, "bonusPointType"), p6 + "");
      n2.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04608b2cf7L, 0x7b087e04608ba95dL, "prizeWon"), p7 + "");
      n1.addChild(MetaAdapterFactory.getContainmentLink(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04605a4d93L, 0x7b087e0460bbc02eL, "fields"), n2);
    }
    return n1;
  }
  private static SNode createPointConceptState_7rmalq_a0b0b0mb(SNode node0, Object p0, Object p1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x16a9394b335a4da5L, "GmML.structure.PointConceptState"), null, null, false);
    n1.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x16a9394b335a4da5L, 0x16a9394b336cb307L, "name"), p0 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x16a9394b335a4da5L, 0x16a9394b336cb4ccL, "score"), p1 + "");
    if (node0 != null) {
      n1.addChild(MetaAdapterFactory.getContainmentLink(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x16a9394b335a4da5L, 0x7b087e04612ce657L, "periods"), SNodeOperations.copyIfNecessary(SNodeOperations.cast(node0, MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04612d0cbcL, "GmML.structure.PointPeriodState"))));
    }
    return n1;
  }
  private static SNode createPointPeriodState_7rmalq_a0d0pb(Object p0, Object p1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04612d0cbcL, "GmML.structure.PointPeriodState"), null, null, false);
    {
      SNode n2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04612d4c03L, "GmML.structure.DailyPeriodState"), null, null, false);
      n2.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04612d4c03L, 0x7b087e04616d1d33L, "instances"), p0 + "");
      n1.addChild(MetaAdapterFactory.getContainmentLink(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04612d0cbcL, 0x7b087e04612d2115L, "daily"), n2);
      SNode n3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04612d5996L, "GmML.structure.WeeklyPeriodState"), null, null, false);
      n3.setProperty(MetaAdapterFactory.getProperty(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04612d5996L, 0x7b087e04616d3a90L, "instances"), p1 + "");
      n1.addChild(MetaAdapterFactory.getContainmentLink(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL, 0x7b087e04612d0cbcL, 0x7b087e04616f5ef0L, "weekly"), n3);
    }
    return n1;
  }
  private static SNode createInstituteInstance_7rmalq_a0b0xb(SNode node0, Object p0, Object p1, Object p2, Object p3, Object p4) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa757c14L, "GiML.structure.InstituteInstance"), null, null, false);
    n1.setProperty(MetaAdapterFactory.getProperty(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa757c14L, 0x29c2332daabe00b1L, "address"), p0 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), p1 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa757c14L, 0x182d3787495b7c2bL, "ownerId"), p2 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa757c14L, 0x182d3787495d6c41L, "id"), p3 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, 0x115eca8579fL, "virtualPackage"), p4 + "");
    n1.setReferenceTarget(MetaAdapterFactory.getReferenceLink(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe312L, 0x29c2332daaaaee9aL, "domain"), node0);
    return n1;
  }
  private static SNode createSchoolInstance_7rmalq_a0a0zb(SNode node0, Object p0, Object p1, Object p2, Object p3) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa80e68dL, "GiML.structure.SchoolInstance"), null, null, false);
    n1.setProperty(MetaAdapterFactory.getProperty(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa80e68dL, 0x29c2332daab7106bL, "address"), p0 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), p1 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa80e68dL, 0x548347b052846c4cL, "id"), p2 + "");
    n1.setReferenceTarget(MetaAdapterFactory.getReferenceLink(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x29c2332daa804ab6L, 0x29c2332daaaaee97L, "institute"), node0);
    n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, 0x115eca8579fL, "virtualPackage"), p3 + "");
    return n1;
  }
  private static SNode createClassroomInstance_7rmalq_a0a0ac(SNode node0, Object p0, Object p1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daad26af7L, "GiML.structure.ClassroomInstance"), null, null, false);
    n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), p0 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, 0x115eca8579fL, "virtualPackage"), p1 + "");
    n1.setReferenceTarget(MetaAdapterFactory.getReferenceLink(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daad26af7L, 0x77937ef710bbc239L, "relatedSchool"), node0);
    return n1;
  }
  private static SNode createStudentInstance_7rmalq_a0a0cc(SNode node0, Object p0, Object p1, Object p2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x548347b052b52548L, "GiML.structure.StudentInstance"), null, null, false);
    n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), p0 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x548347b052b52548L, 0x548347b052b5254dL, "surname"), p1 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, 0x115eca8579fL, "virtualPackage"), p2 + "");
    n1.setReferenceTarget(MetaAdapterFactory.getReferenceLink(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe31eL, 0x548347b052b52557L, "classRoom"), node0);
    return n1;
  }
  private static SNode createGameInstance_7rmalq_a0h0ec(SNode node0, SNode node1, SNode node2, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x19b939282ee57042L, "GiML.structure.GameInstance"), null, null, false);
    n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), p0 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd03861a4L, 0x3eecc86bd0389f79L, "id"), p1 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x23eac9cba952c550L, 0x113e1e4cb66fe323L, "description"), p2 + "");
    n1.setReferenceTarget(MetaAdapterFactory.getReferenceLink(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x19b939282ee57042L, 0x77937ef7119d0a22L, "instituteInstance"), node0);
    n1.setProperty(MetaAdapterFactory.getProperty(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x19b939282ee57042L, 0x687da624470c3fddL, "from"), p3 + "");
    n1.setProperty(MetaAdapterFactory.getProperty(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x19b939282ee57042L, 0x687da624470c3fdfL, "to"), p4 + "");
    n1.setReferenceTarget(MetaAdapterFactory.getReferenceLink(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x23eac9cba952c550L, 0x29c2332daaea3e3fL, "school"), node1);
    n1.setProperty(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, 0x115eca8579fL, "virtualPackage"), p5 + "");
    n1.setReferenceTarget(MetaAdapterFactory.getReferenceLink(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x19b939282ee57042L, 0x77937ef711b890ecL, "schoolInstance"), node2);
    return n1;
  }
}
