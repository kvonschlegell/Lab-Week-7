
public class Driver {

	public static void main(String[] args) {
		LinkedStack link = new LinkedStack();
		ArrayStack array = new ArrayStack();
		
		link.push(1);
		link.push(7);
		link.push(3);
		link.push(4);
		link.push(9);
		link.push(2);
		
		array.push(1);
		array.push(7);
		array.push(3);
		array.push(4);
		array.push(9);
		array.push(2);
		
		while(link.size() > 0 && array.size() > 0) {
			System.out.println("Pop from link list: " + link.pop() + " Pop from array list: " + array.pop()); 
		}
		
		// pushing in values for the stack
		link.push(1);
		link.push(7);
		link.push(3);
		link.push(4);
		link.push(9);
		link.push(2);
		
		// Removes bottom half of the stack
		link.removeBottomHalf();
		
	
		

	}

	
}

