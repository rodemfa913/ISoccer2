package isoccer.command.member;

import isoccer.ISoccer;
import isoccer.command.Command;
import isoccer.model.staff.Member;
import isoccer.model.staff.general.CookFactory;
import isoccer.model.staff.general.DoctorFactory;
import isoccer.model.staff.general.DriverFactory;
import isoccer.model.staff.general.GeneralFactory;
import isoccer.model.staff.general.LawyerFactory;
import isoccer.model.staff.general.PresidentFactory;
import isoccer.model.staff.general.TrainerFactory;

public class AddGeneral implements Command {
   private GeneralFactory[] factories;
   public static final AddGeneral me = new AddGeneral();

   private AddGeneral() {
      this.factories = new GeneralFactory[] {
         PresidentFactory.me, DoctorFactory.me, TrainerFactory.me,
         DriverFactory.me, CookFactory.me, LawyerFactory.me
      };
   }

   @Override
   public void execute() throws Exception {
      System.out.println();
      int m;

      for (m = 0; m < this.factories.length; m++)
         System.out.println(m + " - " + this.factories[m].getTag());

      System.out.print("\nFunção: ");
      m = Integer.parseInt(ISoccer.input.nextLine());
      GeneralFactory factory = this.factories[m];
      Member member = factory.create();
      factory.setInfo(member);
      factory.put(member);
      System.out.println("Funcionário '" + member.id + ": " + member.getName() + " adicionado.");
   }

   @Override
   public String getTag() {
      return "serviços gerais";
   }
}