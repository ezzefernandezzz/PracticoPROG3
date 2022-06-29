package ejercicio5;

import java.util.LinkedList;
import java.util.List;

public class ListaCaminos {

	public List<Node> bucarCamino(Grafo g, Node vDestino){
		List<Node> verticesCaminoDestino = new LinkedList<Node>();
		for (Node vertice : g.getVertices()) {
			if(!vertice.equals(vDestino))
				if (llegaDestino(vertice, vDestino))
					verticesCaminoDestino.add(vertice);
		}
		return verticesCaminoDestino;
	}
	
	public boolean llegaDestino(Node vActual, Node vDestino) {
		if(vActual.hasAdyacentNodes())
			for (Node vAdyacente : vActual.getAdyacentNodes()) {
				if (llegaDestino(vAdyacente, vDestino))
					return true;
			}
		if(vActual.equals(vDestino)) {
				System.out.println("PRUEBAAA");
				return true;
		}
		
		return false;
	}
}
