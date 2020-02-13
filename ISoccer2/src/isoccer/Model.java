package isoccer;

import isoccer.exception.NotFoundException;
import isoccer.factory.partner.FanPartner;
import isoccer.factory.resource.Stadium;
import isoccer.factory.resource.TrainingCenter;
import isoccer.factory.resource.Transport;
import isoccer.factory.staff.Coach;
import isoccer.factory.staff.Member;
import isoccer.factory.staff.player.Player;
import java.util.ArrayList;
import java.util.HashMap;

public class Model {
   private Coach coach;
   private int count;
   private HashMap<Integer, Transport> fleet;
   private HashMap<Integer, Member> members;
   public static final Model me = new Model();
   private HashMap<Integer, FanPartner> partners;
   private HashMap<Integer, Player> players;
   private Stadium stadium;
   private TrainingCenter trainingCenter;

   private Model() {
      this.fleet = new HashMap<>();
      this.members = new HashMap<>();
      this.partners = new HashMap<>();
      this.players = new HashMap<>();
   }

   public Transport getBus(int id) throws Exception {
      Transport bus = this.fleet.get(id);

      if (bus == null)
         throw new NotFoundException();

      return bus;
   }

   public Coach getCoach() throws Exception {
      if (this.coach == null)
         throw new NotFoundException();

      return this.coach;
   }

   public int getCount() {
      return this.count++;
   }

   public ArrayList<Transport> getFleet() {
      return new ArrayList<>(this.fleet.values());
   }

   public Member getMember(int id) throws Exception {
      Member member = this.members.get(id);

      if (member == null)
         throw new NotFoundException();

      return member;
   }

   public ArrayList<Member> getMembers() {
      return new ArrayList<>(this.members.values());
   }

   public FanPartner getPartner(int id) throws Exception {
      FanPartner partner = this.partners.get(id);

      if (partner == null)
         throw new NotFoundException();

      return partner;
   }

   public ArrayList<FanPartner> getPartners() {
      return new ArrayList<>(this.partners.values());
   }

   public Player getPlayer(int id) throws Exception {
      Player player = this.players.get(id);

      if (player == null)
         throw new NotFoundException();

      return player;
   }

   public ArrayList<Player> getPlayers() {
      return new ArrayList<>(this.players.values());
   }

   public Stadium getStadium() throws Exception {
      if (this.stadium == null)
         throw new NotFoundException();

      return this.stadium;
   }

   public TrainingCenter getTrainingCenter() throws Exception {
      if (this.trainingCenter == null)
         throw new NotFoundException();

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