package ej7;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class GraphTraversalTool {
	
	private static int time = 0;
	private List<Node> shortestPath = new LinkedList<Node>();
		
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
	
	public List<Node> shortestPathFinder(Graph g, Node nStart, Node nEnd) {
		//set all nodes color to white
		for (Node n : g.getVertices()) {
			n.setColor("white");
		}
		List<Node> path = new LinkedList<Node>();
		pathFind(nStart, nEnd, path);
		return shortestPath;
	}
		
	public void pathFind(Node actNode, Node nEnd, List<Node> path) {
		if (actNode.hasAdyacentNodes()) {
			if (!actNode.equals(nEnd)) {
				path.add(actNode);
				for (Node n : actNode.getAdyacentNodes()) {
					List<Node> branch = new LinkedList<Node>();
					branch.addAll(path);
					if (n.equals(nEnd)) 
						shortestPath(branch);
					else 
						pathFind(n, nEnd, branch);
				}
			}
		}
	}
	
	public List<Node> shortestPath(List<Node> path) {
		if (shortestPath.isEmpty()) {
			shortestPath = new LinkedList<Node>();
			shortestPath.addAll(path);
		} else {
			if (this.shortestPath.size() > path.size()) {
				shortestPath = new LinkedList<Node>();
				shortestPath.addAll(path);
			}
		}
		return shortestPath;
	}
	
	public List<Node> possibleStartNodes(Graph g, Node nEnd) {
		List<Node> gVertices = g.getVertices();
		List<Node> possibleStartNodes = new LinkedList<Node>();
		for (Node n : gVertices) {
			n.setColor("white");
		}
		for (Node n : gVertices) {
			if (n.getColor() == "white") {
				List<Node> path = new LinkedList<Node>();
				possibleStartNodes.addAll(possiblePath(n, nEnd, path));
			}			
		}
		return possibleStartNodes;
	}
	
	public List<Node> possiblePath(Node actNode, Node nEnd, List<Node> path) {
		if (!actNode.equals(nEnd)) {
			if (actNode.hasAdyacentNodes()) {
				path.add(actNode);
				for (Node n : actNode.getAdyacentNodes()) {
					List<Node> branch = new LinkedList<Node>();
					branch.addAll(path);
					pathFind(n, nEnd, branch);
				}
			} 
		}
		for (Node n : path)
			n.setColor("yellow");
		return path;
	}
	
	public boolean pathFromAToBPossible(Graph g, Node nStart, Node nEnd, Node brokenNode) {
		List<Node> pathFromAToB = new LinkedList<Node>();
		List<Node> path = new LinkedList<Node>();
		pathFromAToB = findPath(nStart, nEnd, brokenNode, path);
		System.out.println(pathFromAToB);
		return !pathFromAToB.isEmpty();
	}
	
	public List<Node> findPath(Node actNode, Node nEnd, Node brokenNode, List<Node> path) {
		if (!actNode.equals(brokenNode)) {
			if (actNode.hasAdyacentNodes()) {
				path.add(actNode);
				for (Node n : actNode.getAdyacentNodes()) {
					List<Node> branch = new LinkedList<Node>();
					branch.addAll(path);
					System.out.println(branch);
					if (n.equals(nEnd))
						shortestPath(branch);
					findPath(n, nEnd, brokenNode, branch);
				}
			}
		}
		return shortestPath;
	}
		
	
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
