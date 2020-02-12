package isoccer.exception;

public class NotFoundException extends Exception {
   private static final long serialVersionUID = 1L;

   public NotFoundException() {
      super("Não encontrado.");
   }
}