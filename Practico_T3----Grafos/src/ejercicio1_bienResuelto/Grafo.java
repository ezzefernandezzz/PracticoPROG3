package ejercicio1_bienResuelto;

import java.util.LinkedList;
import java.util.List;

public abstract class Grafo {
	
	private List<Nodo> vertices;
	
	public Grafo() {
		vertices = new LinkedList<Nodo>();
	}
	
	public void addNode(Nodo n) {
		vertices.add(n);
	}
	
	public abstract void conectarNodos(Nodo n1, Nodo n2);

	public void printGraph() {
		for (Nodo n : vertices) {
			System.out.println(n.printAdyacentNodes1());
		}
	}
	
	

}
