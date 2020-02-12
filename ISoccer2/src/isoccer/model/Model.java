package isoccer.model;

import isoccer.model.partner.FanPartner;
import isoccer.model.resource.Stadium;
import isoccer.model.resource.TrainingCenter;
import isoccer.model.resource.Transport;
import isoccer.model.staff.*;
import isoccer.model.staff.player.Player;
import java.util.ArrayList;
import java.util.HashMap;

public class Model {
   private Coach coach;
   private HashMap<Integer, Transport> fleet;
   private HashMap<Integer, Member> members;
   public static final Model me = new Model();
   private Exception notFoundException;
   private HashMap<Integer, FanPartner> partners;
   private HashMap<Integer, Player> players;
   private Stadium stadium;
   private TrainingCenter trainingCenter;

   private Model() {
      this.fleet = new HashMap<>();
      this.members = new HashMap<>();
      this.notFoundException = new Exception("Não encontrado.");
      this.partners = new HashMap<>();
      this.players = new HashMap<>();
   }

   public Transport getBus(int id) throws Exception {
      Transport bus = this.fleet.get(id);

      if (bus == null)
         throw this.notFoundException;

      return bus;
   }

   public Coach getCoach() throws Exception {
      if (this.coach == null)
         throw this.notFoundException;

      return this.coach;
   }

   public ArrayList<Transport> getFleet() {
      return new ArrayList<>(this.fleet.values());
   }

   public Member getMember(int id) throws Exception {
      Member member = this.members.get(id);

      if (member == null)
         throw this.notFoundException;

      return member;
   }

   public ArrayList<Member> getMembers() {
      return new ArrayList<>(this.members.values());
   }

   public FanPartner getPartner(int id) throws Exception {
      FanPartner partner = this.partners.get(id);

      if (partner == null)
         throw this.notFoundException;

      return partner;
   }

   public ArrayList<FanPartner> getPartners() {
      return new ArrayList<>(this.partners.values());
   }

   public Player getPlayer(int id) throws Exception {
      Player player = this.players.get(id);

      if (player == null)
         throw this.notFoundException;

      return player;
   }

   public ArrayList<Player> getPlayers() {
      return new ArrayList<>(this.players.values());
   }

   public Stadium getStadium() throws Exception {
      if (this.stadium == null)
         throw this.notFoundException;

      return this.stadium;
   }

   public TrainingCenter getTrainingCenter() throws Exception {
      if (this.trainingCenter == null)
         throw this.notFoundException;

      return this.trainingCenter;
   }

   public void setBus(Transport bus) {
      this.fleet.put(bus.id, bus);
   }

   public void setCoach(Coach coach) {
      this.coach = coach;
   }

   public void setMember(Member member) {
      this.members.put(member.id, member);
   }

   public void setPartner(FanPartner partner) {
      this.partners.put(partner.id, partner);
   }

   public void setPlayer(Player player) {
      this.players.put(player.id, player);
   }

   public void setStadium(Stadium stadium) {
      this.stadium = stadium;
   }

   public void setTrainingCenter(TrainingCenter trainingCenter) {
      this.trainingCenter = trainingCenter;
   }
}