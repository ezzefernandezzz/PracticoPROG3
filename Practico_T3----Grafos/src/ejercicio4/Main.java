package ejercicio4;

public class Main {

	public static void main(String[] args) {
		Grafo g1 = new GrafoDirigido();
		
		Nodo n1 = new Nodo(10);
		Nodo n2 = new Nodo(5);
		Nodo n3 = new Nodo(7);
		Nodo n4 = new Nodo(2);
		
		Nodo n5 = new Nodo(3);
		Nodo n6 = new Nodo(8);
		Nodo n7 = new Nodo(12);
		
		Grafo g2 = new GrafoNoDirigido();
		
		Nodo m1 = new Nodo(10);
		Nodo m2 = new Nodo(5);
		Nodo m3 = new Nodo(7);
		Nodo m4 = new Nodo(2);
		
		g1.addNode(n1);
		g1.addNode(n2);
		g1.addNode(n3);
		g1.addNode(n4);
		g1.addNode(n5);
		g1.addNode(n6);
		g1.addNode(n7);
		
		
		g1.conectarNodos(n1, n2);
		g1.conectarNodos(n3, n4);
		g1.conectarNodos(n1, n4);
		///
		g1.conectarNodos(n4, n6);
		g1.conectarNodos(n6, n7);
		g1.conectarNodos(n7, n5);
		///
		g1.conectarNodos(n4, n5);
		
		g1.printGraph();
		
		g2.addNode(m1);
		g2.addNode(m2);
		g2.addNode(m3);
		g2.addNode(m4);
		
		g2.conectarNodos(m1, m2);
		g2.conectarNodos(m2, m3);
		g2.conectarNodos(m1, m4);
		
		g2.printGraph();
		
		//g1.BFS(n1, n5);
		g1.BFS(n4, n5);
		
		

	}

}
