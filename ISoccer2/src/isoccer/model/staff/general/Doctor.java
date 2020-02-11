package isoccer.model.staff.general;

import isoccer.model.RegEx;
import isoccer.model.staff.Member;

public class Doctor extends Member {
   private String crm;
   public static final String type = "médico";

   public Doctor(int id) {
      super(id);
      this.crm = "-";
   }

   public String getCRM() {
      return this.crm;
   }

   @Override
   protected String getType() {
      return Doctor.type;
   }

   public void setCRM(String crm) throws Exception {
      if (!crm.matches(RegEx.crm))
         throw formatException;
      this.crm = crm;
   }

   @Override
   public String toString() {
      return super.toString() + "\nCRM: " + this.crm;
   }
}