package isoccer.model.staff.player;

import isoccer.model.staff.player.Forward;

public class ForwardFactory extends PlayerFactory {
   public static final ForwardFactory me = new ForwardFactory();

   private ForwardFactory() {}

   @Override
   public Forward create() {
      return new Forward(this.getCount());
   }

   @Override
   public String getTag() {
      return Forward.type;
   }
}