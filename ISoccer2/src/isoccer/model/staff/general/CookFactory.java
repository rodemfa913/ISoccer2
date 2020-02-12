package isoccer.model.staff.general;

import isoccer.model.staff.general.Cook;

public class CookFactory extends GeneralFactory {
   public static final CookFactory me = new CookFactory();

   private CookFactory() {}

   @Override
   public Cook create() {
      return new Cook(this.getCount());
   }

   @Override
   public String getTag() {
      return Cook.type;
   }
}