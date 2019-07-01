package GaML.structure;

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
  /*package*/ final ConceptDescriptor myConceptClassroom = createDescriptorForClassroom();
  /*package*/ final ConceptDescriptor myConceptComplexTeam = createDescriptorForComplexTeam();
  /*package*/ final ConceptDescriptor myConceptDashboard = createDescriptorForDashboard();
  /*package*/ final ConceptDescriptor myConceptDomain = createDescriptorForDomain();
  /*package*/ final ConceptDescriptor myConceptGameDefinition = createDescriptorForGameDefinition();
  /*package*/ final ConceptDescriptor myConceptInstitute = createDescriptorForInstitute();
  /*package*/ final ConceptDescriptor myConceptSchool = createDescriptorForSchool();
  /*package*/ final ConceptDescriptor myConceptSinglePlayerChallenge = createDescriptorForSinglePlayerChallenge();
  /*package*/ final ConceptDescriptor myConceptStudent = createDescriptorForStudent();
  /*package*/ final ConceptDescriptor myConceptVolontario = createDescriptorForVolontario();
  /*package*/ final ConceptDescriptor myConceptdataDrivenAction = createDescriptorFordataDrivenAction();
  /*package*/ final ConceptDescriptor myConcepteventDrivenAction = createDescriptorForeventDrivenAction();
  /*package*/ final ConceptDescriptor myConceptexperiencePoint = createDescriptorForexperiencePoint();
  /*package*/ final ConceptDescriptor myConceptskillPoint = createDescriptorForskillPoint();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, "GML");
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
    deps.aggregatedLanguage(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, "GML");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptClassroom, myConceptComplexTeam, myConceptDashboard, myConceptDomain, myConceptGameDefinition, myConceptInstitute, myConceptSchool, myConceptSinglePlayerChallenge, myConceptStudent, myConceptVolontario, myConceptdataDrivenAction, myConcepteventDrivenAction, myConceptexperiencePoint, myConceptskillPoint);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Classroom:
        return myConceptClassroom;
      case LanguageConceptSwitch.ComplexTeam:
        return myConceptComplexTeam;
      case LanguageConceptSwitch.Dashboard:
        return myConceptDashboard;
      case LanguageConceptSwitch.Domain:
        return myConceptDomain;
      case LanguageConceptSwitch.GameDefinition:
        return myConceptGameDefinition;
      case LanguageConceptSwitch.Institute:
        return myConceptInstitute;
      case LanguageConceptSwitch.School:
        return myConceptSchool;
      case LanguageConceptSwitch.SinglePlayerChallenge:
        return myConceptSinglePlayerChallenge;
      case LanguageConceptSwitch.Student:
        return myConceptStudent;
      case LanguageConceptSwitch.Volontario:
        return myConceptVolontario;
      case LanguageConceptSwitch.dataDrivenAction:
        return myConceptdataDrivenAction;
      case LanguageConceptSwitch.eventDrivenAction:
        return myConcepteventDrivenAction;
      case LanguageConceptSwitch.experiencePoint:
        return myConceptexperiencePoint;
      case LanguageConceptSwitch.skillPoint:
        return myConceptskillPoint;
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

  private static ConceptDescriptor createDescriptorForClassroom() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "Classroom", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe319L);
    b.class_(false, false, false);
    b.super_("GaML.structure.ComplexTeam", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x59f01faab33d1304L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/1242463862027969305");
    b.version(2);
    b.associate("school", 0x29c2332daad6c41eL).target(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x29c2332daa804ab6L).optional(false).origin("3009023772269659166").done();
    b.alias("classroom");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForComplexTeam() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "ComplexTeam", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x59f01faab33d1304L);
    b.class_(false, false, false);
    b.super_("GML.structure.Team", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a735L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/6480714681798169348");
    b.version(2);
    b.aggregate("teams", 0x59f01faab33d1312L).target(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a735L).optional(true).ordered(true).multiple(true).origin("6480714681798169362").done();
    b.alias("complexTram");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDashboard() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "Dashboard", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x3b9018d1b0e7cb00L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/4291957733779294976");
    b.version(2);
    b.alias("dashboard");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDomain() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "Domain", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe2d9L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/1242463862027969241");
    b.version(2);
    b.alias("domain");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForGameDefinition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "GameDefinition", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x23eac9cba952c550L);
    b.class_(false, false, true);
    b.super_("GML.structure.Game", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd03861a4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/2588102812434089296");
    b.version(2);
    b.property("description", 0x113e1e4cb66fe323L).type(PrimitiveTypeId.STRING).origin("1242463862027969315").done();
    b.associate("school", 0x29c2332daaea3e3fL).target(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x29c2332daa804ab6L).optional(false).origin("3009023772270935615").done();
    b.alias("gameDefinition");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInstitute() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "Institute", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe312L);
    b.class_(false, false, false);
    b.super_("GaML.structure.ComplexTeam", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x59f01faab33d1304L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/1242463862027969298");
    b.version(2);
    b.associate("domain", 0x29c2332daaaaee9aL).target(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe2d9L).optional(false).origin("3009023772266786458").done();
    b.aggregate("schools", 0x29c2332daabd2eecL).target(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x29c2332daa804ab6L).optional(true).ordered(true).multiple(true).origin("3009023772267982572").done();
    b.alias("institute");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSchool() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "School", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x29c2332daa804ab6L);
    b.class_(false, false, false);
    b.super_("GaML.structure.ComplexTeam", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x59f01faab33d1304L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/3009023772263991990");
    b.version(2);
    b.associate("institute", 0x29c2332daaaaee97L).target(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe312L).optional(false).origin("3009023772266786455").done();
    b.aggregate("classes", 0x29c2332daacc1750L).target(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe319L).optional(true).ordered(true).multiple(true).origin("3009023772268959568").done();
    b.aggregate("alumni", 0x29c2332daacc1754L).target(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe31eL).optional(true).ordered(true).multiple(true).origin("3009023772268959572").done();
    b.aggregate("volounteers", 0x29c2332daacc1759L).target(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x29c2332daacc174dL).optional(true).ordered(true).multiple(true).origin("3009023772268959577").done();
    b.alias("school");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSinglePlayerChallenge() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "SinglePlayerChallenge", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x687da6244782ca9eL);
    b.class_(false, false, true);
    b.super_("GML.structure.Challenge", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037b7b3L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/7529356826782124702");
    b.version(2);
    b.alias("challengeModel");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForStudent() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "Student", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe31eL);
    b.class_(false, false, true);
    b.super_("GML.structure.Player", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a739L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/1242463862027969310");
    b.version(2);
    b.associate("classRoom", 0x548347b052b52557L).target(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x113e1e4cb66fe319L).optional(false).origin("6089789943762462039").done();
    b.alias("student");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForVolontario() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "Volontario", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x29c2332daacc174dL);
    b.class_(false, false, false);
    b.super_("GML.structure.Player", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a739L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/3009023772268959565");
    b.version(2);
    b.alias("volontario");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorFordataDrivenAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "dataDrivenAction", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x687da624474fac98L);
    b.class_(false, false, true);
    b.super_("GML.structure.Action", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd0379cf3L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/7529356826778774680");
    b.version(2);
    b.alias("dataDrivenAction");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForeventDrivenAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "eventDrivenAction", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x687da624474fac9bL);
    b.class_(false, false, true);
    b.super_("GML.structure.Action", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd0379cf3L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/7529356826778774683");
    b.version(2);
    b.alias("eventDrivenAction");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForexperiencePoint() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "experiencePoint", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x687da6244723bd22L);
    b.class_(false, false, true);
    b.super_("GML.structure.Point", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6b1L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/7529356826775895330");
    b.version(2);
    b.alias("experiencePoint");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForskillPoint() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "skillPoint", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x687da6244723bd23L);
    b.class_(false, false, true);
    b.super_("GML.structure.Point", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6b1L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/7529356826775895331");
    b.version(2);
    b.alias("skillPoint");
    return b.create();
  }
}
