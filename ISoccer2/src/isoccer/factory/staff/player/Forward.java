package isoccer.factory.staff.player;

public class Forward extends Player {
   public static final String type = "atacante";

   protected Forward(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return Forward.type;
   }
}