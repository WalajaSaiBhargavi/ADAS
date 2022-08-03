package dataStructures.stack;

import java.util.*;

public class SortAStack {
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();
		myStack.push(5);
		myStack.push(8);
		myStack.push(7);
		myStack.push(2);
		myStack.push(0);
		myStack.push(9);
		myStack.push(11);
		sortStack(myStack);
		while(!myStack.isEmpty()) {
			System.out.print(myStack.pop());
		}
	}

	public static void sortStack(Stack<Integer> myStack) {
		if(!myStack.isEmpty()) {
			int temp = myStack.pop();
			sortStack(myStack);
			sortStack(myStack, temp);
		}
	}

	private static void sortStack(Stack<Integer> myStack, int temp) {
		if(myStack.isEmpty()) {
			myStack.push(temp);
		} else {
			int a = myStack.pop();
			if(a < temp) {
				sortStack(myStack, temp);
				myStack.push(a);
			} else {
				sortStack(myStack, a);
				myStack.push(temp);
			}
		}
	}
}
