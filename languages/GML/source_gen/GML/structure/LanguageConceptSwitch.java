package GML.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Action = 0;
  public static final int Badge = 1;
  public static final int BadgeCollection = 2;
  public static final int Challenge = 3;
  public static final int Game = 4;
  public static final int Level = 5;
  public static final int Period = 6;
  public static final int Player = 7;
  public static final int Point = 8;
  public static final int Team = 9;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xbc08d5ab032d46dcL, 0x996446504a89c9c8L);
    builder.put(0x3eecc86bd0379cf3L, Action);
    builder.put(0x3eecc86bd037a6e2L, Badge);
    builder.put(0x3eecc86bd037a6e9L, BadgeCollection);
    builder.put(0x3eecc86bd037b7b3L, Challenge);
    builder.put(0x3eecc86bd03861a4L, Game);
    builder.put(0x3eecc86bd0381350L, Level);
    builder.put(0x3eecc86bd037a6bcL, Period);
    builder.put(0x3eecc86bd037a739L, Player);
    builder.put(0x3eecc86bd037a6b1L, Point);
    builder.put(0x3eecc86bd037a735L, Team);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
