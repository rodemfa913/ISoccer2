package isoccer.model.partner;

public class Senior extends FanPartner {
   public static double contribution;
   public static final String type = "sênior";

   protected Senior(int id) {
      super(id);
   }

   @Override
   public double getContribution() {
      return Senior.contribution;
   }
}