package isoccer.model.staff.general;

import isoccer.model.Model;
import isoccer.model.staff.general.President;

public class PresidentFactory extends GeneralFactory {
   public static final PresidentFactory me = new PresidentFactory();

   private PresidentFactory() {}

   @Override
   public President create() {
      return new President(Model.me.getCount());
   }

   @Override
   public String getTag() {
      return President.type;
   }
}