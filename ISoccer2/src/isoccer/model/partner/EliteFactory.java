package isoccer.model.partner;

import isoccer.model.partner.Elite;

public class EliteFactory extends FanPartnerFactory {
   public static final EliteFactory me = new EliteFactory();

   private EliteFactory() {}

   @Override
   public Elite create() {
      return new Elite(this.getCount());
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