package isoccer.factory.staff.general;

import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.general.Lawyer;

public class LawyerFactory extends MemberFactory {
   public static final LawyerFactory me = new LawyerFactory();

   private LawyerFactory() {}

   @Override
   public Lawyer create() throws Exception {
      Lawyer lawyer = new Lawyer(GeneralFactory.me.getCount());
      this.setInfo(lawyer);
      return lawyer;
   }

   @Override
   public String getTag() {
      return Lawyer.type;
   }
}