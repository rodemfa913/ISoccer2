package isoccer.model.staff.general;

import isoccer.model.staff.Member;

public class President extends Member {
   public static final String type = "presidente";

   public President(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return President.type;
   }
}