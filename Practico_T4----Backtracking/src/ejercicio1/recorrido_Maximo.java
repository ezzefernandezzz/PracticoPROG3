package ejercicio1;

import java.util.LinkedList;
import java.util.List;

import GrafoYHerramientas.*;

public class recorrido_Maximo {
	List<Node> recorrido_final = new LinkedList<Node>();
	
	public void encontrar_ruta(Graph g, Node entrada, Node salida) {
		iniciar_nodos(g);
		List<Node> recorrido_parcial = new LinkedList<Node>();
		EF(entrada, salida, recorrido_parcial);
		//System.out.println(recorrido_parcial);
		
		System.out.println(recorrido_final);
		
	}
	
	public void EF(Node n_actual, Node n_final, List<Node> ruta) {
		//System.out.println(ruta);
		if(n_actual.getStatus().equals("no_visitado")) {
			n_actual.setStatus("visitado");
			if(n_actual.hasAdyacentNodes()) {
				ruta.add(n_actual);
				for (Node n_ady : n_actual.getAdyacentNodes()) {
					List<Node> branch_parcial = new LinkedList<Node>();
					branch_parcial.addAll(ruta);
					if(n_ady.equals(n_final)) 
						comparar_rutas(branch_parcial);
					EF(n_ady, n_final, branch_parcial);
				}
				
			}
		}
	}
	
	public void comparar_rutas(List<Node> l) {
		if(recorrido_final.size() < l.size()) {
			recorrido_final = new LinkedList<Node>();
			recorrido_final.addAll(l);
		}
	}
	
	public void iniciar_nodos(Graph g) {
		for (Node n : g.getVertices()) {
			n.setStatus("no_visitado");
		}
	}
}
