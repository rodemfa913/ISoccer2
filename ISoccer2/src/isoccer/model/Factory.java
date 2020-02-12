package isoccer.model;

public interface Factory<T> {
   public T create();
   public String getTag();
   public void setInfo(T t) throws Exception;
   public void put(T t);
}