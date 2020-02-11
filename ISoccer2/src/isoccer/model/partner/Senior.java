package isoccer.model.partner;

public class Senior extends FanPartner {
   public static double contribution;
   public static final String type = "sênior";

   public Senior(int id) {
      super(id);
   }

   @Override
   protected double getContribution() {
      return Senior.contribution;
   }
}