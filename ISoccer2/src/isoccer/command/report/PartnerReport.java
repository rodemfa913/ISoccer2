package isoccer.command.report;

import isoccer.factory.partner.FanPartner;
import isoccer.factory.partner.FanPartnerFactory;
import java.util.ArrayList;

public class PartnerReport implements Report {
   public static final PartnerReport me = new PartnerReport();

   private PartnerReport() {}

   @Override
   public void generate() {
      ArrayList<FanPartner> partners = FanPartnerFactory.getPartners();
      System.out.println("Quantidade: " + partners.size());
      ArrayList<FanPartner> defaulting = new ArrayList<>();
      ArrayList<FanPartner> undefaulting = new ArrayList<>();

      for (FanPartner partner : partners)
         if (partner.defaulting)
            defaulting.add(partner);
         else
            undefaulting.add(partner);

      System.out.println("Adimplentes:");

      for (FanPartner partner : undefaulting)
         System.out.println("  " + partner.getName());

      System.out.println("Inadimplentes:");

      for (FanPartner partner : defaulting)
         System.out.println("  " + partner.getName());

      System.out.println("Dados:");

      for (FanPartner partner : partners)
         System.out.println("\n" + partner);
   }

   @Override
   public String getTag() {
      return "sócios-torcedores";
   }
}