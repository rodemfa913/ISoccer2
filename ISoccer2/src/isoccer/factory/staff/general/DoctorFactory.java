package isoccer.factory.staff.general;

import isoccer.ISoccer;
import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.Member;
import isoccer.model.staff.general.Doctor;

public class DoctorFactory extends MemberFactory {
   public static final DoctorFactory me = new DoctorFactory();

   private DoctorFactory() {}

   @Override
   public Doctor create() throws Exception {
      Doctor doctor = new Doctor(GeneralFactory.me.getCount());
      this.setInfo(doctor);
      return doctor;
   }

   @Override
   public String getTag() {
      return Doctor.type;
   }

   @Override
   protected void setInfo(Member member) throws Exception {
      super.setInfo(member);
      Doctor doctor = (Doctor) member;
      System.out.print("CRM: ");
      doctor.setCRM(ISoccer.input.nextLine());
   }
}