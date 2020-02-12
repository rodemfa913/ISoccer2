package isoccer.model.staff.general;

import isoccer.ISoccer;
import isoccer.model.RegEx;
import isoccer.model.staff.Member;
import isoccer.model.staff.MemberFactory;
import isoccer.model.staff.general.Doctor;

public class DoctorFactory extends GeneralFactory {
   public static final DoctorFactory me = new DoctorFactory();

   private DoctorFactory() {}

   @Override
   public Doctor create() {
      return new Doctor(this.getCount());
   }

   @Override
   public String getTag() {
      return Doctor.type;
   }

   @Override
   public void setInfo(Member member) throws Exception {
      super.setInfo(member);
      Doctor doctor = (Doctor) member;
      System.out.print("CRM: ");
      String crm = ISoccer.input.nextLine();

      if (!crm.matches(RegEx.crm))
         throw MemberFactory.formatException;

      doctor.crm = crm;
   }
}