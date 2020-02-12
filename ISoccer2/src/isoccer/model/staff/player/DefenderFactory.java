package isoccer.model.staff.player;

import isoccer.model.Model;
import isoccer.model.staff.player.Defender;

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