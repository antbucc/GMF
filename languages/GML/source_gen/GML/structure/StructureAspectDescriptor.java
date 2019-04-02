package GML.structure;

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
  /*package*/ final ConceptDescriptor myConceptAction = createDescriptorForAction();
  /*package*/ final ConceptDescriptor myConceptBadge = createDescriptorForBadge();
  /*package*/ final ConceptDescriptor myConceptBadgeCollection = createDescriptorForBadgeCollection();
  /*package*/ final ConceptDescriptor myConceptChallenge = createDescriptorForChallenge();
  /*package*/ final ConceptDescriptor myConceptGameConcept = createDescriptorForGameConcept();
  /*package*/ final ConceptDescriptor myConceptLevel = createDescriptorForLevel();
  /*package*/ final ConceptDescriptor myConceptPeriod = createDescriptorForPeriod();
  /*package*/ final ConceptDescriptor myConceptPlayer = createDescriptorForPlayer();
  /*package*/ final ConceptDescriptor myConceptPoint = createDescriptorForPoint();
  /*package*/ final ConceptDescriptor myConceptRule = createDescriptorForRule();
  /*package*/ final ConceptDescriptor myConceptTeam = createDescriptorForTeam();
  /*package*/ final ConceptDescriptor myConceptchallengeVariable = createDescriptorForchallengeVariable();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAction, myConceptBadge, myConceptBadgeCollection, myConceptChallenge, myConceptGameConcept, myConceptLevel, myConceptPeriod, myConceptPlayer, myConceptPoint, myConceptRule, myConceptTeam, myConceptchallengeVariable);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Action:
        return myConceptAction;
      case LanguageConceptSwitch.Badge:
        return myConceptBadge;
      case LanguageConceptSwitch.BadgeCollection:
        return myConceptBadgeCollection;
      case LanguageConceptSwitch.Challenge:
        return myConceptChallenge;
      case LanguageConceptSwitch.GameConcept:
        return myConceptGameConcept;
      case LanguageConceptSwitch.Level:
        return myConceptLevel;
      case LanguageConceptSwitch.Period:
        return myConceptPeriod;
      case LanguageConceptSwitch.Player:
        return myConceptPlayer;
      case LanguageConceptSwitch.Point:
        return myConceptPoint;
      case LanguageConceptSwitch.Rule:
        return myConceptRule;
      case LanguageConceptSwitch.Team:
        return myConceptTeam;
      case LanguageConceptSwitch.challengeVariable:
        return myConceptchallengeVariable;
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

  private static ConceptDescriptor createDescriptorForAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GML", "Action", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd0379cf3L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:23080719-0c76-4e9e-8c0c-a8d86a3fa0ac(GML.structure)/4534219290235608307");
    b.version(2);
    b.property("id", 0x3eecc86bd0379d02L).type(PrimitiveTypeId.STRING).origin("4534219290235608322").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBadge() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GML", "Badge", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6e2L);
    b.class_(false, false, false);
    b.super_("GML.structure.GameConcept", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6deL);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:23080719-0c76-4e9e-8c0c-a8d86a3fa0ac(GML.structure)/4534219290235610850");
    b.version(2);
    b.property("icon", 0x3eecc86bd037a6e6L).type(PrimitiveTypeId.STRING).origin("4534219290235610854").done();
    b.alias("badge");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBadgeCollection() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GML", "BadgeCollection", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6e9L);
    b.class_(false, false, true);
    b.super_("GML.structure.GameConcept", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6deL);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:23080719-0c76-4e9e-8c0c-a8d86a3fa0ac(GML.structure)/4534219290235610857");
    b.version(2);
    b.aggregate("badgesEarned", 0x3eecc86bd037a6edL).target(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6e2L).optional(true).ordered(true).multiple(true).origin("4534219290235610861").done();
    b.alias("badgeCollection");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForChallenge() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GML", "Challenge", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037b7b3L);
    b.class_(false, false, false);
    b.super_("GML.structure.GameConcept", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6deL);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:23080719-0c76-4e9e-8c0c-a8d86a3fa0ac(GML.structure)/4534219290235615155");
    b.version(2);
    b.property("modelName", 0x3eecc86bd037c8f1L).type(PrimitiveTypeId.STRING).origin("4534219290235619569").done();
    b.property("startDate", 0x3eecc86bd037c8f4L).type(PrimitiveTypeId.STRING).origin("4534219290235619572").done();
    b.property("endDate", 0x3eecc86bd037c8f9L).type(PrimitiveTypeId.STRING).origin("4534219290235619577").done();
    b.property("completed", 0x3eecc86bd037c900L).type(PrimitiveTypeId.BOOLEAN).origin("4534219290235619584").done();
    b.aggregate("variables", 0x34b4aa9221659374L).target(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x34b4aa9221659370L).optional(true).ordered(true).multiple(true).origin("3797847930382422900").done();
    b.alias("challenge");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForGameConcept() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GML", "GameConcept", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6deL);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:23080719-0c76-4e9e-8c0c-a8d86a3fa0ac(GML.structure)/4534219290235610846");
    b.version(2);
    b.property("id", 0x3eecc86bd037a6f0L).type(PrimitiveTypeId.STRING).origin("4534219290235610864").done();
    b.alias("gameConcept");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForLevel() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GML", "Level", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd0381350L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:23080719-0c76-4e9e-8c0c-a8d86a3fa0ac(GML.structure)/4534219290235638608");
    b.version(2);
    b.aggregate("pointConcept", 0x3eecc86bd0381357L).target(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6b1L).optional(false).ordered(true).multiple(false).origin("4534219290235638615").done();
    b.alias("level");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPeriod() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GML", "Period", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6bcL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:23080719-0c76-4e9e-8c0c-a8d86a3fa0ac(GML.structure)/4534219290235610812");
    b.version(2);
    b.property("start", 0x3eecc86bd037a6c0L).type(PrimitiveTypeId.STRING).origin("4534219290235610816").done();
    b.property("period", 0x3eecc86bd037a6c3L).type(PrimitiveTypeId.INTEGER).origin("4534219290235610819").done();
    b.property("capacity", 0x3eecc86bd037a6c8L).type(PrimitiveTypeId.INTEGER).origin("4534219290235610824").done();
    b.alias("period");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPlayer() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GML", "Player", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a739L);
    b.class_(false, false, false);
    b.origin("r:23080719-0c76-4e9e-8c0c-a8d86a3fa0ac(GML.structure)/4534219290235610937");
    b.version(2);
    b.property("id", 0x3eecc86bd037a73aL).type(PrimitiveTypeId.STRING).origin("4534219290235610938").done();
    b.property("team", 0x3eecc86bd037a73dL).type(PrimitiveTypeId.BOOLEAN).origin("4534219290235610941").done();
    b.property("totalMembers", 0x3eecc86bd037a742L).type(PrimitiveTypeId.INTEGER).origin("4534219290235610946").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPoint() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GML", "Point", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6b1L);
    b.class_(false, false, false);
    b.super_("GML.structure.GameConcept", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6deL);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:23080719-0c76-4e9e-8c0c-a8d86a3fa0ac(GML.structure)/4534219290235610801");
    b.version(2);
    b.property("score", 0x3eecc86bd037e1acL).type(PrimitiveTypeId.INTEGER).origin("4534219290235625900").done();
    b.aggregate("periods", 0x3eecc86bd037e1afL).target(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6bcL).optional(true).ordered(true).multiple(true).origin("4534219290235625903").done();
    b.alias("point");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRule() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GML", "Rule", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a723L);
    b.class_(false, false, false);
    b.origin("r:23080719-0c76-4e9e-8c0c-a8d86a3fa0ac(GML.structure)/4534219290235610915");
    b.version(2);
    b.property("gameId", 0x3eecc86bd037a724L).type(PrimitiveTypeId.STRING).origin("4534219290235610916").done();
    b.alias("rule");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTeam() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GML", "Team", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a735L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:23080719-0c76-4e9e-8c0c-a8d86a3fa0ac(GML.structure)/4534219290235610933");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForchallengeVariable() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GML", "challengeVariable", 0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x34b4aa9221659370L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:23080719-0c76-4e9e-8c0c-a8d86a3fa0ac(GML.structure)/3797847930382422896");
    b.version(2);
    b.alias("challengevariable");
    return b.create();
  }
}
