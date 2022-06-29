package ejercicio4_versionFinal;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Graph g1 = new DirectedGraph();
		
		Node n1 = new Node(10);
		Node n2 = new Node(5);
		Node n3 = new Node(7);
		Node n4 = new Node(2);
		Node n5 = new Node(12);
		Node n6 = new Node(1);
		Node n7 = new Node(25);
		
		g1.connectNodes(n1, n2); //10 -> 5
		g1.connectNodes(n1, n3); //10 -> 7
		g1.connectNodes(n4, n1); //2 -> 10
		g1.connectNodes(n3, n5); //7 -> 12
		g1.connectNodes(n5, n2); //12 -> 5
		g1.connectNodes(n3, n6); //7 -> 1
		g1.connectNodes(n6, n5); //1 -> 12
		g1.connectNodes(n4, n3); //2 -> 7
		g1.connectNodes(n2, n7); //5 -> 25
		
		g1.addNode(n1);
		g1.addNode(n2);
		g1.addNode(n3);
		g1.addNode(n4);
		g1.addNode(n5);
		g1.addNode(n6);
		g1.addNode(n7);
		
		
		//g1.printGraph();
		
		Graph g2 = new NonDirectedGraph();
		
		Node m1 = new Node(10);
		Node m2 = new Node(5);
		Node m3 = new Node(7);
		Node m4 = new Node(2);
		
		g2.addNode(m1);
		g2.addNode(m2);
		g2.addNode(m3);
		g2.addNode(m4);
		
		g2.connectNodes(m1, m2);
		g2.connectNodes(m2, m3);
		g2.connectNodes(m1, m4);
		
		//g2.printGraph();
				
		GraphTraversalTool tool = new GraphTraversalTool();
		
		//tool.depthFirstSearch(g1);
		
		/*
		Queue<Node> ady = new ArrayDeque<Node>();
		
		ady.add(m1);
		ady.add(m2);
		System.out.println(ady);
		ady.remove();
		System.out.println(ady);
		
		tool.BreadthFirstSearch(g1);
		*/
		
		//g1.printGraph();
		
		//tool.pathFinder(g1, n4, n2);
		System.out.println(tool.longestPathFinder(g2, n4, n7));
		
		//tool.altBreadthFirstSearch(g1, n4, n2);
		
		//g1.printGraph();

	}

}
