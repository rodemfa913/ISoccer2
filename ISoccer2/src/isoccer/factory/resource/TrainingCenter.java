package isoccer.factory.resource;

public class TrainingCenter extends Resource {
   protected int nBedroom;
   public static final String type = "centro de treinamento";

   protected TrainingCenter(int id) {
      super(id);
   }

   public int getNumberOfBedrooms() {
      return this.nBedroom;
   }

   @Override
   public String getType() {
      return TrainingCenter.type;
   }

   @Override
   public String toString() {
      return super.toString() + "\nNúmero de dormitórios: " + this.nBedroom;
   }
}