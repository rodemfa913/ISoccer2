package isoccer.factory.staff.general;

import isoccer.ISoccer;
import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.Member;

public class GeneralFactory extends MemberFactory {
   private int count;
   public static final GeneralFactory me = new GeneralFactory();
   private MemberFactory[] factories;

   private GeneralFactory() {
      this.factories = new MemberFactory[] {
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

   public int getCount() {
      return this.count++;
   }

   @Override
   public String getTag() {
      return "serviços gerais";
   }
}