package isoccer.model.resource;

public abstract class Resource {
   protected boolean available;
   public final int id;
   protected String name;

   protected Resource(int id) {
      this.id = id;
      this.name = "-";
   }

   public String getName() {
      return this.name;
   }

   public abstract String getType();

   public boolean isAvailable() {
      return this.available;
   }

   @Override
   public String toString() {
      return "Nome: " + this.name + "\nDisponível: " + (this.available ? "sim" : "não");
   }
}