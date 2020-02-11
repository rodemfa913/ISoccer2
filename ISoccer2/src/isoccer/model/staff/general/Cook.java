package isoccer.model.staff.general;

import isoccer.model.staff.Member;

public class Cook extends Member {
   public static final String type = "cozinheiro";

   public Cook(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return Cook.type;
   }
}