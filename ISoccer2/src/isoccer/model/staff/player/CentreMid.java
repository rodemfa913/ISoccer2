package isoccer.model.staff.player;

public class CentreMid extends Player {
   public static final String type = "meia";

   protected CentreMid(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return CentreMid.type;
   }
}