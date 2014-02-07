package rangag.practise.leetcode;
import java.util.Stack;

public class ValidateParanthesis {
	public static void main(String[] args) throws Exception {		
		if (!new ValidateParanthesis().isValid("(([{}]))")) {
			throw new Exception("This has to be true");
		}
		if (!new ValidateParanthesis().isValid("()")) {
			throw new Exception("This has to be true");
		}
		if (new ValidateParanthesis().isValid("(([{]}))")) {
			throw new Exception("This has to be false");
		}
		if (new ValidateParanthesis().isValid("(")) {
			throw new Exception("This has to be false");
		}
		if (new ValidateParanthesis().isValid(")")) {
			throw new Exception("This has to be false");
		}
		if (new ValidateParanthesis().isValid("")) {
			throw new Exception("This has to be false");
		}
		if (new ValidateParanthesis().isValid("x")) {
			throw new Exception("This has to be false");
		}
	}

	public boolean isValid(String s) {
		if (s == null || s.isEmpty()) {
			System.out.println("Empty string");
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			boolean valid = true;
			switch (c) {
			case '(':
			case '[':
			case '{':
				stack.push(c);
				break;
			case ')':
				valid = isValidPop(stack, '(');				
				break;
			case ']':
				valid = isValidPop(stack, '[');
				break;
			case '}':
				valid = isValidPop(stack, '{');
				break;
			default:
				System.out.println("Invalid Char");
				return false;
			}
			if (!valid) {
				System.out.println("Invalid Paranthesis " + s);
				return false;
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		System.out.println("Invalid Paranthesis " + s);
		return false;
	}

	private boolean isValidPop(Stack<Character> stack, char matching) {
		if (stack.isEmpty()) {
			return false;
		}
		Character p = stack.pop();
		if (p == null || p != matching) {
			return false;
		}
		return true;
	}
}
