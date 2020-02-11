package isoccer.command;

import isoccer.ISoccer;
import isoccer.model.Model;
import isoccer.model.staff.CoachFactory;
import isoccer.model.staff.GeneralsFactory;
import isoccer.model.staff.Member;
import isoccer.model.staff.MemberFactory;
import isoccer.model.staff.PlayersFactory;

public class AddMember implements Command {
   private MemberFactory[] factories;
   
   public static final AddMember me = new AddMember();

   private AddMember() {
      this.factories = new MemberFactory[] {
         CoachFactory.me, PlayersFactory.me, GeneralsFactory.me
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