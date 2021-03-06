package GameData.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SEmptyContainmentSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class ChallengeData_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public ChallengeData_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_0();
  }

  private EditorCell createCollection_0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_48cerj_a");
    editorCell.setBig(true);
    setCellContext(editorCell);
    editorCell.addEditorCell(createConstant_0());
    editorCell.addEditorCell(createConstant_1());
    editorCell.addEditorCell(createCollection_1());
    editorCell.addEditorCell(createConstant_16());
    return editorCell;
  }
  private EditorCell createConstant_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "challenge data");
    editorCell.setCellId("Constant_48cerj_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_1() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "{");
    editorCell.setCellId("Constant_48cerj_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.MATCHING_LABEL, "body-brace");
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_1() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_48cerj_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_2());
    editorCell.addEditorCell(createConstant_3());
    editorCell.addEditorCell(createRefNode_0());
    editorCell.addEditorCell(createConstant_4());
    editorCell.addEditorCell(createConstant_5());
    editorCell.addEditorCell(createConstant_6());
    editorCell.addEditorCell(createRefNode_1());
    editorCell.addEditorCell(createConstant_7());
    editorCell.addEditorCell(createConstant_8());
    editorCell.addEditorCell(createConstant_9());
    editorCell.addEditorCell(createRefNode_2());
    editorCell.addEditorCell(createConstant_10());
    editorCell.addEditorCell(createConstant_11());
    editorCell.addEditorCell(createConstant_12());
    editorCell.addEditorCell(createRefNode_3());
    editorCell.addEditorCell(createConstant_13());
    editorCell.addEditorCell(createConstant_14());
    editorCell.addEditorCell(createConstant_15());
    editorCell.addEditorCell(createRefNode_4());
    return editorCell;
  }
  private EditorCell createConstant_2() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "bonus score");
    editorCell.setCellId("Constant_48cerj_a2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_3() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_48cerj_b2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_0() {
    SingleRoleCellProvider provider = new ChallengeData_EditorBuilder_a.bonusScoreSingleRoleHandler_48cerj_c2a(myNode, MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5adL, "bonusScore"), getEditorContext());
    return provider.createCell();
  }
  private static class bonusScoreSingleRoleHandler_48cerj_c2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public bonusScoreSingleRoleHandler_48cerj_c2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5adL, "bonusScore"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5adL, "bonusScore"), child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5adL, "bonusScore"));
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5adL, "bonusScore")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_bonusScore");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no bonusScore>";
    }
  }
  private EditorCell createConstant_4() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_48cerj_d2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_5() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "bonus point type");
    editorCell.setCellId("Constant_48cerj_e2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_6() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_48cerj_f2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_1() {
    SingleRoleCellProvider provider = new ChallengeData_EditorBuilder_a.bonusPointTypeSingleRoleHandler_48cerj_g2a(myNode, MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5c2L, "bonusPointType"), getEditorContext());
    return provider.createCell();
  }
  private static class bonusPointTypeSingleRoleHandler_48cerj_g2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public bonusPointTypeSingleRoleHandler_48cerj_g2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5c2L, "bonusPointType"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5c2L, "bonusPointType"), child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5c2L, "bonusPointType"));
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5c2L, "bonusPointType")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_bonusPointType");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no bonusPointType>";
    }
  }
  private EditorCell createConstant_7() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_48cerj_h2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_8() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "virtual price");
    editorCell.setCellId("Constant_48cerj_i2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_9() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_48cerj_j2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_2() {
    SingleRoleCellProvider provider = new ChallengeData_EditorBuilder_a.virtualPriceSingleRoleHandler_48cerj_k2a(myNode, MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5c7L, "virtualPrice"), getEditorContext());
    return provider.createCell();
  }
  private static class virtualPriceSingleRoleHandler_48cerj_k2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public virtualPriceSingleRoleHandler_48cerj_k2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5c7L, "virtualPrice"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5c7L, "virtualPrice"), child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5c7L, "virtualPrice"));
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5c7L, "virtualPrice")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_virtualPrice");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no virtualPrice>";
    }
  }
  private EditorCell createConstant_10() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_48cerj_l2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_11() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "prize won");
    editorCell.setCellId("Constant_48cerj_m2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_12() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_48cerj_n2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_3() {
    SingleRoleCellProvider provider = new ChallengeData_EditorBuilder_a.prizeWonSingleRoleHandler_48cerj_o2a(myNode, MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5ceL, "prizeWon"), getEditorContext());
    return provider.createCell();
  }
  private static class prizeWonSingleRoleHandler_48cerj_o2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public prizeWonSingleRoleHandler_48cerj_o2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5ceL, "prizeWon"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5ceL, "prizeWon"), child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5ceL, "prizeWon"));
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5ceL, "prizeWon")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_prizeWon");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no prizeWon>";
    }
  }
  private EditorCell createConstant_13() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_48cerj_p2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_14() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "leg name");
    editorCell.setCellId("Constant_48cerj_q2a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_15() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_48cerj_r2a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_4() {
    SingleRoleCellProvider provider = new ChallengeData_EditorBuilder_a.legNameSingleRoleHandler_48cerj_s2a(myNode, MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5eeL, "legName"), getEditorContext());
    return provider.createCell();
  }
  private static class legNameSingleRoleHandler_48cerj_s2a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public legNameSingleRoleHandler_48cerj_s2a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5eeL, "legName"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5eeL, "legName"), child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5eeL, "legName"));
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0xdc26d82528834e88L, 0x933cf0e9f65c69c4L, 0x5d61ef6eeb9ac5a9L, 0x5d61ef6eeb9ac5eeL, "legName")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_legName");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no legName>";
    }
  }
  private EditorCell createConstant_16() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "}");
    editorCell.setCellId("Constant_48cerj_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.MATCHING_LABEL, "body-brace");
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
