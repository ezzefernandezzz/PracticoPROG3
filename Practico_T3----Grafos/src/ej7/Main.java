package ej7;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		/*Graph g1 = new DirectedGraph();
		
		Node n1 = new Node(10); Node n2 = new Node(5);	Node n3 = new Node(7);
		Node n4 = new Node(2);	Node n5 = new Node(12);	Node n6 = new Node(1);
		Node n7 = new Node(25); 
		
		g1.connectNodes(n1, n2); //10 -> 5  g1.connectNodes(n1, n3); //10 -> 7
		g1.connectNodes(n4, n1); //2 -> 10 	g1.connectNodes(n3, n5); //7 -> 12
		g1.connectNodes(n5, n2); //12 -> 5	g1.connectNodes(n3, n6); //7 -> 1
		g1.connectNodes(n6, n5); //1 -> 12	g1.connectNodes(n4, n3); //2 -> 7
		g1.connectNodes(n2, n7); //5 -> 25
				
		g1.addNode(n1);		g1.addNode(n2);		g1.addNode(n3);
		g1.addNode(n4);		g1.addNode(n5);		g1.addNode(n6);
		g1.addNode(n7); */
		
		/*Node n2 = new Node(2);		Node n7 = new Node(7);		Node n10 = new Node(10);
		Node n5 = new Node(5);		Node n11 = new Node(11);	Node n4 = new Node(4);
		Node n17 = new Node(17);	Node n23 = new Node(23);	Node n32 = new Node(32);
		Node n45 = new Node(45);	Node n57 = new Node(57);	Node n71 = new Node(71);
		
		g1.connectNodes(n2, n7);	g1.connectNodes(n7, n5);	g1.connectNodes(n7, n11);
		g1.connectNodes(n10, n4);	g1.connectNodes(n11, n17);	g1.connectNodes(n11, n23);
		g1.connectNodes(n4, n23);	g1.connectNodes(n4, n32);	g1.connectNodes(n2, n10);
		g1.connectNodes(n32, n57);	g1.connectNodes(n45, n71); g1.connectNodes(n23, n45);
		
		g1.addNode(n2); g1.addNode(n7); g1.addNode(n10);
		g1.addNode(n5); g1.addNode(n11); g1.addNode(n4);
		g1.addNode(n17); g1.addNode(n23); g1.addNode(n32);
		g1.addNode(n45); g1.addNode(n57); g1.addNode(n71);
		
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
		
		//g2.printGraph();*/
				
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
		//System.out.println(tool.longestPathFinder(g2, n4, n7));
		
		//System.out.println(tool.possibleStartNodes(g1, n71));
		
		//System.out.println(tool.shortestPathFinder(g1, n2, n45));
		
		
		
		Graph g1 = new ej7.DirectedGraph();
		
		Node n1 = new Node(10);
		Node n2 = new Node(5);
		Node n3 = new Node(7);
		Node n4 = new Node(2);
		Node n5 = new Node(12);
		Node n6 = new Node(1);
		
		g1.connectNodes(n1, n2); //10 -> 5
		g1.connectNodes(n1, n3); //10 -> 7
		g1.connectNodes(n4, n1); //2 -> 10
		g1.connectNodes(n3, n5); //7 -> 12
		g1.connectNodes(n5, n2); //12 -> 5
		g1.connectNodes(n3, n6); //7 -> 1
		g1.connectNodes(n6, n5); //1 -> 12
		g1.connectNodes(n4, n3); //2 -> 7
		
		g1.addNode(n1);
		g1.addNode(n2);
		g1.addNode(n3);
		g1.addNode(n4);
		g1.addNode(n5);
		g1.addNode(n6);
		
		tool.shortestPathFinder(g1, n1, n5);
		System.out.println(tool.shortestPathFinder(g1, n1, n5));
		//tool.altBreadthFirstSearch(g1, n4, n2);
		
		//g1.printGraph();

	}

}
