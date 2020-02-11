package isoccer.factory.staff.general;

import isoccer.model.staff.general.Cook;

public class CookFactory extends GeneralFactory {
   public static final CookFactory me = new CookFactory();

   private CookFactory() {}

   @Override
   public Cook create() throws Exception {
      Cook cook = new Cook(this.getCount());
      this.setInfo(cook);
      return cook;
   }

   @Override
   public String getTag() {
      return Cook.type;
   }
}