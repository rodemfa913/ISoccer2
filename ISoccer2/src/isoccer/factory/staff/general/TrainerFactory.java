package isoccer.factory.staff.general;

import isoccer.model.staff.general.Trainer;

public class TrainerFactory extends GeneralFactory {
   public static final TrainerFactory me = new TrainerFactory();

   private TrainerFactory() {}

   @Override
   public Trainer create() throws Exception {
      Trainer trainer = new Trainer(this.getCount());
      this.setInfo(trainer);
      return trainer;
   }

   @Override
   public String getTag() {
      return Trainer.type;
   }
}