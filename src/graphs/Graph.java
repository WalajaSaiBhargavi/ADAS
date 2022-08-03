package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;


public class Graph {

	 ArrayList<ArrayList<Node>> nodes;
	
	public Graph() {
		nodes = new ArrayList<>();
	}
	
	public  void addEdge(Node n12, Node n22) {
		List<Node> n1 = getArrayOfNode(n12);
		if(n1 == null) {
			n1 = new ArrayList<>();
			n1.add(n12);
			nodes.add((ArrayList<Node>) n1);
		}
		List<Node> n2 = getArrayOfNode(n22);
		if(n2 == null) {
			n2 = new ArrayList<>();
			n2.add(n22);
			nodes.add((ArrayList<Node>) n2);
		}
		if(!n1.contains(n22)) {
			n1.add(n22);
		}
	}

	public List<Node> getArrayOfNode(Node node) {
		for(ArrayList<Node> n : nodes) {
			if(n.get(0) == node) {
				return n;
			}
		}
		return null;
	}
	
	public void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		addEdge(n1, n2);
		addEdge(n1, n3);
		addEdge(n2, n4);
		addEdge(n2, n5);
		levelOrder(n1);
	}
	
	public void levelOrder(Node rootNode){
		if(rootNode == null)
			return;
		Node current = rootNode;
		Queue<Node> q = new LinkedList<>();
		Set<Node> visited = new HashSet<>();
		visited.add(current);
		while(!q.isEmpty() || current != null) {
			if(current != null) {
				System.out.print(current.data);
				for(ArrayList<Node> nodeArray : nodes) {
					if(nodeArray.get(0).equals(current)) {
						for(Node n : nodeArray) {
							if(!visited.contains(n)) {
								visited.add(n);
								q.add(n);
							}
						}
					}
				}
			}
			current = q.poll();
		}
	}

	public int getIndex(Node node2) {
		int i = 0;
		for(ArrayList<Node> n : nodes) {
			if(n.get(0) == node2) {
				return i;
			}
			i++;
		}
		return 0;
	}
}
