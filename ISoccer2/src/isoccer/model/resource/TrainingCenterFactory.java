package isoccer.model.resource;

import isoccer.ISoccer;
import isoccer.model.Model;

public class TrainingCenterFactory extends ResourceFactory {
   public static final TrainingCenterFactory me = new TrainingCenterFactory();

   private TrainingCenterFactory() {}

   @Override
   public TrainingCenter create() {
      return new TrainingCenter(0);
   }

   @Override
   public TrainingCenter get() throws Exception {
      return Model.me.getTrainingCenter();
   }

   @Override
   public String getTag() {
      return TrainingCenter.type;
   }

   @Override
   public void put(Resource resource) {
      Model.me.setTrainingCenter((TrainingCenter) resource);
   }

   @Override
   public void setInfo(Resource resource) throws Exception {
      super.setInfo(resource);
      TrainingCenter trainingCenter = (TrainingCenter) resource;
      System.out.print("Número de dormitórios: ");
      int nBedroom = Integer.parseInt(ISoccer.input.nextLine());

      if (nBedroom < 0)
         nBedroom = 0;

      trainingCenter.nBedroom = nBedroom;
   }
}