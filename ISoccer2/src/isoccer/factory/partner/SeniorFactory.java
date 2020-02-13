package isoccer.factory.partner;

import isoccer.Model;
import isoccer.factory.partner.Senior;

public class SeniorFactory extends FanPartnerFactory {
   public static final SeniorFactory me = new SeniorFactory();

   private SeniorFactory() {}

   @Override
   public Senior create() {
      return new Senior(Model.me.getCount());
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