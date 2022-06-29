package ejercicio2DFS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class Grafo {
	private int tiempo;
	
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
	
	public void dfs() {
		for (Nodo vertice : vertices) {
			vertice.setColor("BLANCO");
		}
		this.tiempo = 0;
		for (Nodo vertice : vertices) {
			if (vertice.getColor().equals("BLANCO"))
				dfs_visit(vertice);
		}
	}
	
	public void dfs_visit(Nodo nodo){
		nodo.setColor("AMARILLO");
		tiempo = tiempo + 1;
		nodo.setDescubrimiento(tiempo);
		
		List<Nodo> listAdyacentes = nodo.getAdyacent();
		for (Nodo _n : listAdyacentes) {
			if (_n.getColor().equals("BLANCO"))
				dfs_visit(_n);
		}
		nodo.setColor("NEGRO");
		tiempo = tiempo + 1;
		nodo.set_final(tiempo);
		nodo.imprimirNodo();
	}
	
	

}
