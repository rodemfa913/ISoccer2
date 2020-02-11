package isoccer.model.staff;

import isoccer.ISoccer;
import isoccer.model.staff.player.CentreMidFactory;
import isoccer.model.staff.player.DefenderFactory;
import isoccer.model.staff.player.DefMidFactory;
import isoccer.model.staff.player.ForwardFactory;
import isoccer.model.staff.player.GoalKeeperFactory;
import isoccer.model.staff.player.LeftMidFactory;
import isoccer.model.staff.player.Player;
import isoccer.model.staff.player.PlayerFactory;
import isoccer.model.staff.player.RightMidFactory;

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