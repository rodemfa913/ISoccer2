package isoccer.factory.staff.general;

import isoccer.factory.staff.Member;

public class Trainer extends Member {
   public static final String type = "preparador físico";

   protected Trainer(int id) {
      super(id);
   }

   @Override
   public String getType() {
      return Trainer.type;
   }
}