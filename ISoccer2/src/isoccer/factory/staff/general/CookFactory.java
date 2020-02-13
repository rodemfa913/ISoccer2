package isoccer.factory.staff.general;

import isoccer.Model;
import isoccer.factory.staff.general.Cook;

public class CookFactory extends GeneralFactory {
   public static final CookFactory me = new CookFactory();

   private CookFactory() {}

   @Override
   public Cook create() {
      return new Cook(Model.me.getCount());
   }

   @Override
   public String getTag() {
      return Cook.type;
   }
}