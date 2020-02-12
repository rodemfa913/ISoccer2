package isoccer.model.staff.general;

import isoccer.model.staff.general.Trainer;

public class TrainerFactory extends GeneralFactory {
   public static final TrainerFactory me = new TrainerFactory();

   private TrainerFactory() {}

   @Override
   public Trainer create() {
      return new Trainer(this.getCount());
   }

   @Override
   public String getTag() {
      return Trainer.type;
   }
}