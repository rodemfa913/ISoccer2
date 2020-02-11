package isoccer.model.staff.player;

import isoccer.model.staff.player.Defender;

public class DefenderFactory extends PlayerFactory {
   public static final DefenderFactory me = new DefenderFactory();

   private DefenderFactory() {}

   @Override
   public Defender create() throws Exception {
      Defender defender = new Defender(this.getCount());
      this.setInfo(defender);
      return defender;
   }

   @Override
   public String getTag() {
      return Defender.type;
   }
}