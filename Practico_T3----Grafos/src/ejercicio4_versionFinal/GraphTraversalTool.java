package ejercicio4_versionFinal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import ejercicio4.Nodo;

public class GraphTraversalTool {
	
	private static int time = 0;
	private List<Node> longestPath = new LinkedList<Node>();
		
	public void depthFirstSearch(Graph g) {
		LinkedList<Node> verticesList = g.getVertices();
		for(Node n : verticesList) {
			n.setColor("white");			
		}
		time = 0;
		for (Node n : verticesList) {
			if (n.getColor().equalsIgnoreCase("white")) {
				visitNodeDFS(n);
			}
		}
	}
	
	public void visitNodeDFS(Node n) {
		n.setColor("yellow");
		increaseTime();
		n.setFoundTime(time);
		for(Node adyNode : n.getAdyacentNodes()) {
			if (adyNode.getColor().equals("white")) {
				visitNodeDFS(adyNode);				
			}
			//Ej 3 TP3 - Encontrar ciclo
			if (adyNode.getColor().equals("yellow")) {
				System.out.println("Hay ciclo");
			}
		}
		n.setColor("black");
		increaseTime();
		n.setFinishTime(time);		
	}
	
	public void BreadthFirstSearch(Graph g) {
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
			}
		}
	}
	
	public List<Node> longestPathFinder(Graph g, Node nStart, Node nEnd) {
		//set all nodes color to white
		for (Node n : g.getVertices()) {
			n.setColor("white");
		}
		List<Node> path = new LinkedList<Node>();
		pathFind(nStart, nEnd, path);			///	llamamos al metodo con el nodo inicial y el final
												///	ademas le pasamos la lista path
		return longestPath;
	}
		
	public void pathFind(Node actNode, Node nEnd, List<Node> path) {
		if (actNode.hasAdyacentNodes()) {						/// si el nodo actual tiene adyacentes		
			if (!actNode.equals(nEnd)) {
				path.add(actNode);								/// agregamos el nodo actual al path
				for (Node n : actNode.getAdyacentNodes()) {		/// para cada nodo adyacente
					List<Node> branch = new LinkedList<Node>();	/// creamos una lista "Rama"
					branch.addAll(path);						/// agregamos TODA la ruta anterior a la rama
					longestPath(branch);						/// actualizamos la ruta mas larga si fuese esta
					pathFind(n, nEnd, branch);					/// nos autoinvocamos con el nodo actual
				}
			}
		}
	}
	
	public List<Node> longestPath(List<Node> path) {
		if (this.longestPath.size() < path.size()) {/// si el tamaño de la ruta mas larga actual MENOR a la nueva
			longestPath = new LinkedList<Node>();	///	Ruta mas larga = Nueva lista
			longestPath.addAll(path);				/// Ruta mas larga añade todos los resultados de path
		}
		return longestPath;							/// Retornamos la ruta mas larga
	}
	
	/*public List<Node> possibleStartNodes(Graph g, Node nEnd) {
		
	}*/
		
	
	public static void increaseTime() {
		time++;		
	}

	public static int getTime() {
		return time;
	}
	
	public static void resetTime() {
		time = 0;
	}

	
}
