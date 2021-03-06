package isoccer.factory.resource;

import isoccer.ISoccer;
import isoccer.factory.Factory;

public abstract class ResourceFactory implements Factory<Resource> {
   @Override
   public void setInfo(Resource resource) throws Exception {
      resource.available = true;
      System.out.print("Nome: ");
      String name = ISoccer.input.nextLine();

      if (name.isEmpty())
         name = "-";

      resource.name = name;
   }
}