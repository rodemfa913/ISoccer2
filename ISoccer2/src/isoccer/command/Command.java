package isoccer.command;

public interface Command {
   public void execute() throws Exception;
   public String getTag();
}