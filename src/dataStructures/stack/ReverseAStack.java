// Java code to reverse a
// stack using recursion
package dataStructures.stack;

import java.util.Stack;

/**
 * 
 * Reverse a Stack without using loop and using recursion
 * Two methods - 
 * One method which inserts anything in the bottom of the stack
 *
 */

class ReverseAStack {

	static void insert_at_bottom(char x, Stack<Character> st) {
		if (st.isEmpty()) {
			st.push(x);
		} else {
			char temp = st.pop();
			insert_at_bottom(x, st);
			st.push(temp);
		}
	}

	static void reverse(Stack<Character> st) {
		if (!st.isEmpty()) {
			char temp = st.pop();
			reverse(st);
			insert_at_bottom(temp, st);
		}
	}

	public static void main(String[] args) {
		Stack<Character> st = new Stack<>();
		st.push('1');
		st.push('2');
		st.push('3');
		st.push('4');
		System.out.println("Original Stack");
		System.out.println(st);
		reverse(st);
		System.out.println("Reversed Stack");
		System.out.println(st);
	}
}
