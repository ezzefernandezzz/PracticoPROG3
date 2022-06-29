package ejercicio4_adaptadopaEntender;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import ejercicio4.Nodo;

public class GraphTraversalTool {
	
	private static int time = 0;
	private List<Node> longestPath = new LinkedList<Node>();
	
	public void depthFirstSearch(Grafo g) {					/// ALGORITMO DFS
		LinkedList<Node> verticesList = g.getVertices();	/// Obtengo la lista de vertices del Grafo
		for(Node n : verticesList) {						/// Para cada Nodo de la lista lo pintamos de blanco
			n.setColor("white");			
		}
		time = 0;											/// Establecemos el tiempo en 0
		for (Node n : verticesList) {						/// Para cada nodo de la lista
			if (n.getColor().equalsIgnoreCase("white")) {	/// Si el color actual es blanco
				visitNodeDFS(n);							/// Visitamos el Nodo
			}
		}
	}
	
	public void visitNodeDFS(Node n) {
		n.setColor("yellow");								/// Pintamos el nodo de amarillo
		incrementTime();									/// incrementamos el tiempo en 1
		n.setFoundTime(time);								/// seteamos el tiempo de descubrimiento del vertice
		for(Node adyNode : n.getAdyacentNodes()) {			/// Para cada nodo adyacente
			if (adyNode.getColor().equals("white")) {		/// Si el nodo adyacente es color blanco
				visitNodeDFS(adyNode);						/// Visitamos el nodo
			}
			//Ej 3 TP3 - Encontrar ciclo
			if (adyNode.getColor().equals("yellow")) {		/// Si un adyacente ya esta de amarillo es pq hay un
				System.out.println("Hay ciclo");			/// ciclo
			}
		}
		n.setColor("black");								/// Pintamos el nodo donde estamos parados de negro
		incrementTime();									/// Incrementamos el tiempo
		n.setFinishTime(time);								/// Seteamos el tiempo final del nodo
	}
	
	public void BreadthFirstSearch(Grafo g) {
		LinkedList<Node> verticesList = g.getVertices();
		//Reuso el campo color, blanco/white = no visitado, amarillo/yellow = visitado
		for (Node n : verticesList) {
			n.setColor("white");			
		}
		for (Node n : verticesList) {
			if (n.getColor().equals("white")) {
				BFS(n);				
			}
		}
	}
	
	public void BFS(Node n) {
		Queue<Node> queue = new ArrayDeque<Node>();			/// Interfaz de cola (se podria usar LinkedList tambien)
		n.setColor("yellow");
		queue.add(n);										/// Añadimos el nodo a la cola
		while(!queue.isEmpty()) {							/// Mientras que la cola NO este vacia
			Node queueHead = queue.remove();				/// Removemos el primer elemento de la cola
			for (Node adyNode : queueHead.getAdyacentNodes()) {	// Para cada nodo adyacente
				if (adyNode.getColor().equals("white")) {		// Si el color es Blanco
					adyNode.setColor("yellow");					// Pinto el nodo de amarillo
					queue.add(adyNode);							// Añado el nodo a la cola
				}
			}
		}
	}
	
	/*public void pathFinder(Grafo g, Node start, Node goal) {			///Buscador de Ruta
		LinkedList<Node> graphNodes = new LinkedList<Node>(g.getVertices());
		//Limpio el estado previo de los nodos
		for (Node n : graphNodes) {
			n.setColor("white");
		}		
		List<Node> path = new LinkedList<Node>();			//Creo la lista Ruta
		path = pF(start, goal, path);						//Ruta = ruta encontrada
		System.out.println("Total: ");
		System.out.println(path);
	}
	
	public List<Node> pF(Node act, Node goal, List<Node> path) {
		List<Node> adyNodes = act.getAdyacentNodes();
		if (!act.equals(goal)) {
			path.add(act);
			System.out.println("Act: " + act);
		}
		for (Node ady : adyNodes) {
			List<Node> nPath = pF(ady,goal,path);
			System.out.println("nPathy:");
			System.out.println(nPath);
			if (ady.equals(goal)) {
				System.out.println("goal");
				if (nPath.size() >= path.size()) {
					path = nPath;
				}				
				return path;
			}
		}
		return path;		
	}*/
	
	public List<Node> altPathFinder(Grafo g, Node nStart, Node nEnd) {
		//set all nodes color to white
		for (Node n : g.getVertices()) {
			n.setColor("white");
		}
		List<Node> path = new LinkedList<Node>();
		//List<Node> longPath = new LinkedList<Node>();
		//altPF(nStart, nEnd, path);
		//longPath = altPF2(nStart, nEnd, path, longPath);
		altPF2(nStart, nEnd, path);						///	llamamos al metodo con el nodo inicial y el final
														///	ademas le pasamos la lista path
		System.out.println("asd: " + this.longestPath);	
		return longestPath;
	}
		
	public void altPF2(Node actNode, Node nEnd, List<Node> path) {
		if (actNode.hasAdyacentNodes()) {					/// si el nodo actual tiene adyacentes		
			if(actNode.equals(nEnd)) {
				path.add(actNode);								/// agregamos el nodo actual al path
				for (Node n : actNode.getAdyacentNodes()) {		/// para cada nodo adyacente
					List<Node> branch = new LinkedList<Node>();	/// creamos una lista rama
					branch.addAll(path);						/// agregamos TODA la ruta anterior a la rama
					//System.out.println("br: " + branch);		/// imprimimos la rama temporal
					longestPath(branch);						/// actualizamos la ruta mas larga si fuese esta
					altPF2(n, nEnd, branch);					/// nos autoinvocamos con el nodo actual
				}
			}
		}
		//return longPath;
	}
	
	public List<Node> longestPath(List<Node> path){
		System.out.println(longestPath.size() + " - " + path.size());
		if (this.longestPath.size() < path.size()) {/// si el tamaño de la ruta mas larga actual es menor a la nueva
			//longestPath = path;					/// Lo mismo que abajo
			longestPath = new LinkedList<Node>();	///	Ruta mas larga = Nueva lista
			longestPath.addAll(path);				/// Ruta mas larga añade todos los resultados de path
		}
		return longestPath;							/// Retornamos la ruta mas larga
	}
		
	/*public void altBreadthFirstSearch(Grafo g, Node nStart, Node nEnd) {
		//Reuso el campo color, blanco/white = no visitado, amarillo/yellow = visitado
		for (Node n : g.getVertices()) {
			n.setColor("white");			
		}
		int depth = 1;
		int maxDepth = 1;
		System.out.println(nStart);
		for (Node n : nStart.getAdyacentNodes()) {
			if (n.getColor().equals("white")) {
				altBFS(n, nEnd);
				System.out.println(n);
			}
		}
	}
	
	public void altBFS(Node n, Node nEnd) {
		Queue<Node> queue = new ArrayDeque<Node>();
		n.setColor("yellow");
		queue.add(n);
		while(!queue.isEmpty()) {
			Node queueHead = queue.remove();
			for (Node adyNode : queueHead.getAdyacentNodes()) {
				if (adyNode.getColor().equals("white")) {
					adyNode.setColor("yellow");
					queue.add(adyNode);
				}
				if (adyNode.equals(nEnd)) {
					System.out.println("goal found");
				}
			}
		}
	}*/
	
	public static void incrementTime() {
		time++;		
	}

	public static int getTime() {
		return time;
	}
	
	public static void resetTime() {
		time = 0;
	}

	
}
