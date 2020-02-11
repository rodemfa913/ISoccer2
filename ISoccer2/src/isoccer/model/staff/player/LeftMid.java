package isoccer.model.staff.player;

public class LeftMid extends Player {
   public static final String type = "lateral esquerdo";

   public LeftMid(int id) {
      super(id);
   }

   @Override
   protected String getType() {
      return LeftMid.type;
   }
}