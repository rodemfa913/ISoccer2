package isoccer.model.resource;

public class Transport extends Resource {
   protected int nSeat;
   public static final String type = "transporte";

   protected Transport(int id) {
      super(id);
   }

   public int getNumberOfSeats() {
      return this.nSeat;
   }

   @Override
   public String getType() {
      return Transport.type;
   }

   @Override
   public String toString() {
      return super.toString() + "\nNúmero de assentos: " + this.nSeat;
   }
}