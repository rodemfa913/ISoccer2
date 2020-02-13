package isoccer.factory.staff.general;

import isoccer.Model;
import isoccer.factory.staff.general.Trainer;

public class TrainerFactory extends GeneralFactory {
   public static final TrainerFactory me = new TrainerFactory();

   private TrainerFactory() {}

   @Override
   public Trainer create() {
      return new Trainer(Model.me.getCount());
   }

   @Override
   public String getTag() {
      return Trainer.type;
   }
}