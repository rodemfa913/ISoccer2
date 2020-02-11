package isoccer.model.staff;

import isoccer.model.staff.Coach;

public class CoachFactory extends MemberFactory {
   public static final CoachFactory me = new CoachFactory();

   private CoachFactory() {}

   @Override
   public Coach create() throws Exception {
      Coach coach = new Coach(0);
      this.setInfo(coach);
      return coach;
   }

   @Override
   public String getTag() {
      return Coach.type;
   }
}