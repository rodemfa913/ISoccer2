package isoccer.factory.staff;

public class Coach extends Member {
   public static final String type = "técnico";

   protected Coach(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return Coach.type;
   }
}