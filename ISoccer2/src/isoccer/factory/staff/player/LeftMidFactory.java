package isoccer.factory.staff.player;

import isoccer.model.staff.player.LeftMid;

public class LeftMidFactory extends PlayerFactory {
   public static final LeftMidFactory me = new LeftMidFactory();

   private LeftMidFactory() {}

   @Override
   public LeftMid create() throws Exception {
      LeftMid leftMid = new LeftMid(this.getCount());
      this.setInfo(leftMid);
      return leftMid;
   }

   @Override
   public String getTag() {
      return LeftMid.type;
   }
}