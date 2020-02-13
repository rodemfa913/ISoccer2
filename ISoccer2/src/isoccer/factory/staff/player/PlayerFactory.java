package isoccer.factory.staff.player;

import isoccer.ISoccer;
import isoccer.Model;
import isoccer.factory.staff.Member;
import isoccer.factory.staff.MemberFactory;
import java.util.ArrayList;

public abstract class PlayerFactory extends MemberFactory {
   @Override
   public Player get() throws Exception {
      return PlayerFactory.getPlayer();
   }

   public static Player getPlayer() throws Exception {
      System.out.print("Id: ");
      int id = Integer.parseInt(ISoccer.input.nextLine());
      return Model.me.getPlayer(id);
   }

   public static ArrayList<Player> getPlayers() {
      return Model.me.getPlayers();
   }

   @Override
   public void put(Member member) {
      Model.me.setPlayer((Player) member);
   }
}