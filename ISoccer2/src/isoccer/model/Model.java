package isoccer.model;

import isoccer.model.partner.FanPartner;
import isoccer.model.staff.*;
import isoccer.model.staff.player.Player;
import java.util.ArrayList;
import java.util.HashMap;

public class Model {
   private Coach coach;
   private HashMap<Integer, Member> generalMembers;
   public static final Model me = new Model();
   private static Exception notFoundException = new Exception("Não encontrado.");
   private HashMap<Integer, FanPartner> partners;
   private HashMap<Integer, Player> players;

   private Model() {}

   public Coach getCoach() {
      return this.coach;
   }

   public ArrayList<Member> getGeneralMembers() {
      return new ArrayList<>(this.generalMembers.values());
   }

   public FanPartner getPartner(int id) throws Exception {
      FanPartner partner = this.partners.get(id);

      if (partner == null)
         throw Model.notFoundException;

      return partner;
   }

   public ArrayList<FanPartner> getPartners() {
      return new ArrayList<>(this.partners.values());
   }

   public Player getPlayer(int id) throws Exception {
      Player player = this.players.get(id);

      if (player == null)
         throw Model.notFoundException;

      return player;
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

   public void setPartner(FanPartner partner) {
      this.partners.put(partner.id, partner);
   }
}