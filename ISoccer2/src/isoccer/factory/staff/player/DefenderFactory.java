package isoccer.factory.staff.player;

import isoccer.Model;
import isoccer.factory.staff.player.Defender;

public class DefenderFactory extends PlayerFactory {
   public static final DefenderFactory me = new DefenderFactory();

   private DefenderFactory() {}

   @Override
   public Defender create() {
      return new Defender(Model.me.getCount());
   }

   @Override
   public String getTag() {
      return Defender.type;
   }
}