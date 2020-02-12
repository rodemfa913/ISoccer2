package isoccer.model.staff.player;

import isoccer.model.staff.player.GoalKeeper;

public class GoalKeeperFactory extends PlayerFactory {
   public static final GoalKeeperFactory me = new GoalKeeperFactory();

   private GoalKeeperFactory() {}

   @Override
   public GoalKeeper create() {
      return new GoalKeeper(this.getCount());
   }

   @Override
   public String getTag() {
      return GoalKeeper.type;
   }
}