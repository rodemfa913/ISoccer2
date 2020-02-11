package isoccer.factory.staff.player;

import isoccer.model.staff.player.RightMid;

public class RightMidFactory extends PlayerFactory {
   public static final RightMidFactory me = new RightMidFactory();

   private RightMidFactory() {}

   @Override
   public RightMid create() throws Exception {
      RightMid rightMid = new RightMid(this.getCount());
      this.setInfo(rightMid);
      return rightMid;
   }

   @Override
   public String getTag() {
      return RightMid.type;
   }
}