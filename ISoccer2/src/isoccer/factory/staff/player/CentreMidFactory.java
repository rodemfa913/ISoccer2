package isoccer.factory.staff.player;

import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.player.CentreMid;

public class CentreMidFactory extends MemberFactory {
   public static final CentreMidFactory me = new CentreMidFactory();

   private CentreMidFactory() {}

   @Override
   public CentreMid create() throws Exception {
      CentreMid centreMid = new CentreMid(PlayerFactory.me.getCount());
      this.setInfo(centreMid);
      return centreMid;
   }

   @Override
   public String getTag() {
      return CentreMid.type;
   }
}