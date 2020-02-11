package isoccer.model.staff.player;

import isoccer.model.staff.player.DefMid;

public class DefMidFactory extends PlayerFactory {
   public static final DefMidFactory me = new DefMidFactory();

   private DefMidFactory() {}

   @Override
   public DefMid create() throws Exception {
      DefMid defMid = new DefMid(this.getCount());
      this.setInfo(defMid);
      return defMid;
   }

   @Override
   public String getTag() {
      return DefMid.type;
   }
}