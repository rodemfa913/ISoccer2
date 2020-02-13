package isoccer.factory.partner;

public class Junior extends FanPartner {
   public static double contribution;
   public static final String type = "júnior";

   protected Junior(int id) {
      super(id);
   }

   @Override
   public double getContribution() {
      return Junior.contribution;
   }
}