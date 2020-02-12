package isoccer.model.partner;

import isoccer.model.partner.Senior;

public class SeniorFactory extends FanPartnerFactory {
   public static final SeniorFactory me = new SeniorFactory();

   private SeniorFactory() {}

   @Override
   public Senior create() {
      return new Senior(this.getCount());
   }

   @Override
   public String getTag() {
      return Senior.type;
   }

   @Override
   public void setContribution(double contribution) {
      if (contribution < 0)
         contribution = 0;

      Senior.contribution = contribution;
   }
}