package isoccer.factory.staff.general;

import isoccer.model.staff.general.Lawyer;

public class LawyerFactory extends GeneralFactory {
   public static final LawyerFactory me = new LawyerFactory();

   private LawyerFactory() {}

   @Override
   public Lawyer create() throws Exception {
      Lawyer lawyer = new Lawyer(this.getCount());
      this.setInfo(lawyer);
      return lawyer;
   }

   @Override
   public String getTag() {
      return Lawyer.type;
   }
}