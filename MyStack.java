import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Simple implementation of Stack using two Queues
 * 
 * @author <Your Name> (<Your Pennkey>)
 * @param <K>
 */

public class MyStack<K>
{
	/**
	 * Create a new stack with given queues.
	 */
	public MyStack(Queue<K> q1, Queue<K> q2){
		//TODO: Fill in the constructor
	}
	
	/**
	 * Push an element onto the top of the stack.
	 * @param k The element to push.
	 */
	public void push(K k) {
		//TODO: Add an element to the stack
	}

	/**
	 * Pops the top element off the stack. 
	 * @return The top element on the stack.
	 * @throws NoSuchElementException When popping an empty stack.
	 */
	public K pop() throws NoSuchElementException {
		//TODO: Remove an element from the stack
		return null;
	}

	public boolean isEmpty() {
		//TODO: Check if the stack is empty
		return false;
	}
}