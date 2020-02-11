package isoccer.factory.staff.player;

import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.player.Forward;

public class ForwardFactory extends MemberFactory {
   public static final ForwardFactory me = new ForwardFactory();

   private ForwardFactory() {}

   @Override
   public Forward create() throws Exception {
      Forward forward = new Forward(PlayerFactory.me.getCount());
      this.setInfo(forward);
      return forward;
   }

   @Override
   public String getTag() {
      return Forward.type;
   }
}