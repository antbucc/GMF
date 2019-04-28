package GsML.structure;

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

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptChallengeInstance = createDescriptorForChallengeInstance();
  /*package*/ final ConceptDescriptor myConceptGameSimulation = createDescriptorForGameSimulation();
  /*package*/ final ConceptDescriptor myConceptSingleGameExecution = createDescriptorForSingleGameExecution();
  /*package*/ final ConceptDescriptor myConceptdataDrivenActionInstance = createDescriptorFordataDrivenActionInstance();
  /*package*/ final ConceptDescriptor myConcepteventDrivenActionInstance = createDescriptorForeventDrivenActionInstance();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptChallengeInstance, myConceptGameSimulation, myConceptSingleGameExecution, myConceptdataDrivenActionInstance, myConcepteventDrivenActionInstance);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.ChallengeInstance:
        return myConceptChallengeInstance;
      case LanguageConceptSwitch.GameSimulation:
        return myConceptGameSimulation;
      case LanguageConceptSwitch.SingleGameExecution:
        return myConceptSingleGameExecution;
      case LanguageConceptSwitch.dataDrivenActionInstance:
        return myConceptdataDrivenActionInstance;
      case LanguageConceptSwitch.eventDrivenActionInstance:
        return myConcepteventDrivenActionInstance;
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

  private static ConceptDescriptor createDescriptorForChallengeInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GsML", "ChallengeInstance", 0xccf661bc5b134fdfL, 0xb6a9b009db30480fL, 0x19b939282ec33ec9L);
    b.class_(false, false, false);
    b.origin("r:20ea7de0-196a-4f4b-a486-b4e701f098a2(GsML.structure)/1853575566385692361");
    b.version(2);
    b.associate("challengeType", 0x19b939282ec33ecdL).target(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L, 0x3eecc86bd037b7b3L).optional(false).origin("1853575566385692365").done();
    b.aggregate("data", 0x19b939282ec33ecaL).target(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L).optional(true).ordered(true).multiple(false).origin("1853575566385692362").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForGameSimulation() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GsML", "GameSimulation", 0xccf661bc5b134fdfL, 0xb6a9b009db30480fL, 0x19b939282eb4c146L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:20ea7de0-196a-4f4b-a486-b4e701f098a2(GsML.structure)/1853575566384742726");
    b.version(2);
    b.associate("gameInstance", 0x19b939282ec33ed2L).target(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x23eac9cba952c550L).optional(false).origin("1853575566385692370").done();
    b.aggregate("listOfExecutions", 0x19b939282ec33ed5L).target(0xccf661bc5b134fdfL, 0xb6a9b009db30480fL, 0x19b939282ec33eb0L).optional(false).ordered(true).multiple(true).origin("1853575566385692373").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSingleGameExecution() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GsML", "SingleGameExecution", 0xccf661bc5b134fdfL, 0xb6a9b009db30480fL, 0x19b939282ec33eb0L);
    b.class_(false, false, false);
    b.origin("r:20ea7de0-196a-4f4b-a486-b4e701f098a2(GsML.structure)/1853575566385692336");
    b.version(2);
    b.associate("teamInstance", 0x19b939282ec33eb1L).target(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x19b939282ee5702bL).optional(false).origin("1853575566385692337").done();
    b.associate("dataActionInstance", 0x19b939282ec33eb9L).target(0xccf661bc5b134fdfL, 0xb6a9b009db30480fL, 0x19b939282ec33ec0L).optional(true).origin("1853575566385692345").done();
    b.associate("eventActionIstance", 0x19b939282ec33f24L).target(0xccf661bc5b134fdfL, 0xb6a9b009db30480fL, 0x19b939282ec33f23L).optional(true).origin("1853575566385692452").done();
    b.associate("challengeInstance", 0x19b939282ec33f0cL).target(0xccf661bc5b134fdfL, 0xb6a9b009db30480fL, 0x19b939282ec33ec9L).optional(true).origin("1853575566385692428").done();
    b.alias("singleGameExecution");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorFordataDrivenActionInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GsML", "dataDrivenActionInstance", 0xccf661bc5b134fdfL, 0xb6a9b009db30480fL, 0x19b939282ec33ec0L);
    b.class_(false, false, false);
    b.super_("GaML.structure.dataDrivenAction", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x5d61ef6eeb9c76c4L);
    b.origin("r:20ea7de0-196a-4f4b-a486-b4e701f098a2(GsML.structure)/1853575566385692352");
    b.version(2);
    b.aggregate("data", 0x19b939282ec33ec1L).target(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac548L).optional(false).ordered(true).multiple(false).origin("1853575566385692353").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForeventDrivenActionInstance() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("GsML", "eventDrivenActionInstance", 0xccf661bc5b134fdfL, 0xb6a9b009db30480fL, 0x19b939282ec33f23L);
    b.class_(false, false, false);
    b.super_("GaML.structure.eventDrivenAction", 0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x23eac9cba9555d7eL);
    b.origin("r:20ea7de0-196a-4f4b-a486-b4e701f098a2(GsML.structure)/1853575566385692451");
    b.version(2);
    return b.create();
  }
}
