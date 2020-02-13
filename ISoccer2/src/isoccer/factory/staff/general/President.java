package isoccer.factory.staff.general;

import isoccer.factory.staff.Member;

public class President extends Member {
   public static final String type = "presidente";

   protected President(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return President.type;
   }
}