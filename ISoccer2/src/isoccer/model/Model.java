package isoccer.model;

import isoccer.model.staff.Coach;
import isoccer.model.staff.Member;
import isoccer.model.staff.player.Player;
import java.util.ArrayList;
import java.util.HashMap;

public class Model {
   private Coach coach;
   private HashMap<Integer, Member> generalMembers;
   public static final Model me = new Model();
   private HashMap<Integer, Player> players;

   private Model() {}

   public Coach getCoach() {
      return this.coach;
   }

   public ArrayList<Member> getGeneralMembers() {
      return new ArrayList<>(this.generalMembers.values());
   }

   public Player getPlayer(int id) {
      return this.players.get(id);
   }

   public ArrayList<Player> getPlayers() {
      return new ArrayList<>(this.players.values());
   }

   public void setMember(Member member) {
      if (member instanceof Coach)
         this.coach = (Coach) member;
      else if (member instanceof Player) {
         Player player = (Player) member;
         this.players.put(player.id, player);
      } else
         this.generalMembers.put(member.id, member);
   }
}