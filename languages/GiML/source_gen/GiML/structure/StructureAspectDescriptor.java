package GiML.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.runtime.DataTypeDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptBadgeCollectionInstance = createDescriptorForBadgeCollectionInstance();
  /*package*/ final ConceptDescriptor myConceptClassroomInstance = createDescriptorForClassroomInstance();
  /*package*/ final ConceptDescriptor myConceptDomainInstance = createDescriptorForDomainInstance();
  /*package*/ final ConceptDescriptor myConceptGameInstance = createDescriptorForGameInstance();
  /*package*/ final ConceptDescriptor myConceptInstituteInstance = createDescriptorForInstituteInstance();
  /*package*/ final ConceptDescriptor myConceptSchoolInstance = createDescriptorForSchoolInstance();
  /*package*/ final ConceptDescriptor myConceptSinglePlayerChallengeInstance = createDescriptorForSinglePlayerChallengeInstance();
  /*package*/ final ConceptDescriptor myConceptStudentInstance = createDescriptorForStudentInstance();
  /*package*/ final ConceptDescriptor myConceptchallengeVariable = createDescriptorForchallengeVariable();
  /*package*/ final ConceptDescriptor myConceptdataDrivenActionInstance = createDescriptorFordataDrivenActionInstance();
  /*package*/ final ConceptDescriptor myConcepteventDrivenActionInstance = createDescriptorForeventDrivenActionInstance();
  /*package*/ final ConceptDescriptor myConceptexperiencePointInstance = createDescriptorForexperiencePointInstance();
  /*package*/ final ConceptDescriptor myConceptistanzaDashboard = createDescriptorForistanzaDashboard();
  /*package*/ final ConceptDescriptor myConceptskillPointInstance = createDescriptorForskillPointInstance();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, "GML");
    deps.extendedLanguage(0x1472546da96448a0L, 0xa11e4271b165a42cL, "GaML");
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptBadgeCollectionInstance, myConceptClassroomInstance, myConceptDomainInstance, myConceptGameInstance, myConceptInstituteInstance, myConceptSchoolInstance, myConceptSinglePlayerChallengeInstance, myConceptStudentInstance, myConceptchallengeVariable, myConceptdataDrivenActionInstance, myConcepteventDrivenActionInstance, myConceptexperiencePointInstance, myConceptistanzaDashboard, myConceptskillPointInstance);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.BadgeCollectionInstance:
        return myConceptBadgeCollectionInstance;
      case LanguageConceptSwitch.ClassroomInstance:
        return myConceptClassroomInstance;
      case LanguageConceptSwitch.DomainInstance:
        return myConceptDomainInstance;
      case LanguageConceptSwitch.GameInstance:
        return myConceptGameInstance;
      case LanguageConceptSwitch.InstituteInstance:
        return myConceptInstituteInstance;
      case LanguageConceptSwitch.SchoolInstance:
        return myConceptSchoolInstance;
      case LanguageConceptSwitch.SinglePlayerChallengeInstance:
        return myConceptSinglePlayerChallengeInstance;
      case LanguageConceptSwitch.StudentInstance:
        return myConceptStudentInstance;
      case LanguageConceptSwitch.challengeVariable:
        return myConceptchallengeVariable;
      case LanguageConceptSwitch.dataDrivenActionInstance:
        return myConceptdataDrivenActionInstance;
      case LanguageConceptSwitch.eventDrivenActionInstance:
        return myConcepteventDrivenActionInstance;
      case LanguageConceptSwitch.experiencePointInstance:
        return myConceptexperiencePointInstance;
      case LanguageConceptSwitch.istanzaDashboard:
        return myConceptistanzaDashboard;
      case LanguageConceptSwitch.skillPointInstance:
        return myConceptskillPointInstance;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList();
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForBadgeCollectionInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "BadgeCollectionInstance", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da624477a6c9aL);
    b.class_(false, false, true);
    b.super_("GML.structure.BadgeCollection", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6e9L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/7529356826781576346");
    b.version(2);
    b.alias("badgeCollection");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForClassroomInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "ClassroomInstance", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daad26af7L);
    b.class_(false, false, true);
    b.super_("GaML.structure.Classroom", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe319L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/3009023772269374199");
    b.version(2);
    b.alias("classroomInstance");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDomainInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "DomainInstance", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa2bdd31L);
    b.class_(false, false, true);
    b.super_("GaML.structure.Domain", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe2d9L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/3009023772258458929");
    b.version(2);
    b.alias("domainInstance");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForGameInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "GameInstance", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x19b939282ee57042L);
    b.class_(false, false, true);
    b.super_("GaML.structure.GameDefinition", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x23eac9cba952c550L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0x4caf0310491e41f5L, 0x8a9b2006b3a94898L, 0x40c1a7cb987d20d5L);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/1853575566387933250");
    b.version(2);
    b.property("from", 0x687da624470c3fddL).type(PrimitiveTypeId.STRING).origin("7529356826774355933").done();
    b.property("to", 0x687da624470c3fdfL).type(PrimitiveTypeId.STRING).origin("7529356826774355935").done();
    b.aggregate("classrooms", 0x687da62446f82c62L).target(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daad26af7L).optional(false).ordered(true).multiple(true).origin("7529356826773040226").done();
    b.aggregate("experiencePoints", 0x687da6244723bd1eL).target(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da6244723bd21L).optional(true).ordered(true).multiple(true).origin("7529356826775895326").done();
    b.aggregate("skillPoints", 0x687da624474a49b4L).target(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da62447474ed3L).optional(true).ordered(true).multiple(true).origin("7529356826778421684").done();
    b.aggregate("dataDrivenActions", 0x687da624474fd7b0L).target(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da624474faca0L).optional(true).ordered(true).multiple(true).origin("7529356826778785712").done();
    b.aggregate("eventDrivenActions", 0x687da624474fd7b5L).target(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da624474faca3L).optional(true).ordered(true).multiple(true).origin("7529356826778785717").done();
    b.aggregate("badgeCollections", 0x687da624477f388bL).target(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da624477a6c9aL).optional(true).ordered(true).multiple(true).origin("7529356826781890699").done();
    b.aggregate("singlePlayerChallenges", 0x687da6244782cab0L).target(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da6244782caa1L).optional(true).ordered(true).multiple(true).origin("7529356826782124720").done();
    b.alias("gameInstance");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInstituteInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "InstituteInstance", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa757c14L);
    b.class_(false, false, true);
    b.super_("GaML.structure.Institute", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe312L);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/3009023772263283732");
    b.version(2);
    b.property("address", 0x29c2332daabe00b1L).type(PrimitiveTypeId.STRING).origin("3009023772268036273").done();
    b.property("ownerId", 0x182d3787495b7c2bL).type(PrimitiveTypeId.STRING).origin("1742109685053094955").done();
    b.property("id", 0x182d3787495d6c41L).type(PrimitiveTypeId.STRING).origin("1742109685053221953").done();
    b.alias("instituteInstitute");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSchoolInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "SchoolInstance", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa80e68dL);
    b.class_(false, false, true);
    b.super_("GaML.structure.School", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x29c2332daa804ab6L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/3009023772264031885");
    b.version(2);
    b.property("address", 0x29c2332daab7106bL).type(PrimitiveTypeId.STRING).origin("3009023772267581547").done();
    b.property("id", 0x548347b052846c4cL).type(PrimitiveTypeId.STRING).origin("6089789943759268940").done();
    b.alias("schoolInstance");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSinglePlayerChallengeInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "SinglePlayerChallengeInstance", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da6244782caa1L);
    b.class_(false, false, true);
    b.super_("GaML.structure.SinglePlayerChallenge", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x687da6244782ca9eL);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/7529356826782124705");
    b.version(2);
    b.property("id", 0x687da6244782caa4L).type(PrimitiveTypeId.STRING).origin("7529356826782124708").done();
    b.aggregate("variables", 0x687da6244782eefaL).target(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da6244782eef7L).optional(false).ordered(true).multiple(true).origin("7529356826782134010").done();
    b.alias("singlePlayerChallengeInstance");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForStudentInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "StudentInstance", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x548347b052b52548L);
    b.class_(false, false, true);
    b.super_("GaML.structure.Student", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe31eL);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/6089789943762462024");
    b.version(2);
    b.property("surname", 0x548347b052b5254dL).type(PrimitiveTypeId.STRING).origin("6089789943762462029").done();
    b.alias("studentInstance");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForchallengeVariable() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "challengeVariable", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da6244782eef7L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/7529356826782134007");
    b.version(2);
    b.alias("challengeVariable");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorFordataDrivenActionInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "dataDrivenActionInstance", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da624474faca0L);
    b.class_(false, false, true);
    b.super_("GaML.structure.dataDrivenAction", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x687da624474fac98L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/7529356826778774688");
    b.version(2);
    b.alias("dataDrivenAction");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForeventDrivenActionInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "eventDrivenActionInstance", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da624474faca3L);
    b.class_(false, false, true);
    b.super_("GaML.structure.eventDrivenAction", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x687da624474fac9bL);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/7529356826778774691");
    b.version(2);
    b.alias("eventDrivenAction");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForexperiencePointInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "experiencePointInstance", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da6244723bd21L);
    b.class_(false, false, true);
    b.super_("GaML.structure.experiencePoint", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x687da6244723bd22L);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/7529356826775895329");
    b.version(2);
    b.property("score", 0x687da624472c89a6L).type(PrimitiveTypeId.INTEGER).origin("7529356826776471974").done();
    b.alias("experiencePoint");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForistanzaDashboard() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "istanzaDashboard", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x3b9018d1b0e7cb07L);
    b.class_(false, false, true);
    b.super_("GaML.structure.Dashboard", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x3b9018d1b0e7cb00L);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/4291957733779294983");
    b.version(2);
    b.aggregate("istanze", 0x3b9018d1b0fa4204L).target(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x19b939282ee57042L).optional(false).ordered(true).multiple(true).origin("4291957733780505092").done();
    b.alias("dashboard");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForskillPointInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GiML", "skillPointInstance", 0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da62447474ed3L);
    b.class_(false, false, true);
    b.super_("GaML.structure.skillPoint", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x687da6244723bd23L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e455dcac-8b71-4321-af74-92e2e91d6b66(GiML.structure)/7529356826778226387");
    b.version(2);
    b.property("score", 0x687da62447474ed6L).type(PrimitiveTypeId.INTEGER).origin("7529356826778226390").done();
    b.alias("skillPoint");
    return b.create();
  }
}
