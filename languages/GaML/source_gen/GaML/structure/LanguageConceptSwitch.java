package GaML.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Classes = 0;
  public static final int Count = 1;
  public static final int Distance = 2;
  public static final int Game = 3;
  public static final int Trips = 4;
  public static final int tripAction = 5;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x1472546da96448a0L, 0xa11e4271b165a42cL);
    builder.put(0x34b4aa922167ad21L, Classes);
    builder.put(0x34b4aa922167ad19L, Count);
    builder.put(0x34b4aa922167ad1dL, Distance);
    builder.put(0x3eecc86bd03861a4L, Game);
    builder.put(0x34b4aa922167ad14L, Trips);
    builder.put(0x5d61ef6eeb9c76c4L, tripAction);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
