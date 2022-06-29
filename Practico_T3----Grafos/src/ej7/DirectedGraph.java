package ej7;

public class DirectedGraph extends Graph {

	@Override
	public void connectNodes(Node n1, Node n2) {
		n1.addAdyacent(n2);

	}

}
