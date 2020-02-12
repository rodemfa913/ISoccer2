package isoccer.model.staff.player;

import isoccer.model.staff.Member;

public abstract class Player extends Member {
   public static final String type = "jogador";
   protected boolean unable;

   protected Player(int id) {
      super(id);
   }

   public boolean isUnable() {
      return this.unable;
   }
}