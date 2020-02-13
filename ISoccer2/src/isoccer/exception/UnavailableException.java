package isoccer.exception;

public class UnavailableException extends Exception {
   private static final long serialVersionUID = 1L;

   public UnavailableException() {
      super("Indisponível.");
   }
}