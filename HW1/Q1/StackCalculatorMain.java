import java.util.Stack;

/**
 * @date October 26, 2020
 * @author Errica Cheng (eycheng)
 * 
 * This program utilizes the StackCalculator class
 * and demonstrates the Stack Calculator's functionality.
 */

public class StackCalculatorMain {
	public static void main(String[] args) {
		System.out.println("Hello world! Below are the outputs for various expressions. See the java files for more details.");
		
		stackWorksExpressionOne();
		stackWorksExpressionTwo();
		stackWorksExpressionThree();
		stackNotWorking();
		stackSquareValidation();
		stackLogValidation();
	}
	
	// Helper method to show the StackCalculator class works for (sqrt(25) + 3)
	static void stackWorksExpressionOne() {
		String[] allowList = new String[] { "(", "sqrt", "(", "25",")", "+", "3", ")"};
		Stack<String> Stack = new Stack<String>();

		for (String allows : allowList) {
			Stack.push(allows);
		}
		
		StackCalculator calculator = new StackCalculator(Stack);
	}
	
	// Helper method to show the StackCalculator class works for ((4+1)+3)
	static void stackWorksExpressionTwo() {
		String[] allowList = new String[] { "(", "(", "4", "+", "1",")", "+", "3", ")"};
		Stack<String> Stack = new Stack<String>();

		for (String allows : allowList) {
			Stack.push(allows);
		}
		
		StackCalculator calculator = new StackCalculator(Stack);
	}
	
	// Helper method to show the StackCalculator class works for ((5+6)-1)
	static void stackWorksExpressionThree() {
		String[] allowList = new String[] { "(", "(", "5", "+", "6",")", "-", "1", ")"};
		Stack<String> Stack = new Stack<String>();

		for (String allows : allowList) {
			Stack.push(allows);
		}
		
		StackCalculator calculator = new StackCalculator(Stack);
	}
	
	// Helper method to show the StackCalculator class doesn't work correctly for (4+1*3)
	static void stackNotWorking() {
		String[] allowList = new String[] { "(", "4", "+", "1", "*", "3", ")"};
		Stack<String> Stack = new Stack<String>();

		for (String allows : allowList) {
			Stack.push(allows);
		}
		
		StackCalculator calculator = new StackCalculator(Stack);
	}
	
	// Helper method to show the StackCalculator class works for custom function sqar in expression ((2^2)+1)
	static void stackSquareValidation() {
		String[] allowList = new String[] { "(", "sqar", "2", ")", "+", "1", ")"};
		Stack<String> Stack = new Stack<String>();

		for (String allows : allowList) {
			Stack.push(allows);
		}
		
		StackCalculator calculator = new StackCalculator(Stack);
	}
	
	// Helper method to show the StackCalculator class works for custom function log10 in expression log10(15)
	static void stackLogValidation() {
		String[] allowList = new String[] {"(", "log10", "15", ")"};
		Stack<String> Stack = new Stack<String>();

		for (String allows : allowList) {
			Stack.push(allows);
		}
		
		StackCalculator calculator = new StackCalculator(Stack);
	}
}
