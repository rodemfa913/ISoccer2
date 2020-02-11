package isoccer.model.partner;

public class Elite extends FanPartner {
   public static double contribution;
   public static final String type = "elite";

   public Elite(int id) {
      super(id);
   }

   @Override
   protected double getContribution() {
      return Elite.contribution;
   }
}