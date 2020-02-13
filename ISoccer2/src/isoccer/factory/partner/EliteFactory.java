package isoccer.factory.partner;

import isoccer.Model;
import isoccer.factory.partner.Elite;

public class EliteFactory extends FanPartnerFactory {
   public static final EliteFactory me = new EliteFactory();

   private EliteFactory() {}

   @Override
   public Elite create() {
      return new Elite(Model.me.getCount());
   }

   @Override
   public String getTag() {
      return Elite.type;
   }

   @Override
   public void setContribution(double contribution) {
      if (contribution < 0)
         contribution = 0;

      Elite.contribution = contribution;
   }
}