package GsML.sandbox;

/*Generated by MPS */

import eu.trentorise.game.test.GameTest;
import eu.trentorise.game.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import eu.trentorise.game.services.GameService;
import java.util.Map;
import java.util.HashMap;
import eu.trentorise.game.model.core.ChallengeAssignment;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import eu.trentorise.game.model.ChallengeModel;
import java.util.HashSet;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class map_GameSimulation extends GameTest {
  private PlayerService playerSrv;
  private static final String GAME_ID = "gameID";

  @Autowired
  private GameService gameSrv;
  @Override
  public void initEnv() {
    //  assign a challenge to PLAYER 
    Map<String, Object> data = new HashMap<String, Object>();
    data.put("target", "2d");
    data.put("counterName", "TrainTrips");
    data.put("perionName", "daily");
    data.put("bonusScore", "400d");
    data.put("bonusPointType", "greenLeaves");
    ChallengeAssignment challenge = new ChallengeAssignment("challengeName", "instance", data, "assigned", parseFromString("2019-07-03"), parseFromString("2019-07-12"));
    playerSrv.assignChallenge(GAME_ID, "player", challenge);
  }

  private Date parseFromString(String dateString) {
    return Date.from(LocalDate.parse(dateString).atStartOfDay(ZoneId.systemDefault()).toInstant());
  }
  @Override
  public void defineGame() {
    // add all the Game Elements 
    ChallengeModel model = new ChallengeModel();
    model.setName("challengeName");
    model.setVariables(new HashSet<String>());
    model.getVariables().add("variableName");
    gameSrv.saveChallengeModel(GAME_ID, model);

  }


  @Override
  public void defineExecData(List<GameTest.ExecData> execList) {
    Map<String, Object> data = new HashMap<String, Object>();
    data.put("pointName", "20d");

    ListSequence.fromList(execList).addElement(new GameTest.ExecData(GAME_ID, "actionName", data));

  }

  @Override
  public void analyzeResult() {
  }
}
