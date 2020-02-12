package isoccer.model.staff.player;

import isoccer.model.Model;
import isoccer.model.staff.player.LeftMid;

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