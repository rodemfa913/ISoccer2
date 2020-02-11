package isoccer.factory.staff.general;

import isoccer.factory.staff.MemberFactory;

public abstract class GeneralFactory extends MemberFactory {
   private static int count;

   protected int getCount() {
      return GeneralFactory.count++;
   }
}