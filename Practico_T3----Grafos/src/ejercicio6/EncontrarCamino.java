package ejercicio6;

public class EncontrarCamino {

	public boolean bucarCamino(Grafo g, Node vInicio, Node vDesconectado, Node vDestino){
		//List<Node> verticesCaminoDestino = new LinkedList<Node>();
		if(vInicio.hasAdyacentNodes())
			for (Node vertice : vInicio.getAdyacentNodes()) {
				if (llegaDestino(vertice, vDesconectado, vDestino))
					return true;
			}
		
		return false;
	}
	
	public boolean llegaDestino(Node vActual, Node vDesconectado, Node vDestino) {
		if(!vActual.equals(vDesconectado))
			if( vActual.hasAdyacentNodes())
				for (Node vAdyacente : vActual.getAdyacentNodes()) {
					if (llegaDestino(vAdyacente, vDesconectado, vDestino))
						return true;
				}
		if(vActual.equals(vDestino)) {
				System.out.println("PRUEBAAA");
				return true;
		}
		
		return false;
	}
}
