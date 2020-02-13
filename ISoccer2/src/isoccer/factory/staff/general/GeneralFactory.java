package isoccer.factory.staff.general;

import isoccer.ISoccer;
import isoccer.Model;
import isoccer.factory.staff.Member;
import isoccer.factory.staff.MemberFactory;
import java.util.ArrayList;

public abstract class GeneralFactory extends MemberFactory {
   @Override
   public Member get() throws Exception {
      return GeneralFactory.getMember();
   }

   public static Member getMember() throws Exception {
      System.out.print("Id: ");
      int id = Integer.parseInt(ISoccer.input.nextLine());
      return Model.me.getMember(id);
   }

   public static ArrayList<Member> getMembers() {
      return Model.me.getMembers();
   }

   @Override
   public void put(Member member) {
      Model.me.setMember(member);
   }
}