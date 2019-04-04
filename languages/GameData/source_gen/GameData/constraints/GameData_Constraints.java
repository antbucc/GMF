package GameData.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.runtime.ConstraintFunction;
import jetbrains.mps.smodel.runtime.ConstraintContext_CanBeChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SNodePointer;

public class GameData_Constraints extends BaseConstraintsDescriptor {
  public GameData_Constraints() {
    super(MetaAdapterFactory.getConcept(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac548L, "GameData.structure.GameData"));
  }

  @Override
  protected ConstraintFunction<ConstraintContext_CanBeChild, Boolean> calculateCanBeChildConstraint() {
    return new ConstraintFunction<ConstraintContext_CanBeChild, Boolean>() {
      @NotNull
      public Boolean invoke(@NotNull ConstraintContext_CanBeChild context, @Nullable CheckingNodeContext checkingNodeContext) {
        boolean result = staticCanBeAChild(context.getNode(), context.getParentNode(), context.getConcept(), context.getLink());

        if (!(result) && checkingNodeContext != null) {
          checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
        }

        return result;
      }
    };
  }
  private static boolean staticCanBeAChild(final SNode node, SNode parentNode, SAbstractConcept childConcept, SContainmentLink link) {
    if (SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x5d61ef6eeb9c76c4L, "GaML.structure.tripAction"))) {
      Iterable<SNode> dataList = ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(parentNode, MetaAdapterFactory.getConcept(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x5d61ef6eeb9c76c4L, "GaML.structure.tripAction")), MetaAdapterFactory.getContainmentLink(0x1472546da96448a0L, 0xa11e4271b165a42cL, 0x5d61ef6eeb9c76c4L, 0x23eac9cba8f3d39cL, "data"))).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac548L, 0x23eac9cba8f42c9eL, "dataType")) == SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac548L, 0x23eac9cba8f42c9eL, "dataType"));
        }
      });
      return Sequence.fromIterable(dataList).isEmpty();
    }
    return true;
  }
  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:15943eb5-e32e-463c-866f-5c1a9e040a95(GameData.constraints)", "3655794965912021787");
}
