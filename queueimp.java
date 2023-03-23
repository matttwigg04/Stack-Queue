
public class queueimp {
	
	Node first;
	Node last;
	int size;
	
	public queueimp() {
		first = new Node();
		last = new Node();
		size = 0;
		
	}
	
	

	
	public void enqueue(Object element) {
		Node oldLast = last;
		last  = new Node();
		last.setElt(element);
		if(size == 0) {
			first = last;
		}
		oldLast.setNext(last);		
		size++;
	}
	
	public Object peak() {
		if(first == null) {
			if(last == null) {
				return null;
			}
		}
		return first.getElt();
	}
	
	public Object dequeue() {
		Object oldFirst = first.getElt();
		first = first.getNext();
		if(size == 0) {
			last = null;
		}
		size--;
		return oldFirst;
		
		
		
		
	}

}
