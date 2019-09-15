package GameData.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new BonusPointType_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new ChallengeData_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new GameDataType_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new bonusScore_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new legNameType_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }



  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a5L), MetaIdFactory.conceptId(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L), MetaIdFactory.conceptId(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x23eac9cba8f42c9dL), MetaIdFactory.conceptId(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5b0L), MetaIdFactory.conceptId(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5eaL)).seal();
}
