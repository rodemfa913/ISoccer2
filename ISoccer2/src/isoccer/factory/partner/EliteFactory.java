package isoccer.factory.partner;

import isoccer.model.partner.Elite;

public class EliteFactory extends FanPartnerFactory {
   public static final EliteFactory me = new EliteFactory();

   private EliteFactory() {}

   @Override
   public Elite create() throws Exception {
      Elite elite = new Elite(this.getCount());
      this.setInfo(elite);
      return elite;
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