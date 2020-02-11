package isoccer.factory.staff;

import isoccer.ISoccer;
import isoccer.factory.staff.player.*;
import isoccer.model.staff.player.Player;

public class PlayersFactory extends MemberFactory {
   private PlayerFactory[] factories;
   public static final PlayersFactory me = new PlayersFactory();

   private PlayersFactory() {
      this.factories = new PlayerFactory[] {
         GoalKeeperFactory.me, DefenderFactory.me, DefMidFactory.me, CentreMidFactory.me,
         LeftMidFactory.me, RightMidFactory.me, ForwardFactory.me
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

   @Override
   public String getTag() {
      return Player.type;
   }
}