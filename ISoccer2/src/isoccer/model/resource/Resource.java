package isoccer.model.resource;

public abstract class Resource {
   public boolean available;
   public final int id;
   public String name;

   public Resource(int id) {
      this.id = id;
      this.name = "-";
   }

   @Override
   public String toString() {
      return "Nome: " + this.name + "\nDisponível: " + (this.available ? "sim" : "não");
   }
}