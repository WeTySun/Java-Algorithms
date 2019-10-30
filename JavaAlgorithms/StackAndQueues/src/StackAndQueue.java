import java.util.Arrays;

public class StackAndQueue {
	
	private String[] stackArray;
	
	private int stackSize;
	
	private int topOfStack = -1;
	
	StackAndQueue(int size){
		stackSize = size;
		
		stackArray = new String[size];
		
		Arrays.fill(stackArray, "-1");
		
	}
	
	public void push(String input) {
		if(topOfStack + 1 < stackSize) {
			topOfStack++;
			
			stackArray[topOfStack] = input;
			
		} else System.out.println("Sorry But the Stack is Full");
		
		display
	}
	
	public void displayTheStack() {
		for(int n = 0; n < 61; n++) System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < stackSize; n++) {
			System.out.format("| %2 " + " ", n);
		}
	}
	
	public static void main(String[] args) {
		
	}
}
