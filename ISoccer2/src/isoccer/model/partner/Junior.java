package isoccer.model.partner;

public class Junior extends FanPartner {
   public static double contribution;
   public static final String type = "júnior";

   public Junior(int id) {
      super(id);
   }

   @Override
   public double getContribution() {
      return Junior.contribution;
   }
}