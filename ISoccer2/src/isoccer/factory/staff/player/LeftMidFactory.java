package isoccer.factory.staff.player;

import isoccer.Model;
import isoccer.factory.staff.player.LeftMid;

public class LeftMidFactory extends PlayerFactory {
   public static final LeftMidFactory me = new LeftMidFactory();

   private LeftMidFactory() {}

   @Override
   public LeftMid create() {
      return new LeftMid(Model.me.getCount());
   }

   @Override
   public String getTag() {
      return LeftMid.type;
   }
}