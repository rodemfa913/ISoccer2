package isoccer.model.staff.player;

public class CentreMid extends Player {
   public static final String type = "meia";

   public CentreMid(int id) {
      super(id);
   }

   @Override
   protected String getType() {
      return CentreMid.type;
   }
}