package Ejercicio2BFS;

import java.util.LinkedList;
import java.util.List;

public abstract class Grafo {
	private LinkedList<Nodo> filaVertices;
	
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
	
	public void BFS() {
		filaVertices = new LinkedList<Nodo>();
		for (Nodo vertice : vertices) {
			vertice.setEstado("NO_VISITADO");
		}
		
		for (Nodo vertice : vertices) {
			if(vertice.getEstado().equals("NO_VISITADO"))
				this.BFS(vertice);
		}
	}
	
	public void BFS(Nodo vertice) {
		vertice.setEstado("VISITADO");
		filaVertices.add(vertice);
		while(!filaVertices.isEmpty()) {
			Nodo x = filaVertices.getFirst();
			filaVertices.removeFirst();
			for (Nodo y : x.getAdyacent()) {
				if(y.getEstado().equals("NO_VISITADO")) {
					y.setEstado("VISITADO");
					filaVertices.add(y);
				}
				
			}
		}
	}
	
	
	
	

}
