package ejercicio7;

import java.util.LinkedList;
import java.util.List;

public class EncontrarCaminoCorto {
	List<Node> caminoCorto = new LinkedList<Node>();

	public List<Node> bucarCaminoCorto(Grafo g, Node vInicio, Node vDestino){
		List<Node> camino = new LinkedList<Node>();
		buscarCamino(vInicio, vDestino, camino);
		
		return caminoCorto;
	}
	
	public void buscarCamino(Node vActual, Node vDestino, List<Node> camino) {
		if(vActual.hasAdyacentNodes()) {
			if(!vActual.equals(vDestino)) {
				camino.add(vActual);
				for (Node vAdyacente : vActual.getAdyacentNodes()) {
					List<Node> branch = new LinkedList<Node>();
					branch.addAll(camino);
					if (vAdyacente.equals(vDestino)) 
						compararCaminos(branch);
					else 
						buscarCamino(vAdyacente, vDestino, branch);
				}
			}
		}
	}
	
	public List<Node> compararCaminos(List<Node> nuevoCamino) {
		if(caminoCorto.isEmpty() || caminoCorto.size() > nuevoCamino.size()) {
			
			//caminoCorto = nuevoCamino;	
			//NOOOOOOo, solo es un puntero, si cambia el original me cambia camCorto
			caminoCorto = new LinkedList<Node>();
			caminoCorto.addAll(nuevoCamino);
		}
		return caminoCorto;
	}
}
