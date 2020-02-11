package isoccer.factory.staff.player;

import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.player.RightMid;

public class RightMidFactory extends MemberFactory {
   public static final RightMidFactory me = new RightMidFactory();

   private RightMidFactory() {}

   @Override
   public RightMid create() throws Exception {
      RightMid rightMid = new RightMid(PlayerFactory.me.getCount());
      this.setInfo(rightMid);
      return rightMid;
   }

   @Override
   public String getTag() {
      return RightMid.type;
   }
}