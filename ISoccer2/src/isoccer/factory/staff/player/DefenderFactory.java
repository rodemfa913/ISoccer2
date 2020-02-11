package isoccer.factory.staff.player;

import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.player.Defender;

public class DefenderFactory extends MemberFactory {
   public static final DefenderFactory me = new DefenderFactory();

   private DefenderFactory() {}

   @Override
   public Defender create() throws Exception {
      Defender defender = new Defender(PlayerFactory.me.getCount());
      this.setInfo(defender);
      return defender;
   }

   @Override
   public String getTag() {
      return Defender.type;
   }
}