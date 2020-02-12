package isoccer.model.resource;

import isoccer.ISoccer;
import isoccer.model.Model;

public class TransportFactory extends ResourceFactory {
   private int count;
   public static final TransportFactory me = new TransportFactory();

   private TransportFactory() {}

   @Override
   public Transport create() {
      return new Transport(this.count++);
   }

   @Override
   public String getTag() {
      return Transport.type;
   }

   @Override
   public void setInfo(Resource resource) throws Exception{
      super.setInfo(resource);
      Transport bus = (Transport) resource;
      System.out.print("Número de assentos: ");
      int nSeat = Integer.parseInt(ISoccer.input.nextLine());

      if (nSeat < 0)
         nSeat = 0;

      bus.nSeat = nSeat;
   }

   @Override
   public void put(Resource resource) {
      Model.me.setBus((Transport) resource);
   }
}