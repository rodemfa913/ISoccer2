package isoccer.model.staff.general;

import isoccer.model.staff.general.President;

public class PresidentFactory extends GeneralFactory {
   public static final PresidentFactory me = new PresidentFactory();

   private PresidentFactory() {}

   @Override
   public President create() throws Exception {
      President president = new President(this.getCount());
      this.setInfo(president);
      return president;
   }

   @Override
   public String getTag() {
      return President.type;
   }
}