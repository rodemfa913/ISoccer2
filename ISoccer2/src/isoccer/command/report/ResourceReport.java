package isoccer.command.report;

import isoccer.factory.resource.Stadium;
import isoccer.factory.resource.StadiumFactory;
import isoccer.factory.resource.TrainingCenter;
import isoccer.factory.resource.TrainingCenterFactory;
import isoccer.factory.resource.Transport;
import isoccer.factory.resource.TransportFactory;
import java.util.ArrayList;

public class ResourceReport implements Report {
   public static final ResourceReport me = new ResourceReport();

   private ResourceReport() {}

   @Override
   public void generate() {
      System.out.println("Transporte:");

      try {
         ArrayList<Transport> fleet = TransportFactory.me.getFleet();

         for (Transport transport : fleet)
            System.out.println("\n" + transport);
      } catch (Exception ex) {
         System.out.println(ex.getMessage());
      }

      System.out.println("\nEstádio:");

      try {
         Stadium stadium = StadiumFactory.me.get();
         System.out.println("\n" + stadium);
      } catch (Exception ex) {
         System.out.println(ex.getMessage());
      }

      System.out.println("\nCentro de treinamento:");

      try {
         TrainingCenter trainingCenter = TrainingCenterFactory.me.get();
         System.out.println("\n" + trainingCenter);
      } catch (Exception ex) {
         System.out.println(ex.getMessage());
      }
   }

   @Override
   public String getTag() {
      return "recursos físicos";
   }
}