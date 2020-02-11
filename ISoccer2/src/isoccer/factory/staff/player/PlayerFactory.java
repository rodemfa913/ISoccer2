package isoccer.factory.staff.player;

import isoccer.ISoccer;
import isoccer.factory.staff.MemberFactory;
import isoccer.model.staff.player.Player;

public class PlayerFactory extends MemberFactory {
   private int count;
   public static final PlayerFactory me = new PlayerFactory();
   private MemberFactory[] factories;

   private PlayerFactory() {
      this.factories = new MemberFactory[] {
         GoalKeeperFactory.me, DefenderFactory.me, DefMidFactory.me,
         CentreMidFactory.me, LeftMidFactory.me, RightMidFactory.me, ForwardFactory.me
      };
   }

   @Override
   public Player create() throws Exception {
      System.out.println();
      int p;

      for (p = 0; p < this.factories.length; p++)
         System.out.println(p + " - " + this.factories[p].getTag());

      System.out.print("\nPosição: ");
      p = Integer.parseInt(ISoccer.input.nextLine());
      return (Player) this.factories[p].create();
   }

   public int getCount() {
      return this.count++;
   }

   @Override
   public String getTag() {
      return Player.type;
   }
}