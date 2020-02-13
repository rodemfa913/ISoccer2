package isoccer.factory.staff.player;

import isoccer.factory.staff.Member;

public abstract class Player extends Member {
   public static final String type = "jogador";
   public boolean unable;

   protected Player(int id) {
      super(id);
   }
}