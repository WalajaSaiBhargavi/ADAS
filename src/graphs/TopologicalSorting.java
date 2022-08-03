package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TopologicalSorting {
	
	static Stack<Node> s = new Stack<>();

	public static void main(String[] args) {
		Graph g = new Graph();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		g.addEdge(n1, n2); //(1,2)
		g.addEdge(n1, n3); //(1,3)
		g.addEdge(n2, n4); //(2,4)
		g.addEdge(n2, n5); //(2,5)
		//g.addEdge(n2, n1); //(2,1)
		topologicalSort(5, g);
		checkCycle(s, g);
	}

	private static void checkCycle(Stack<Node> s, Graph g) {
		Map<Node, Integer> pos = new HashMap<>();
		
		int k = 0;
		while(!s.isEmpty()) {
			pos.put(s.peek(), k);
			k++;
			System.out.print(s.pop().data);
		}
		for(int j = 0; j < 5; j++) {
			for(Node n : g.nodes.get(j)) {
				if(pos.get(g.nodes.get(j).get(0)) > pos.get(n)) {
					System.out.print("Cycle!!!");
				}
			}
		}
		
	}

	private static void topologicalSort(int i, Graph g) {
		boolean visited[] = new boolean[i];
		
		for(ArrayList<Node> nodes : g.nodes) {
			topologicalSortUtil(nodes.get(0), visited, s, g);
		}

	}

	private static void topologicalSortUtil(Node node2, boolean[] visited, Stack<Node> s, Graph g) {
		if(!visited[g.getIndex(node2)]) {
			visited[g.getIndex(node2)] = true;
			for(Node node : g.getArrayOfNode(node2)) {
				if(!visited[g.getIndex(node)]) {
					topologicalSortUtil(node, visited, s, g);
				}
			}
			s.push(node2);
		}
	}
}
