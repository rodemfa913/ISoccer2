package isoccer.model.staff.general;

import isoccer.model.staff.Member;

public class Trainer extends Member {
   public static final String type = "preparador físico";

   public Trainer(int id) {
      super(id);
   }

   @Override
   protected String getType() {
      return Trainer.type;
   }
}