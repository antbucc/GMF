package GmML.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int BadgeCollectionConceptState = 0;
  public static final int BadgeState = 1;
  public static final int ChallengeConceptState = 2;
  public static final int ChallengeFieldState = 3;
  public static final int DailyInstanceState = 4;
  public static final int DailyPeriodState = 5;
  public static final int Monitor = 6;
  public static final int PlayerState = 7;
  public static final int PointConceptState = 8;
  public static final int PointPeriodState = 9;
  public static final int State = 10;
  public static final int WeeklyInstanceState = 11;
  public static final int WeeklyPeriodState = 12;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xae7671b208ec4cb3L, 0xbda2147e5e095aeaL);
    builder.put(0x16a9394b340dbf8eL, BadgeCollectionConceptState);
    builder.put(0x16a9394b340e6ea6L, BadgeState);
    builder.put(0x7b087e04605a4d93L, ChallengeConceptState);
    builder.put(0x7b087e04608b2cf7L, ChallengeFieldState);
    builder.put(0x7b087e04612db3f7L, DailyInstanceState);
    builder.put(0x7b087e04612d4c03L, DailyPeriodState);
    builder.put(0x3488dc45bc5907f5L, Monitor);
    builder.put(0x16a9394b31c1a45bL, PlayerState);
    builder.put(0x16a9394b335a4da5L, PointConceptState);
    builder.put(0x7b087e04612d0cbcL, PointPeriodState);
    builder.put(0x16a9394b335a44d7L, State);
    builder.put(0x7b087e04612de368L, WeeklyInstanceState);
    builder.put(0x7b087e04612d5996L, WeeklyPeriodState);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
