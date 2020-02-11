package isoccer.model.staff;

import isoccer.ISoccer;
import isoccer.model.staff.Member;
import isoccer.model.staff.general.CookFactory;
import isoccer.model.staff.general.DoctorFactory;
import isoccer.model.staff.general.DriverFactory;
import isoccer.model.staff.general.LawyerFactory;
import isoccer.model.staff.general.PresidentFactory;
import isoccer.model.staff.general.TrainerFactory;
import isoccer.model.staff.general.GeneralFactory;

public class GeneralsFactory extends MemberFactory {
   public static final GeneralsFactory me = new GeneralsFactory();
   private GeneralFactory[] factories;

   private GeneralsFactory() {
      this.factories = new GeneralFactory[] {
         PresidentFactory.me, DoctorFactory.me, TrainerFactory.me,
         DriverFactory.me, CookFactory.me, LawyerFactory.me
      };
   }

   @Override
   public Member create() throws Exception {
      System.out.println();
      int s;

      for (s = 0; s < this.factories.length; s++)
         System.out.println(s + " - " + this.factories[s].getTag());

      System.out.print("\nFunção: ");
      s = Integer.parseInt(ISoccer.input.nextLine());
      return this.factories[s].create();
   }

   @Override
   public String getTag() {
      return "serviços gerais";
   }
}