package isoccer.model.staff.player;

import isoccer.model.Model;
import isoccer.model.staff.player.RightMid;

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