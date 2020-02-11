package isoccer.factory.staff.player;

import isoccer.model.staff.player.GoalKeeper;

public class GoalKeeperFactory extends PlayerFactory {
   public static final GoalKeeperFactory me = new GoalKeeperFactory();

   private GoalKeeperFactory() {}

   @Override
   public GoalKeeper create() throws Exception {
      GoalKeeper goalKeeper = new GoalKeeper(this.getCount());
      this.setInfo(goalKeeper);
      return goalKeeper;
   }

   @Override
   public String getTag() {
      return GoalKeeper.type;
   }
}