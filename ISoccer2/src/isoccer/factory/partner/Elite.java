package isoccer.factory.partner;

public class Elite extends FanPartner {
   public static double contribution;
   public static final String type = "elite";

   protected Elite(int id) {
      super(id);
   }

   @Override
   public double getContribution() {
      return Elite.contribution;
   }
}