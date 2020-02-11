package isoccer.factory.staff.general;

import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.general.Trainer;

public class TrainerFactory extends MemberFactory {
   public static final TrainerFactory me = new TrainerFactory();

   private TrainerFactory() {}

   @Override
   public Trainer create() throws Exception {
      Trainer trainer = new Trainer(GeneralFactory.me.getCount());
      this.setInfo(trainer);
      return trainer;
   }

   @Override
   public String getTag() {
      return Trainer.type;
   }
}