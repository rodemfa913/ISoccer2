package isoccer.factory.staff.player;

import isoccer.Model;
import isoccer.factory.staff.player.CentreMid;

public class CentreMidFactory extends PlayerFactory {
   public static final CentreMidFactory me = new CentreMidFactory();

   private CentreMidFactory() {}

   @Override
   public CentreMid create() {
      return new CentreMid(Model.me.getCount());
   }

   @Override
   public String getTag() {
      return CentreMid.type;
   }
}