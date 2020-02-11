package isoccer.model.staff.player;

import isoccer.model.staff.MemberFactory;

public abstract class PlayerFactory extends MemberFactory {
   private static int count;

   protected int getCount() {
      return PlayerFactory.count++;
   }
}