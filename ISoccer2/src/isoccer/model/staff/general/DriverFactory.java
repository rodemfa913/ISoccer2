package isoccer.model.staff.general;

import isoccer.ISoccer;
import isoccer.model.staff.Member;
import isoccer.model.staff.general.Driver;

public class DriverFactory extends GeneralFactory {
   public static final DriverFactory me = new DriverFactory();

   private DriverFactory() {}

   @Override
   public Driver create() {
      return new Driver(this.getCount());
   }

   @Override
   public String getTag() {
      return Driver.type;
   }

   @Override
   public void setInfo(Member member) throws Exception {
      super.setInfo(member);
      Driver driver = (Driver) member;
      System.out.print("CNH: ");
      driver.cnh = Long.parseLong(ISoccer.input.nextLine());
   }
}