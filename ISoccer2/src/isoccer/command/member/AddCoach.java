package isoccer.command.member;

import isoccer.command.Command;
import isoccer.model.staff.Coach;
import isoccer.model.staff.CoachFactory;

public class AddCoach implements Command {
   public static final AddCoach me = new AddCoach();

   private AddCoach() {}

   @Override
   public void execute() throws Exception {
      Coach coach = CoachFactory.me.create();
      CoachFactory.me.setInfo(coach);
      CoachFactory.me.put(coach);
      System.out.println("Técnico " + coach.getName() + " adicionado.");
   }

   @Override
   public String getTag() {
      return Coach.type;
   }
}