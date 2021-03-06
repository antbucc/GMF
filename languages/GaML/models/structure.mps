<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:7b2e49c1-57f5-42cc-8477-7c9fe4bb9db4(GaML.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="7" />
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="mupf" ref="r:23080719-0c76-4e9e-8c0c-a8d86a3fa0ac(GML.structure)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <property id="5092175715804935370" name="conceptAlias" index="34LRSv" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="2fEMsIDkGlg">
    <property role="EcuMT" value="2588102812434089296" />
    <property role="TrG5h" value="GameDefinition" />
    <property role="19KtqR" value="true" />
    <property role="34LRSv" value="gameDefinition" />
    <ref role="1TJDcQ" to="mupf:3VGM6Jge66$" resolve="Game" />
    <node concept="1TJgyi" id="14Y7$MQrYcz" role="1TKVEl">
      <property role="IQ2nx" value="1242463862027969315" />
      <property role="TrG5h" value="description" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="2B2cMQEUzSZ" role="1TKVEi">
      <property role="IQ2ns" value="3009023772270935615" />
      <property role="20lmBu" value="reference" />
      <property role="20kJfa" value="school" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="2B2cMQEw4EQ" resolve="School" />
    </node>
  </node>
  <node concept="1TIwiD" id="5BK7UENfhc4">
    <property role="EcuMT" value="6480714681798169348" />
    <property role="TrG5h" value="ComplexTeam" />
    <property role="34LRSv" value="complexTeam" />
    <ref role="1TJDcQ" to="mupf:3VGM6JgdUsP" resolve="Team" />
    <node concept="PrWs8" id="5BK7UENfhc5" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="5BK7UENfhci" role="1TKVEi">
      <property role="IQ2ns" value="6480714681798169362" />
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="teams" />
      <property role="20lbJX" value="0..n" />
      <ref role="20lvS9" to="mupf:3VGM6JgdUsP" resolve="Team" />
    </node>
  </node>
  <node concept="1TIwiD" id="14Y7$MQrYci">
    <property role="EcuMT" value="1242463862027969298" />
    <property role="TrG5h" value="Institute" />
    <property role="34LRSv" value="institute" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" node="5BK7UENfhc4" resolve="ComplexTeam" />
    <node concept="PrWs8" id="14Y7$MQrYcj" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="2B2cMQEEIUq" role="1TKVEi">
      <property role="IQ2ns" value="3009023772266786458" />
      <property role="20lmBu" value="reference" />
      <property role="20kJfa" value="domain" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="62GV8nRv2m3" resolve="Domain" />
    </node>
    <node concept="1TJgyj" id="2B2cMQEJiVG" role="1TKVEi">
      <property role="IQ2ns" value="3009023772267982572" />
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="schools" />
      <property role="20lbJX" value="0..n" />
      <ref role="20lvS9" node="2B2cMQEw4EQ" resolve="School" />
    </node>
  </node>
  <node concept="1TIwiD" id="14Y7$MQrYcp">
    <property role="EcuMT" value="1242463862027969305" />
    <property role="TrG5h" value="Classroom" />
    <property role="34LRSv" value="classroom" />
    <ref role="1TJDcQ" node="5BK7UENfhc4" resolve="ComplexTeam" />
    <node concept="PrWs8" id="14Y7$MQrYcq" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="14Y7$MQrYcu">
    <property role="EcuMT" value="1242463862027969310" />
    <property role="TrG5h" value="Student" />
    <property role="34LRSv" value="student" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="mupf:3VGM6JgdUsT" resolve="Player" />
    <node concept="PrWs8" id="14Y7$MQrYcv" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="5i3hV1iHiln" role="1TKVEi">
      <property role="IQ2ns" value="6089789943762462039" />
      <property role="20lmBu" value="reference" />
      <property role="20kJfa" value="classRoom" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="14Y7$MQrYcp" resolve="Classroom" />
    </node>
  </node>
  <node concept="1TIwiD" id="2B2cMQEw4EQ">
    <property role="EcuMT" value="3009023772263991990" />
    <property role="TrG5h" value="School" />
    <property role="34LRSv" value="school" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" node="5BK7UENfhc4" resolve="ComplexTeam" />
    <node concept="PrWs8" id="2B2cMQEw4FD" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="2B2cMQEEIUn" role="1TKVEi">
      <property role="IQ2ns" value="3009023772266786455" />
      <property role="20lmBu" value="reference" />
      <property role="20kJfa" value="institute" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="14Y7$MQrYci" resolve="Institute" />
    </node>
    <node concept="1TJgyj" id="2B2cMQEN1tg" role="1TKVEi">
      <property role="IQ2ns" value="3009023772268959568" />
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="classes" />
      <property role="20lbJX" value="0..n" />
      <ref role="20lvS9" node="14Y7$MQrYcp" resolve="Classroom" />
    </node>
    <node concept="1TJgyj" id="2B2cMQEN1tk" role="1TKVEi">
      <property role="IQ2ns" value="3009023772268959572" />
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="alumni" />
      <property role="20lbJX" value="0..n" />
      <ref role="20lvS9" node="14Y7$MQrYcu" resolve="Student" />
    </node>
    <node concept="1TJgyj" id="2B2cMQEN1tp" role="1TKVEi">
      <property role="IQ2ns" value="3009023772268959577" />
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="volounteers" />
      <property role="20lbJX" value="0..n" />
      <ref role="20lvS9" node="2B2cMQEN1td" resolve="Volontario" />
    </node>
  </node>
  <node concept="1TIwiD" id="2B2cMQEN1td">
    <property role="EcuMT" value="3009023772268959565" />
    <property role="TrG5h" value="Volontario" />
    <property role="34LRSv" value="volontario" />
    <ref role="1TJDcQ" to="mupf:3VGM6JgdUsT" resolve="Player" />
    <node concept="PrWs8" id="2B2cMQEN1te" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="3Ig6d6KTWG0">
    <property role="EcuMT" value="4291957733779294976" />
    <property role="TrG5h" value="Dashboard" />
    <property role="34LRSv" value="dashboard" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3Ig6d6KTWG1" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="6xXDyh78VOy">
    <property role="EcuMT" value="7529356826775895330" />
    <property role="TrG5h" value="experiencePoint" />
    <property role="34LRSv" value="experiencePoint" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="mupf:3VGM6JgdUqL" resolve="Point" />
    <node concept="PrWs8" id="6xXDyh78VO$" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="6xXDyh78VOz">
    <property role="EcuMT" value="7529356826775895331" />
    <property role="TrG5h" value="skillPoint" />
    <property role="34LRSv" value="skillPoint" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="mupf:3VGM6JgdUqL" resolve="Point" />
    <node concept="PrWs8" id="6xXDyh78VOA" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="6xXDyh7jUMo">
    <property role="EcuMT" value="7529356826778774680" />
    <property role="TrG5h" value="dataDrivenAction" />
    <property role="34LRSv" value="dataDrivenAction" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="mupf:3VGM6JgdTNN" resolve="Action" />
    <node concept="PrWs8" id="6xXDyh7jUMp" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="6xXDyh7jUMr">
    <property role="EcuMT" value="7529356826778774683" />
    <property role="TrG5h" value="eventDrivenAction" />
    <property role="19KtqR" value="true" />
    <property role="34LRSv" value="eventDrivenAction" />
    <ref role="1TJDcQ" to="mupf:3VGM6JgdTNN" resolve="Action" />
    <node concept="PrWs8" id="6xXDyh7jUMu" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="6xXDyh7wGEu">
    <property role="EcuMT" value="7529356826782124702" />
    <property role="TrG5h" value="SinglePlayerChallenge" />
    <property role="19KtqR" value="true" />
    <property role="34LRSv" value="singlePlayerChallenge" />
    <ref role="1TJDcQ" to="mupf:3VGM6JgdVuN" resolve="Challenge" />
    <node concept="PrWs8" id="6xXDyh7wGEv" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="62GV8nQbD0a">
    <property role="EcuMT" value="6966202783740366858" />
    <property role="TrG5h" value="KGGBadgeCollection" />
    <property role="34LRSv" value="KGGBadgeCollection" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="mupf:3VGM6JgdUrD" resolve="BadgeCollection" />
    <node concept="PrWs8" id="62GV8nQbDFB" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="62GV8nRzop1" role="1TKVEi">
      <property role="IQ2ns" value="6966202783763367489" />
      <property role="20lmBu" value="reference" />
      <property role="20kJfa" value="badgeTypes" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="62GV8nQc7th" resolve="KGGBadge" />
    </node>
  </node>
  <node concept="1TIwiD" id="62GV8nQc7th">
    <property role="EcuMT" value="6966202783740491601" />
    <property role="TrG5h" value="KGGBadge" />
    <property role="19KtqR" value="true" />
    <property role="34LRSv" value="KGGBadgeType" />
    <ref role="1TJDcQ" to="mupf:3VGM6JgdUry" resolve="Badge" />
    <node concept="PrWs8" id="62GV8nQc7R4" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="62GV8nRv2m3">
    <property role="EcuMT" value="6966202783762228611" />
    <property role="TrG5h" value="Domain" />
    <property role="34LRSv" value="domain" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="62GV8nRv2n0" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="62GV8nRSfoi">
    <property role="EcuMT" value="6966202783768835602" />
    <property role="TrG5h" value="ExperienceLevel" />
    <property role="34LRSv" value="experienceLevel" />
    <ref role="1TJDcQ" to="mupf:62GV8nRSfj3" resolve="Level" />
    <node concept="PrWs8" id="62GV8nRSfsU" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
</model>

