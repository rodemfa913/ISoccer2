package isoccer.factory.staff.general;

import isoccer.factory.staff.Member;

public class Cook extends Member {
   public static final String type = "cozinheiro";

   protected Cook(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return Cook.type;
   }
}