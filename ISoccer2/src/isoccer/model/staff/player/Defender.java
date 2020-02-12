package isoccer.model.staff.player;

public class Defender extends Player {
   public static final String type = "zagueiro";

   protected Defender(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return Defender.type;
   }
}