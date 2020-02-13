package isoccer.command;

import isoccer.ISoccer;
import isoccer.factory.resource.Resource;
import isoccer.factory.resource.ResourceFactory;
import isoccer.factory.resource.StadiumFactory;
import isoccer.factory.resource.TrainingCenterFactory;
import isoccer.factory.resource.TransportFactory;

public class AddResource implements Command {
   private ResourceFactory[] factories;
   public static final AddResource me = new AddResource();

   private AddResource() {
      this.factories = new ResourceFactory[] {
         TransportFactory.me, StadiumFactory.me, TrainingCenterFactory.me
      };
   }

   @Override
   public void execute() throws Exception {
      System.out.println();
      int r;

      for (r = 0; r < this.factories.length; r++)
         System.out.println(r + " - " + this.factories[r].getTag());

      System.out.print("\nTipo: ");
      r = Integer.parseInt(ISoccer.input.nextLine());
      ResourceFactory factory = this.factories[r];
      Resource resource = factory.create();
      factory.setInfo(resource);
      factory.put(resource);

      System.out.println(
         "Recurso físico '" + resource.getType() + " " +
         resource.id + ": " + resource.getName() + "' adicionado."
      );
   }

   @Override
   public String getTag() {
      return "adicionar recurso físico";
   }
}