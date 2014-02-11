package structures;


public class ConsList<T> implements MyList<T> {
	private final T head;
	private final ConsList<T> tail;
	
	public ConsList(){
		this.head=null;
		this.tail=null;
	}
	
	public ConsList(T head){
		this(head,null);
	}
	public ConsList(T head,ConsList<T> lst){
		if (head.equals(null)&& !lst.equals(null)){
			this.head=lst.getHead();
			this.tail=lst.getTail();
		}
		else{
			this.head=head;
			this.tail=lst;
		}
	}

	@Override
	public ConsList<T> cons(T t) {
		return new ConsList<T>(t,this);
	}

	@Override
	public T getHead() {
		return this.head;
	}

	@Override
	public ConsList<T> getTail(){
		return this.tail;
	}

	@Override
	public boolean isEmpty() {
		return this.head == null;
	}

	@Override
	public int length() {
		if (this.isEmpty())
		  return 0;
		else{
			return 1+tail.length();
		}
	}
	@Override
	public String toString(){
		return "["+this._string();
	}
	private String _string(){
		if (this.isEmpty()){
			return "[]";
		}
		if (tail.isEmpty()){
			return head.toString()+"]";
		}
		return head.toString()+", "+tail._string();
	}
}






