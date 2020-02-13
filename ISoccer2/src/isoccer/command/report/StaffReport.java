package isoccer.command.report;

import isoccer.factory.staff.Coach;
import isoccer.factory.staff.CoachFactory;
import isoccer.factory.staff.Member;
import isoccer.factory.staff.general.GeneralFactory;
import isoccer.factory.staff.player.Player;
import isoccer.factory.staff.player.PlayerFactory;
import java.util.ArrayList;

public class StaffReport implements Report {
   public static final StaffReport me = new StaffReport();

   private StaffReport() {}

   @Override
   public void generate() {
      System.out.println("Técnico:");

      try {
         Coach coach = CoachFactory.me.get();
         System.out.println("\n" + coach);
      } catch (Exception ex) {}

      ArrayList<Player> ablePlayers = new ArrayList<>();
      ArrayList<Player> unablePlayers = new ArrayList<>();

      for (Player player : PlayerFactory.getPlayers())
         if (player.unable)
            unablePlayers.add(player);
         else
            ablePlayers.add(player);

      System.out.println("\nJogadores:\n  Aptos:");

      for (Player player : ablePlayers)
         System.out.println("\n" + player);

      System.out.println("\n  Inaptos:");

      for (Player player : unablePlayers)
         System.out.println("\n" + player);

      System.out.println("\nFuncionários:");

      for (Member member : GeneralFactory.getMembers())
         System.out.println("\n" + member);
   }

   @Override
   public String getTag() {
      return "funcionários";
   }
}