package ejercicio1;

import java.util.ArrayList;

public class GrafoDirigido{
	private Vertice listaVertices;

	public GrafoDirigido() {
		this.listaVertices = null;
	}
	
	public void relacion(int vertice, int arista) {
		if(this.listaVertices == null)
			listaVertices = new Vertice(vertice);
			
		addRelacion(this.listaVertices, vertice, arista);
	}
	
	public void addRelacion(Vertice l, int vertice, int arista) {
		//System.out.println("Insertar en vertice: " + vertice + " la arista: " + arista);
		if(l.getDato() == vertice) {
			l.addArista(arista);
		}
		else
			if(l.getSiguiente() == null) {
				Vertice aux = new Vertice(vertice);
				aux.addArista(arista);
				l.setSiguiente(aux);
			}
			else
				addRelacion((Vertice)l.getSiguiente(), vertice, arista);
	}
	
	public void imprimirGrafo() {
		imprimirVertices(listaVertices);
	}
	
	public void imprimirVertices(ModeloNodo v) {
		if(v != null) {
			v.imprimir();
			imprimirVertices(v.getSiguiente());			
		}
	}

	
	

}
