package isoccer.model.resource;

public class TrainingCenter extends Resource {
   public int numberOfBedroom;

   public TrainingCenter(int id) {
      super(id);
   }

   @Override
   public String toString() {
      return super.toString() + "\nNúmero de dormitórios: " + this.numberOfBedroom;
   }
}