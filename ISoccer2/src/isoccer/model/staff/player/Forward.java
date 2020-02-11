package isoccer.model.staff.player;

public class Forward extends Player {
   public static final String type = "atacante";

   public Forward(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return Forward.type;
   }
}