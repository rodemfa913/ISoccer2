package isoccer.factory.staff.general;

import isoccer.ISoccer;
import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.Member;
import isoccer.model.staff.general.Driver;

public class DriverFactory extends MemberFactory {
   public static final DriverFactory me = new DriverFactory();

   private DriverFactory() {}

   @Override
   public Driver create() throws Exception {
      Driver driver = new Driver(GeneralFactory.me.getCount());
      this.setInfo(driver);
      return driver;
   }

   @Override
   public String getTag() {
      return Driver.type;
   }
   @Override
   protected void setInfo(Member member) throws Exception {
      super.setInfo(member);
      Driver driver = (Driver) member;
      System.out.print("CNH: ");
      driver.cnh = Long.parseLong(ISoccer.input.nextLine());
   }
}