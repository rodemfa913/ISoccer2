package isoccer.command;

import isoccer.ISoccer;
import isoccer.factory.partner.EliteFactory;
import isoccer.factory.partner.FanPartnerFactory;
import isoccer.factory.partner.JuniorFactory;
import isoccer.factory.partner.SeniorFactory;

public class SetContribution implements Command {
   public static final SetContribution me = new SetContribution();
   private FanPartnerFactory[] setters;

   private SetContribution() {
      this.setters = new FanPartnerFactory[] {
         JuniorFactory.me, SeniorFactory.me, EliteFactory.me
      };
   }

   @Override
   public void execute() {
      System.out.println();
      int p;

      for (p = 0; p < this.setters.length; p++)
         System.out.println(p + " - " + this.setters[p].getTag());

      System.out.print("\nTipo: ");
      p = Integer.parseInt(ISoccer.input.nextLine());
      System.out.print("Valor de contribuição: ");
      this.setters[p].setContribution(Double.parseDouble(ISoccer.input.nextLine()));
   }

   @Override
   public String getTag() {
      return "inserir valor de contribuição";
   }
}