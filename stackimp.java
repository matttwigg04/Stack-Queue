import java.util.*;

public class stackimp implements Stack{
	Object[] myStack = new Object[5];
	int top = 0;

	
	public Object peak() {
		Object front;
        top--;
        front = myStack[top];
        return front;
	}

	
	public void push(Object element) {
		myStack[top] = element;
	    top++;

		
	}

	
	public Object pop() {
		Object front;
        top--;
        front = myStack[top];
        myStack[top] = 0;
        return front;
	}

}





