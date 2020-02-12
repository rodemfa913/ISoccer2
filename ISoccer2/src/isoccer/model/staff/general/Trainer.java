package isoccer.model.staff.general;

import isoccer.model.staff.Member;

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