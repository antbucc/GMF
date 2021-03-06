package GiML.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new BadgeCollectionInstance_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new BadgeInstance_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new ChallengeVariable_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new ClassroomInstance_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new DomainInstance_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new GameInstance_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new InstituteInstance_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new SchoolInstance_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new SinglePlayerChallengeInstance_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new StudentInstance_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new dataDrivenActionInstance_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new eventDrivenActionInstance_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new experiencePointInstance_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new istanzaDashboard_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new skillPointInstance_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex1.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new BadgeInstance_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da624477a6c9aL), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x60acec85f65c7fe2L), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da6244782eef7L), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daad26af7L), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa2bdd31L), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x19b939282ee57042L), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa757c14L), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x29c2332daa80e68dL), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da6244782caa1L), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x548347b052b52548L), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da624474faca0L), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da624474faca3L), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da6244723bd21L), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x3b9018d1b0e7cb07L), MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x687da62447474ed3L)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x119e117f12604f12L, 0xb46eefd3d0e4c44fL, 0x60acec85f65c7fe2L)).seal();
}
