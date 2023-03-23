import java.util.*;
public class Tester {
	public static void main(String[] args) {
		stackimp nums = new stackimp();
		nums.push(15);
		nums.push(8);
		System.out.println("Stack");
		System.out.println(nums.pop());
		System.out.println(nums.peak());
		
		System.out.println();
		
		System.out.println("Queue");
		
		queueimp myQueue = new queueimp();
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(3);
		myQueue.enqueue(4);
		myQueue.enqueue(5);
		System.out.println(myQueue.peak());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.peak());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.peak());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.peak());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.peak());
		
	
		
		
	}
	
}
