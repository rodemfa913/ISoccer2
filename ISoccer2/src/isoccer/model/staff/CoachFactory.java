package isoccer.model.staff;

import isoccer.model.Model;
import isoccer.model.staff.Coach;

public class CoachFactory extends MemberFactory {
   public static final CoachFactory me = new CoachFactory();

   private CoachFactory() {}

   @Override
   public Coach create() {
      return new Coach(0);
   }

   @Override
   public String getTag() {
      return Coach.type;
   }

   @Override
   public void put(Member member) {
      Model.me.setCoach((Coach) member);
   }
}