package isoccer.factory.staff.general;

import isoccer.factory.staff.Member;

public class Lawyer extends Member {
   public static final String type = "advogado";

   protected Lawyer(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return Lawyer.type;
   }
}