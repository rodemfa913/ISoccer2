package isoccer.factory.staff.player;

import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.player.LeftMid;

public class LeftMidFactory extends MemberFactory {
   public static final LeftMidFactory me = new LeftMidFactory();

   private LeftMidFactory() {}

   @Override
   public LeftMid create() throws Exception {
      LeftMid leftMid = new LeftMid(PlayerFactory.me.getCount());
      this.setInfo(leftMid);
      return leftMid;
   }

   @Override
   public String getTag() {
      return LeftMid.type;
   }
}