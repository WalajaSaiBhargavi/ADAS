package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	
	static Node rootNode;
	
	/*
	 *                   1......3 
	 *                   .
	 *                   .
	 *                   2......5
	 *                   .
	 *                   .
	 *                   4
	 */
	
	public static void main(String[] args) {
		rootNode = new Node(1);
		rootNode.left = new Node(2);
		rootNode.right = new Node(3);
		rootNode.left.left = new Node(4);
		rootNode.left.right = new Node(5);
		/*
		rootNode.left.left.left = new Node(6);
		rootNode.left.right.right = new Node(7);
		rootNode.left.right.right.right = new Node(8);
		rootNode.left.right.right.right.left = new Node(9);*/
		System.out.print("In Order Traversal");
		System.out.println();
		inOrder(rootNode);
		System.out.println();
		System.out.println("In Order Traversal using Stack");
		inorderStack();
		System.out.println();
		System.out.println("Pre Order Traversal");
		preorder(rootNode);
		System.out.println();
		System.out.println("Post Order Traversal");
		postorder(rootNode);
		System.out.println();
		System.out.println("Level Order Traversal");
		levelOrder(rootNode);
		System.out.println();
		System.out.println("Depth of tree");
		System.out.print(findDepth(rootNode));
	}

	private static void postorder(Node node) {
		if(node == null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data);
	}

	private static void inorderStack() {
		if(rootNode == null)
			return;
		Stack<Node> s = new Stack<>();
		Node current = rootNode;
		while(!s.isEmpty() || current != null) {
			while(current != null) {
				s.push(current);
				current = current.left;
			}
			current = s.pop();
			System.out.print(current.data);
			current = current.right;
		}
	}
	
	private static void preorder(Node node) {
		if(node == null)
			return;
		System.out.print(node.data);
		preorder(node.left);
		preorder(node.right);
	}
	
	public static void levelOrder(Node rootNode){
		if(rootNode == null)
			return;
		Node current = rootNode;
		Queue<Node> q = new LinkedList<>();
		while(!q.isEmpty() || current != null) {
			if(current != null) {
				System.out.print(current.data);
				q.offer(current.left);
				q.offer(current.right);
			}
			current = q.poll();
		}
	}
	
	private static int findDepth(Node node) {
		if(node == null)
			return 0;
		if(node.left == null && node.right == null)
			return 0;
		return Math.max(findDepth(node.left) + 1, findDepth(node.right) + 1);
	}
	
	private static void inOrder(Node node) {
		if(node == null)
			return;
		inOrder(node.left);
		System.out.print(node.data);
		inOrder(node.right);
	}
}
