package isoccer.model.staff.player;

public class Defender extends Player {
   public static final String type = "zagueiro";

   public Defender(int id) {
      super(id);
   }

   @Override
   protected String getType() {
      return Defender.type;
   }
}