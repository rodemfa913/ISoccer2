package isoccer.factory.staff.player;

public class RightMid extends Player {
   public static final String type = "lateral direito";

   protected RightMid(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return RightMid.type;
   }
}