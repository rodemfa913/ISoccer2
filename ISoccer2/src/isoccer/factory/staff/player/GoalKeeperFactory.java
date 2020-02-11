package isoccer.factory.staff.player;

import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.player.GoalKeeper;

public class GoalKeeperFactory extends MemberFactory {
   public static final GoalKeeperFactory me = new GoalKeeperFactory();

   private GoalKeeperFactory() {}

   @Override
   public GoalKeeper create() throws Exception {
      GoalKeeper goalKeeper = new GoalKeeper(PlayerFactory.me.getCount());
      this.setInfo(goalKeeper);
      return goalKeeper;
   }

   @Override
   public String getTag() {
      return GoalKeeper.type;
   }
}