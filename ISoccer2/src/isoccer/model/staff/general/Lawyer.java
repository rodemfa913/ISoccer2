package isoccer.model.staff.general;

import isoccer.model.staff.Member;

public class Lawyer extends Member {
   public static final String type = "advogado";

   public Lawyer(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return Lawyer.type;
   }
}