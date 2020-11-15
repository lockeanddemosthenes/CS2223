/**
 * Code adapted from p. 129 of Sedgewick
 */

import java.util.EmptyStackException;
import java.util.Stack;

public class StackCalculator {
	Stack expression = null;
	Stack<String> ops = new Stack<String>();
	Stack<Double> vals = new Stack<Double>();
	
	public StackCalculator(Stack<String> Stack) {
		
		expression = Stack;
		if(expression.size() == 0) {
			throw new EmptyStackException();
		} else this.eval();
		
	}
	
	void eval() {
		//change while parameters to the string input
		for(Object token : this.expression) {
			// Read token, push if operator.
			String currToken = (String) token;
			
			if (currToken.equals("(")) ;
			else if (currToken.equals("+")) ops.push(currToken);
			else if (currToken.equals("-")) ops.push(currToken);
			else if (currToken.equals("*")) ops.push(currToken);
			else if (currToken.equals("/")) ops.push(currToken);
			else if (currToken.equals("sqrt")) ops.push(currToken);
			else if (currToken.equals("sqar")) ops.push(currToken);
			else if (currToken.equals("log10")) ops.push(currToken);
			else if (currToken.equals(")")) {
				// Pop, evaluate, and push result if token is ")".
				String op = ops.pop();
				double v = vals.pop();
				if (op.equals("+")) v = vals.pop() + v;
				else if (op.equals("-")) v = vals.pop() - v;
				else if (op.equals("*")) v = vals.pop() * v;
				else if (op.equals("/")) v = vals.pop() / v;
				else if (op.equals("sqrt")) v = Math.sqrt(v);
				else if (op.equals("sqar")) v = Math.pow(v,2);
				else if (op.equals("log10")) v = Math.log10(v);
				vals.push(v);
			}
			else vals.push(Double.parseDouble(currToken)); // Token not operator or paren: push double value.
		}
	System.out.println(vals.pop());
	}
}