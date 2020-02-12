package isoccer.model.staff.player;

import isoccer.model.Model;
import isoccer.model.staff.player.DefMid;

public class DefMidFactory extends PlayerFactory {
   public static final DefMidFactory me = new DefMidFactory();

   private DefMidFactory() {}

   @Override
   public DefMid create() {
      return new DefMid(Model.me.getCount());
   }

   @Override
   public String getTag() {
      return DefMid.type;
   }
}