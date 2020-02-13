package isoccer.factory.staff.player;

import isoccer.Model;
import isoccer.factory.staff.player.DefMid;

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