package isoccer.model.staff.player;

public class GoalKeeper extends Player {
   public static final String type = "goleiro";

   public GoalKeeper(int id) {
      super(id);
   }

   @Override
   protected String getType() {
      return GoalKeeper.type;
   }
}