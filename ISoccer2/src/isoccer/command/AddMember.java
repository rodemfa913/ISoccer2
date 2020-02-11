package isoccer.command;

import isoccer.ISoccer;
import isoccer.factory.staff.*;
import isoccer.factory.staff.player.PlayerFactory;
import isoccer.factory.staff.general.GeneralFactory;
import isoccer.model.Model;
import isoccer.model.staff.Member;

public class AddMember implements Command {
   private MemberFactory[] factories;
   
   public static final AddMember me = new AddMember();

   private AddMember() {
      this.factories = new MemberFactory[] {
         CoachFactory.me, PlayerFactory.me, GeneralFactory.me
      };
   }

   @Override
   public void execute() throws Exception {
      System.out.println();
      int m;

      for (m = 0; m < this.factories.length; m++)
         System.out.println(m + " - " + this.factories[m].getTag());

      System.out.print("\nTipo: ");
      m = Integer.parseInt(ISoccer.input.nextLine());
      Member member = this.factories[m].create();
      Model.me.setMember(member);
      System.out.println("Funcionário '" + member.id + ": " + member.getName() + " adicionado.");
   }

   @Override
   public String getTag() {
      return "adicionar funcionário";
   }
}