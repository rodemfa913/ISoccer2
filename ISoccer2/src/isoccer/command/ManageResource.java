package isoccer.command;

import isoccer.ISoccer;
import isoccer.factory.resource.Resource;
import isoccer.factory.resource.ResourceFactory;
import isoccer.factory.resource.StadiumFactory;
import isoccer.factory.resource.TrainingCenterFactory;
import isoccer.factory.resource.TransportFactory;

public class ManageResource implements Command {
   private ResourceFactory[] getters;
   public static final ManageResource me = new ManageResource();

   private ManageResource() {
      this.getters = new ResourceFactory[] {
         TransportFactory.me, StadiumFactory.me, TrainingCenterFactory.me
      };
   }

   @Override
   public void execute() throws Exception {
      System.out.println();
      int r;

      for (r = 0; r < this.getters.length; r++)
         System.out.println(r + " - " + this.getters[r].getTag());

      System.out.print("\nRecurso: ");
      r = Integer.parseInt(ISoccer.input.nextLine());
      Resource resource = this.getters[r].get();
      System.out.print("Disponível? (s/n): ");
      resource.available = ISoccer.input.nextLine().toLowerCase().equals("s");
   }

   @Override
   public String getTag() {
      return "gerenciar recurso físico";
   }
}