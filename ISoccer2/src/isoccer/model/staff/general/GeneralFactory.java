package isoccer.model.staff.general;

import isoccer.model.staff.MemberFactory;

public abstract class GeneralFactory extends MemberFactory {
   private static int count;

   protected int getCount() {
      return GeneralFactory.count++;
   }
}