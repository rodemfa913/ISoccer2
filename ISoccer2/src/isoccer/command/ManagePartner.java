package isoccer.command;

import isoccer.ISoccer;
import isoccer.model.partner.FanPartner;
import isoccer.model.partner.FanPartnerFactory;

public class ManagePartner implements Command {
   public static final ManagePartner me = new ManagePartner();

   private ManagePartner() {}

   @Override
   public void execute() throws Exception {
      FanPartner partner = FanPartnerFactory.getPartner();
      System.out.print("Inadimplente? (s/n): ");
      partner.defaulting = ISoccer.input.nextLine().toLowerCase().equals("s");
   }

   @Override
   public String getTag() {
      return "gerenciar sócio-torcedor";
   }
}