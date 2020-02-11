package isoccer.factory.staff.general;

import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.general.President;

public class PresidentFactory extends MemberFactory {
   public static final PresidentFactory me = new PresidentFactory();

   private PresidentFactory() {}

   @Override
   public President create() throws Exception {
      President president = new President(GeneralFactory.me.getCount());
      this.setInfo(president);
      return president;
   }

   @Override
   public String getTag() {
      return President.type;
   }
}