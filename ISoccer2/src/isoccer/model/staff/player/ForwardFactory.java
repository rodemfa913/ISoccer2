package isoccer.model.staff.player;

import isoccer.model.staff.player.Forward;

public class ForwardFactory extends PlayerFactory {
   public static final ForwardFactory me = new ForwardFactory();

   private ForwardFactory() {}

   @Override
   public Forward create() throws Exception {
      Forward forward = new Forward(this.getCount());
      this.setInfo(forward);
      return forward;
   }

   @Override
   public String getTag() {
      return Forward.type;
   }
}