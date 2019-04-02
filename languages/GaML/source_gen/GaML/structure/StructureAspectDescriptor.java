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
  /*package*/ final ConceptDescriptor myConceptGame = createDescriptorForGame();
  /*package*/ final ConceptDescriptor myConceptscuolaSenzAuto = createDescriptorForscuolaSenzAuto();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptGame, myConceptscuolaSenzAuto);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Game:
        return myConceptGame;
      case LanguageConceptSwitch.scuolaSenzAuto:
        return myConceptscuolaSenzAuto;
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

  private static ConceptDescriptor createDescriptorForGame() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "Game", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x3eecc86bd03861a4L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/4534219290235658660");
    b.version(2);
    b.property("id", 0x3eecc86bd0389f79L).type(PrimitiveTypeId.STRING).origin("4534219290235674489").done();
    b.property("domain", 0x3eecc86bd0389f7bL).type(PrimitiveTypeId.STRING).origin("4534219290235674491").done();
    b.property("owner", 0x3eecc86bd0389f7eL).type(PrimitiveTypeId.STRING).origin("4534219290235674494").done();
    b.aggregate("actions", 0x3eecc86bd03886acL).target(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd0379cf3L).optional(true).ordered(true).multiple(true).origin("4534219290235668140").done();
    b.aggregate("badgeCollections", 0x3eecc86bd03886aaL).target(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6e9L).optional(true).ordered(true).multiple(true).origin("4534219290235668138").done();
    b.aggregate("points", 0x3eecc86bd03886afL).target(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a6b1L).optional(true).ordered(true).multiple(true).origin("4534219290235668143").done();
    b.aggregate("rules", 0x3eecc86bd0389f74L).target(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037a723L).optional(true).ordered(true).multiple(true).origin("4534219290235674484").done();
    b.alias("game");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForscuolaSenzAuto() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GaML", "scuolaSenzAuto", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x34b4aa9221659316L);
    b.class_(false, false, false);
    b.origin("r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)/3797847930382422806");
    b.version(2);
    b.alias("scuolaSenzAuto");
    return b.create();
  }
}
