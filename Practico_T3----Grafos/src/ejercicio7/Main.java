package ejercicio7;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Grafo g1 = new DirectedGraph();
		
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
		
		
		//g1.printGraph();
		
		Grafo g2 = new NonDirectedGraph();
		
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
		
		EncontrarCaminoCorto lc = new EncontrarCaminoCorto();
		
		//System.out.println(lc.bucarCamino(g1, n2));
		//System.out.println(lc.bucarCamino(g1, n4, n1, n2));	//Desde 2 hasta 5 quitando el nodo 10
		//System.out.println(lc.bucarCamino(g1, n4, n3, n6)); //Desde 2 hasta 1 quitando el nodo 7
		System.out.println(lc.bucarCaminoCorto(g1, n1, n5));
		//GraphTraversalTool tool = new GraphTraversalTool();
		
		

	}

}
