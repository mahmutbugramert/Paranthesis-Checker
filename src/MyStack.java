
package question;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class MyStack{
	
	private Character[] a; // array of items
	
	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

	public MyStack() { //constructor, it creates new character array sized 4
		a = new Character[4];
	}
	
	public boolean isEmpty() { // checks if stack is empty or not
		if(a[0] == null)
			return true;
		else {
			return false;
		}
	}

	public int size() { // returns the numbers of element in the array
		int i = 0;
		while(i < a.length && a[i] != null) {
			i++;
		}
		return i;
	}
	
	private void resize() {	// doubles the length of the array if needed
		int sizeOfTheA = a.length;
		int newSizeOfTheA = 2*sizeOfTheA;
		Character[] tempArray = a.clone();
		a = new Character[newSizeOfTheA];
		for(int i=0; i < tempArray.length; i++) {
			a[i] = tempArray[i];				
		}	
	}
	
	public void push(char item) { // adds new char to stack
		for(int i = 0; i < a.length; i++) {
			if(a[i] == null) {
				a[i] = item;
				return;
			}		
		}
		resize();
		for(int j = 0; j < a.length; j++) {
			if(a[j] == null) {
				a[j] = item;
				return;
			}	
				
		}	
	}
	
	public Character pop() { // pops the last character from the array and returns it
		for(int i = 0; i < a.length; i++) {
			if(a[i] == null) {
				Character element = a[i-1];
				a[i-1] =  null;
				return element;
			}		
		}
		
		Character element2 = a[a.length-1];
		a[a.length-1] = null;
		return element2;
	}
	
	public Character peek() { // returns the last element of the array
		if(a[0] == null)
			return null;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == null) {
				return a[i-1];
			}		
		}
		return a[a.length-1];
	}
	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
	
}

