package isoccer.model.partner;

import isoccer.model.partner.Junior;

public class JuniorFactory extends FanPartnerFactory {
   public static final JuniorFactory me = new JuniorFactory();

   private JuniorFactory() {}

   @Override
   public Junior create() throws Exception {
      Junior junior = new Junior(this.getCount());
      this.setInfo(junior);
      return junior;
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