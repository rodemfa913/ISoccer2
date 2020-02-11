package isoccer.model.staff.general;

import isoccer.model.staff.Member;

public class Doctor extends Member {
   public String crm;
   public static final String type = "médico";

   public Doctor(int id) {
      super(id);
      this.crm = "-";
   }

   @Override
   protected String getType() {
      return Doctor.type;
   }

   @Override
   public String toString() {
      return super.toString() + "\nCRM: " + this.crm;
   }
}