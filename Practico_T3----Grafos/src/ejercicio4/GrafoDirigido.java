package ejercicio4;

public class GrafoDirigido extends Grafo {

	@Override
	public void conectarNodos(Nodo n1, Nodo n2) {
		n1.addAdyacent(n2);
		
	}

}
