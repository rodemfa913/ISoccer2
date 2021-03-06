package isoccer.command.member;

import isoccer.ISoccer;
import isoccer.command.Command;
import isoccer.factory.staff.player.CentreMidFactory;
import isoccer.factory.staff.player.DefMidFactory;
import isoccer.factory.staff.player.DefenderFactory;
import isoccer.factory.staff.player.ForwardFactory;
import isoccer.factory.staff.player.GoalKeeperFactory;
import isoccer.factory.staff.player.LeftMidFactory;
import isoccer.factory.staff.player.Player;
import isoccer.factory.staff.player.PlayerFactory;
import isoccer.factory.staff.player.RightMidFactory;

public class AddPlayer implements Command {
   private PlayerFactory[] factories;
   public static final AddPlayer me = new AddPlayer();

   private AddPlayer() {
      this.factories = new PlayerFactory[] {
         GoalKeeperFactory.me, DefenderFactory.me, DefMidFactory.me, CentreMidFactory.me,
         LeftMidFactory.me, RightMidFactory.me, ForwardFactory.me
      };
   }

   @Override
   public void execute() throws Exception {
      System.out.println();
      int p;

      for (p = 0; p < this.factories.length; p++)
         System.out.println(p + " - " + this.factories[p].getTag());

      System.out.print("\nPosição: ");
      p = Integer.parseInt(ISoccer.input.nextLine());
      PlayerFactory factory = this.factories[p];
      Player player = (Player) factory.create();
      factory.setInfo(player);
      factory.put(player);
      System.out.println("Jogador '" + player.id + ": " + player.getName() + "' adicionado.");
   }

   @Override
   public String getTag() {
      return Player.type;
   }
}