package isoccer.factory.staff.general;

import isoccer.factory.staff.Member;

public class Doctor extends Member {
   protected String crm;
   public static final String type = "médico";

   protected Doctor(int id) {
      super(id);
      this.crm = "-";
   }

   public String getCRM() {
      return this.crm;
   }

   @Override
   public String getType() {
      return Doctor.type;
   }

   @Override
   public String toString() {
      return super.toString() + "\nCRM: " + this.crm;
   }
}