package isoccer.model.staff.player;

import isoccer.model.Model;
import isoccer.model.staff.Member;
import isoccer.model.staff.MemberFactory;

public abstract class PlayerFactory extends MemberFactory {
   private static int count;

   protected int getCount() {
      return PlayerFactory.count++;
   }

   @Override
   public void put(Member member) {
      Model.me.setPlayer((Player) member);
   }
}