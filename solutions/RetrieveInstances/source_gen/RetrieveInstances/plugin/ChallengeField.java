package RetrieveInstances.plugin;

/*Generated by MPS */


public class ChallengeField {
  public int bonusScore;
  public String VirtualPrize;
  public String bonusPointType;
  public boolean prizeWon;




  public ChallengeField(int bonusScore, String virtualPrize, String bonusPointType, boolean prizeWon) {
    this.bonusScore = bonusScore;
    this.VirtualPrize = virtualPrize;
    this.bonusPointType = bonusPointType;
    this.prizeWon = prizeWon;
  }
  public int getBonusScore() {
    return this.bonusScore;
  }
  public void setBonusScore(int bonusScore) {
    this.bonusScore = bonusScore;
  }
  public String getVirtualPrize() {
    return this.VirtualPrize;
  }
  public void setVirtualPrize(String virtualPrize) {
    this.VirtualPrize = virtualPrize;
  }
  public String getBonusPointType() {
    return this.bonusPointType;
  }
  public void setBonusPointType(String bonusPointType) {
    this.bonusPointType = bonusPointType;
  }
  public boolean isPrizeWon() {
    return this.prizeWon;
  }
  public void setPrizeWon(boolean prizeWon) {
    this.prizeWon = prizeWon;
  }
}
