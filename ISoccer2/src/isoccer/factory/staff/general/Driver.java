package isoccer.factory.staff.general;

import isoccer.factory.staff.Member;

public class Driver extends Member {
   protected long cnh;
   public static final String type = "motorista";

   protected Driver(int id) {
      super(id);
   }

   public long getCNH() {
      return this.cnh;
   }

   @Override
   public String getType() {
      return Driver.type;
   }

   @Override
   public String toString() {
      return super.toString() + "\nCNH: " + this.cnh;
   }
}