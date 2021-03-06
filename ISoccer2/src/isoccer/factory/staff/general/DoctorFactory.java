package isoccer.factory.staff.general;

import isoccer.ISoccer;
import isoccer.Model;
import isoccer.RegEx;
import isoccer.exception.FormatException;
import isoccer.factory.staff.Member;
import isoccer.factory.staff.general.Doctor;

public class DoctorFactory extends GeneralFactory {
   public static final DoctorFactory me = new DoctorFactory();

   private DoctorFactory() {}

   @Override
   public Doctor create() {
      return new Doctor(Model.me.getCount());
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
         throw new FormatException();

      doctor.crm = crm;
   }
}