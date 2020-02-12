package isoccer.model.staff.player;

import isoccer.model.staff.player.CentreMid;

public class CentreMidFactory extends PlayerFactory {
   public static final CentreMidFactory me = new CentreMidFactory();

   private CentreMidFactory() {}

   @Override
   public CentreMid create() {
      return new CentreMid(this.getCount());
   }

   @Override
   public String getTag() {
      return CentreMid.type;
   }
}