package isoccer.model.staff.general;

import isoccer.model.Model;
import isoccer.model.staff.Member;
import isoccer.model.staff.MemberFactory;

public abstract class GeneralFactory extends MemberFactory {
   private static int count;

   protected int getCount() {
      return GeneralFactory.count++;
   }

   @Override
   public void put(Member member) {
      Model.me.setMember(member);
   }
}