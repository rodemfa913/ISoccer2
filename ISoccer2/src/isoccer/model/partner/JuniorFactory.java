package isoccer.model.partner;

import isoccer.model.partner.Junior;

public class JuniorFactory extends FanPartnerFactory {
   public static final JuniorFactory me = new JuniorFactory();

   private JuniorFactory() {}

   @Override
   public Junior create() {
      return new Junior(this.getCount());
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