package isoccer.command;

import isoccer.ISoccer;
import isoccer.model.partner.EliteFactory;
import isoccer.model.partner.FanPartner;
import isoccer.model.partner.FanPartnerFactory;
import isoccer.model.partner.JuniorFactory;
import isoccer.model.partner.SeniorFactory;

public class AddPartner implements Command {
   private FanPartnerFactory[] factories;
   public static final AddPartner me = new AddPartner();

   private AddPartner() {
      this.factories = new FanPartnerFactory[] {
         JuniorFactory.me, SeniorFactory.me, EliteFactory.me
      };
   }

   @Override
   public void execute() throws Exception {
      System.out.println();
      int p;

      for (p = 0; p < this.factories.length; p++)
         System.out.println(p + " - " + this.factories[p].getTag());

      System.out.print("\nTipo: ");
      p = Integer.parseInt(ISoccer.input.nextLine());
      FanPartnerFactory factory = this.factories[p];
      FanPartner partner = factory.create();
      factory.setInfo(partner);
      factory.put(partner);
      System.out.println(
         "Sócio-torcedor '" + partner.id + ": " + partner.getName() + "' adicionado."
      );
   }

   @Override
   public String getTag() {
      return "adicionar sócio-torcedor";
   }
}