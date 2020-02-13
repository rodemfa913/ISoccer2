package isoccer.factory.staff.player;

import isoccer.Model;
import isoccer.factory.staff.player.GoalKeeper;

public class GoalKeeperFactory extends PlayerFactory {
   public static final GoalKeeperFactory me = new GoalKeeperFactory();

   private GoalKeeperFactory() {}

   @Override
   public GoalKeeper create() {
      return new GoalKeeper(Model.me.getCount());
   }

   @Override
   public String getTag() {
      return GoalKeeper.type;
   }
}