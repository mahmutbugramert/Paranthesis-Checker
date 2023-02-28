
package question;

import java.util.Arrays;

public class ParanthesisChecker {


	public boolean isCorrect(String javaCode) { 

		//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
		MyStack newStack = new MyStack(); //constructs new Mystack object
		for(int i = 0; i < javaCode.length(); i++) { // this for loop turns every character in javacode
			if(javaCode.charAt(i) == '"') { // this if increases i if i is double quotation until next double quotation
				int a = i+1;
				for(; a < javaCode.length(); a++) {
					if(javaCode.charAt(a) == '"') {
						i = a;
						break;
					}

				}
			}
			if(javaCode.charAt(i) == '\'') { //this if increases i if i is single quotation until next single quotation
				int b = i+1;
				for(; b < javaCode.length(); b++) {
					if(javaCode.charAt(b) == '\'') {
						i = b;
						break;
					}

				}
			}
			if(javaCode.charAt(i) == '{') { // this if pushes { to newStack if char at i is { 
				newStack.push(javaCode.charAt(i));
			}
			if(javaCode.charAt(i) == '(') { // this if pushes ( to newStack if char at i is (
				newStack.push(javaCode.charAt(i));
			}
			if(javaCode.charAt(i) == '}') { // this if controls if char at i is }, if not, it returns false, if it is, it pops { from newStack and continues
				if(newStack.size() == 0)
					return false;
				if(newStack.pop() == '{') {
					continue;
				}
				else {
					return false;
				}
			}
			if(javaCode.charAt(i) == ')') { // this if controls if char at i is ), if not, it returns false, if it is, it pops ( from newStack and continue
				if(newStack.size() == 0)
					return false;
				if(newStack.pop() == '(') {
					continue;
				}
				else {
					return false;
				}
			}
		}
		
		if(newStack.isEmpty() == true) { // this if returns true if the stack is empty, returns false if stack is not empty
			return true;
		}
		else {
			return false;
		}

		//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

	}

}


