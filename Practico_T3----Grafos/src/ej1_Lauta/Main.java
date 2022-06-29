package ej1_Lauta;

public class Main {

	public static void main(String[] args) {
		Graph g1 = new DirectedGraph();
		
		Node n1 = new Node(10);
		Node n2 = new Node(5);
		Node n3 = new Node(7);
		Node n4 = new Node(2);
		
		Graph g2 = new NonDirectedGraph();
		
		Node m1 = new Node(10);
		Node m2 = new Node(5);
		Node m3 = new Node(7);
		Node m4 = new Node(2);
		
		g1.addNode(n1);
		g1.addNode(n2);
		g1.addNode(n3);
		g1.addNode(n4);
		
		g1.connectNodes(n1, n2);
		g1.connectNodes(n3, n4);
		g1.connectNodes(n1, n4);
		
		g1.printGraph();
		
		g2.addNode(m1);
		g2.addNode(m2);
		g2.addNode(m3);
		g2.addNode(m4);
		
		g2.connectNodes(m1, m2);
		g2.connectNodes(m2, m3);
		g2.connectNodes(m1, m4);
		
		g2.printGraph();
		
		

	}

}
