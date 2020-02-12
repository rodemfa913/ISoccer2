package isoccer.model.staff.player;

public class GoalKeeper extends Player {
   public static final String type = "goleiro";

   protected GoalKeeper(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return GoalKeeper.type;
   }
}