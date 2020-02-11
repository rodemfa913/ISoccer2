package isoccer.command;

import isoccer.ISoccer;
import isoccer.factory.partner.*;
import isoccer.model.Model;
import isoccer.model.partner.FanPartner;

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
      FanPartner partner = this.factories[p].create();
      Model.me.setPartner(partner);
      System.out.println("Sócio-torcedor '" + partner.id + ": " + partner.name + "' adicionado.");
   }

   @Override
   public String getTag() {
      return "adicionar sócio-torcedor";
   }
}