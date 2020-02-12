package isoccer.model.staff.player;

public class LeftMid extends Player {
   public static final String type = "lateral esquerdo";

   protected LeftMid(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return LeftMid.type;
   }
}