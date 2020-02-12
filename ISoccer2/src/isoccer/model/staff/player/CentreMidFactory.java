package isoccer.model.staff.player;

import isoccer.model.Model;
import isoccer.model.staff.player.CentreMid;

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