package isoccer.factory.staff.player;

import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.player.DefMid;

public class DefMidFactory extends MemberFactory {
   public static final DefMidFactory me = new DefMidFactory();

   private DefMidFactory() {}

   @Override
   public DefMid create() throws Exception {
      DefMid defMid = new DefMid(PlayerFactory.me.getCount());
      this.setInfo(defMid);
      return defMid;
   }

   @Override
   public String getTag() {
      return DefMid.type;
   }
}