package isoccer.model.resource;

public class Stadium extends Resource {
   protected int capacity, nWC, nSnackBar;
   public static final String type = "estádio";

   protected Stadium(int id) {
      super(id);
   }

   public int getCapacity() {
      return this.capacity;
   }

   public int getNumberOfWC() {
      return this.nWC;
   }

   public int getNumberOfSnackBars() {
      return this.nSnackBar;
   }

   @Override
   public String getType() {
      return Stadium.type;
   }

   @Override
   public String toString() {
      return super.toString() + "\nCapacidade: " + this.capacity + "\nNúmero de banheiros: " +
         this.nWC + "\nNúmero de lanchonetes: " + this.nSnackBar;
   }
}