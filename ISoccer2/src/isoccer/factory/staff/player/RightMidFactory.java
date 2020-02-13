package isoccer.factory.staff.player;

import isoccer.Model;
import isoccer.factory.staff.player.RightMid;

public class RightMidFactory extends PlayerFactory {
   public static final RightMidFactory me = new RightMidFactory();

   private RightMidFactory() {}

   @Override
   public RightMid create() {
      return new RightMid(Model.me.getCount());
   }

   @Override
   public String getTag() {
      return RightMid.type;
   }
}