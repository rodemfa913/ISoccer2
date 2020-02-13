package isoccer.factory.staff.general;

import isoccer.Model;
import isoccer.factory.staff.general.Lawyer;

public class LawyerFactory extends GeneralFactory {
   public static final LawyerFactory me = new LawyerFactory();

   private LawyerFactory() {}

   @Override
   public Lawyer create() {
      return new Lawyer(Model.me.getCount());
   }

   @Override
   public String getTag() {
      return Lawyer.type;
   }
}