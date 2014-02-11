package structures;

public interface MyList<T> {
	public  MyList<T> cons (T t);
	public  T getHead();
	public  MyList<T> getTail();
	public  boolean isEmpty();
	public  int length();
}
