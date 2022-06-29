package Ejercicio2BFS;

public class GrafoNoDirigido extends Grafo {

	@Override
	public void conectarNodos(Nodo n1, Nodo n2) {
		n1.addAdyacent(n2);
		n2.addAdyacent(n1);
		
	}

}
