package isoccer.factory.staff.player;

import isoccer.factory.staff.MemberFactory;

public abstract class PlayerFactory extends MemberFactory {
   private static int count;

   protected int getCount() {
      return PlayerFactory.count++;
   }
}