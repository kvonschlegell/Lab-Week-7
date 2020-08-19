// This class implements a Stack ADT as a linked list
public class LinkedStack {
	LinkedNode front; // Reference to the first LinkedNode in the list
	int count; // Number of nodes in the list

	// Constructor - initializes the front and count variables
	LinkedStack() {
		front = null;
		count = 0;
	}

	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
		newNode.next = front;
		front = newNode;
		count++;
	}

	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}

	// Implements the peek operation
	int peek() {
		return front.x;
	}

	// Implements the isEmpty operation
	boolean isEmpty() {
		return front == null;
	}

	// Implements the size operation
	int size() {
		return count;
	}

	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}

	void removeBottomHalf() {

		// time complexity is O(2n)
		// O(n)+O(n/2)+O(n/2)
		LinkedStack stack = new LinkedStack();

		int currentCount = count;
		int halfCount = count / 2;
		// iterating through the stack
		// Time complexity for this for loop is O(n)
		for (int i = 0; i < currentCount; i++) {
			stack.push(pop());
		}
		// popped the bottom half of the stack; LIFO
		// Time complexity for this loop is O(n/2)
		// because only half of N is iterating through this loop
		for (int i = 0; i < halfCount; i++) {
			stack.pop();	
		}
		// Time complexity for this loop is O(n/2)
		// because only half of N is being considered in this loop
		while (stack.isEmpty() != false) {
			push(stack.pop());
			
		}
		System.out.println("\nTop of half of stack: " + stack);
	}
}