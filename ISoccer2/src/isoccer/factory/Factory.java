package isoccer.factory;

public interface Factory<T> {
   public T create() throws Exception;
   public String getTag();
}