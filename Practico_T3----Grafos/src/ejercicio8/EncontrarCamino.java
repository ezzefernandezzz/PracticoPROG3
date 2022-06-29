package ejercicio8;

import java.util.LinkedList;
import java.util.List;

public class EncontrarCamino {
	List<Node> caminoFinal = new LinkedList<Node>();

	public List<Node> bucarCamino(Grafo g, Node vInicio, Node vDestino){
		List<Node> camino = new LinkedList<Node>();
		caminoSinPasar_Rojo(vInicio, vDestino, camino);
		
		return caminoFinal;
	}
	
	public void caminoSinPasar_Rojo(Node vActual, Node vDestino, List<Node> camino) {
		if(vActual.hasAdyacentNodes()) {
			if(!vActual.getColor().equals("red")) {
				camino.add(vActual);
				for (Node nodoActual : vActual.getAdyacentNodes()) {
					List<Node> branch = new LinkedList<Node>();
					branch.addAll(camino);
					if (nodoActual.equals(vDestino)) {
						caminoFinal = new LinkedList<Node>();
						caminoFinal.addAll(branch);
						//if(!nodoActual.getColor().equals("red"));
						System.out.println("FIN");
					}
					else
						caminoSinPasar_Rojo(nodoActual, vDestino, branch);
				}
			}
		}
	}
}
