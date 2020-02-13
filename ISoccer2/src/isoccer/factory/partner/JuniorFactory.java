package isoccer.factory.partner;

import isoccer.Model;
import isoccer.factory.partner.Junior;

public class JuniorFactory extends FanPartnerFactory {
   public static final JuniorFactory me = new JuniorFactory();

   private JuniorFactory() {}

   @Override
   public Junior create() {
      return new Junior(Model.me.getCount());
   }

   @Override
   public String getTag() {
      return Junior.type;
   }

   @Override
   public void setContribution(double contribution) {
      if (contribution < 0)
         contribution = 0;

      Junior.contribution = contribution;
   }
}