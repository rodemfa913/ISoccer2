package isoccer.factory.staff.player;

public class DefMid extends Player {
   public static final String type = "volante";

   protected DefMid(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return DefMid.type;
   }
}