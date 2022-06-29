package ejercicio4_versionFinal;

import java.util.LinkedList;
import java.util.List;

public abstract class Graph {
	
	private List<Node> vertices;
	
	public Graph() {
		vertices = new LinkedList<Node>();
	}
	
	public void addNode(Node n) {
		vertices.add(n);
	}
	
	public abstract void connectNodes(Node n1, Node n2);
	
	public LinkedList<Node> getVertices() {
		return new LinkedList<Node>(vertices);
	}

	public void printGraph() {
		for (Node n : vertices) {
			System.out.println(n.printAdyacentNodes1());
		}
	}
	
	

}
