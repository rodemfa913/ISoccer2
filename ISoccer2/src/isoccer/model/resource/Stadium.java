package isoccer.model.resource;

public class Stadium extends Resource {
   public int capacity, numberOfWC, numberOfSnackBar;

   public Stadium(int id) {
      super(id);
   }

   @Override
   public String toString() {
      return super.toString() + "\nCapacidade: " + this.capacity + "\nNúmero de banheiros: " +
         this.numberOfWC + "\nNúmero de lanchonetes: " + this.numberOfSnackBar;
   }
}