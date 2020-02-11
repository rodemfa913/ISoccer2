package isoccer.model.staff;

public class Coach extends Member {
   public static final String type = "técnico";

   public Coach(int id) {
      super(id);
   }

   @Override
   protected String getType() {
      return Coach.type;
   }
}