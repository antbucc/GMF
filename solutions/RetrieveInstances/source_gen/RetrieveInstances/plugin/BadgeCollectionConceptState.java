package RetrieveInstances.plugin;

/*Generated by MPS */

import java.util.List;

public class BadgeCollectionConceptState {
  public String name;
  public List<BadgeState> badgeEarned;

  public BadgeCollectionConceptState(String name, List<BadgeState> badgeEarned) {
    this.name = name;
    this.badgeEarned = badgeEarned;
  }


  public List<BadgeState> getScore() {
    return this.badgeEarned;
  }

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public List<BadgeState> getBadgeEarned() {
    return this.badgeEarned;
  }
}
