package isoccer.command;

import isoccer.ISoccer;
import isoccer.command.member.*;

public class AddMember implements Command {
   private Command[] actions;
   
   public static final AddMember me = new AddMember();

   private AddMember() {
      this.actions = new Command[] {AddCoach.me, AddPlayer.me, AddGeneral.me};
   }

   @Override
   public void execute() throws Exception {
      System.out.println();
      int m;

      for (m = 0; m < this.actions.length; m++)
         System.out.println(m + " - " + this.actions[m].getTag());

      System.out.print("\nTipo: ");
      m = Integer.parseInt(ISoccer.input.nextLine());
      this.actions[m].execute();
   }

   @Override
   public String getTag() {
      return "adicionar funcionário";
   }
}