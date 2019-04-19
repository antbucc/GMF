package GiML.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int ChallengeAssignment = 0;
  public static final int ChallengeInstance = 1;
  public static final int ChallengeVariableAssignment = 2;
  public static final int Environment = 3;
  public static final int Execution = 4;
  public static final int GameInstance = 5;
  public static final int TeamState = 6;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x8c6624b06c1e43b4L, 0xb7ca7509cedad45bL);
    builder.put(0x34b4aa922165930aL, ChallengeAssignment);
    builder.put(0x34b4aa9221659304L, ChallengeInstance);
    builder.put(0x34b4aa9221659377L, ChallengeVariableAssignment);
    builder.put(0x34b4aa92216592f1L, Environment);
    builder.put(0x19b939282e29bb40L, Execution);
    builder.put(0x19b939282e29bb24L, GameInstance);
    builder.put(0x34b4aa92216592f5L, TeamState);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
