package isoccer.factory;

public interface Factory<T> {
   public T create();
   public T get() throws Exception;
   public String getTag();
   public void put(T t);
   public void setInfo(T t) throws Exception;
}