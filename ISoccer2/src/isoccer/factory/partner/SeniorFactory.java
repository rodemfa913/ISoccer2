package isoccer.factory.partner;

import isoccer.model.partner.Senior;

public class SeniorFactory extends FanPartnerFactory {
   public static final SeniorFactory me = new SeniorFactory();

   private SeniorFactory() {}

   @Override
   public Senior create() throws Exception {
      Senior senior = new Senior(this.getCount());
      this.setInfo(senior);
      return senior;
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