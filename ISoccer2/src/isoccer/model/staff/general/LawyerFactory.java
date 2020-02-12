package isoccer.model.staff.general;

import isoccer.model.Model;
import isoccer.model.staff.general.Lawyer;

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