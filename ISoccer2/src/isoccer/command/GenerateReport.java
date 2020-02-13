package isoccer.command;

import isoccer.ISoccer;
import isoccer.command.report.*;

public class GenerateReport implements Command {
   public static final GenerateReport me = new GenerateReport();
   private Report[] reports;

   private GenerateReport() {
      this.reports = new Report[] {StaffReport.me, ResourceReport.me, PartnerReport.me};
   }

   @Override
   public void execute() {
      System.out.println();
      int r;

      for (r = 0; r < this.reports.length; r++)
         System.out.println(r + " - " + this.reports[r].getTag());

      System.out.print("\nOpção: ");
      r = Integer.parseInt(ISoccer.input.nextLine());
      this.reports[r].generate();
   }

   @Override
   public String getTag() {
      return "relatório";
   }
}