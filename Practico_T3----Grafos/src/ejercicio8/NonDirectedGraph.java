package ejercicio8;

public class NonDirectedGraph extends Grafo {

	@Override
	public void connectNodes(Node n1, Node n2) {
		n1.addAdyacent(n2);
		n2.addAdyacent(n1);
	}

}
