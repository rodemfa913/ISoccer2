package isoccer.command;

import isoccer.ISoccer;
import isoccer.factory.staff.player.Player;
import isoccer.factory.staff.player.PlayerFactory;

public class ManagePlayer implements Command {
   public static final ManagePlayer me = new ManagePlayer();

   private ManagePlayer() {}

   @Override
   public void execute() throws Exception {
      Player player = PlayerFactory.getPlayer();
      System.out.print("Inapto? (s/n): ");
      player.unable = ISoccer.input.nextLine().toLowerCase().equals("s");
   }

   @Override
   public String getTag() {
      return "gerenciar jogador";
   }
}