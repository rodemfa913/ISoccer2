package isoccer.model.staff.general;

import isoccer.model.staff.Member;

public class Driver extends Member {
   public long cnh;
   public static final String type = "motorista";

   public Driver(int id) {
      super(id);
   }

   @Override
   protected String getType() {
      return Driver.type;
   }

   @Override
   public String toString() {
      return super.toString() + "\nCNH: " + this.cnh;
   }
}