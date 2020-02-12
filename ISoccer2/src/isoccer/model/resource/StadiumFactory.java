package isoccer.model.resource;

import isoccer.ISoccer;
import isoccer.model.Model;

public class StadiumFactory extends ResourceFactory {
   public static final StadiumFactory me = new StadiumFactory();

   private StadiumFactory() {}

   @Override
   public Stadium create() {
      return new Stadium(0);
   }

   @Override
   public Stadium get() throws Exception {
      return Model.me.getStadium();
   }

   @Override
   public String getTag() {
      return Stadium.type;
   }

   @Override
   public void put(Resource resource) {
      Model.me.setStadium((Stadium) resource);
   }

   @Override
   public void setInfo(Resource resource) throws Exception {
      super.setInfo(resource);
      Stadium stadium = (Stadium) resource;
      System.out.print("Capacidade: ");
      int capacity = Integer.parseInt(ISoccer.input.nextLine());

      if (capacity < 0)
         capacity = 0;

      stadium.capacity = capacity;
      System.out.print("Número de banheiros: ");
      int nWC = Integer.parseInt(ISoccer.input.nextLine());

      if (nWC < 0)
         nWC = 0;

      stadium.nWC = nWC;
      System.out.print("Número de lanchonetes: ");
      int nSnackBar = Integer.parseInt(ISoccer.input.nextLine());

      if (nSnackBar < 0)
         nSnackBar = 0;

      stadium.nSnackBar = nSnackBar;
   }
}