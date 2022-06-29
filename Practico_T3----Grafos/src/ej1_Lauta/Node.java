package ej1_Lauta;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Node {
	
	private Integer value;
	private List<Node> adyacentNodes;
	
	public Node(Integer value) {
		this.value = value;
		adyacentNodes = new LinkedList<Node>();
	}
	
	public void addAdyacent(Node node) {
		adyacentNodes.add(node);
	}
	
	public Integer getValue() {
		return value;
	}	
	
	@Override
	public String toString() {
		return ("Node value: " + getValue());
	}
	
	public String printAdyacentNodes1() {
		String nodeAll = "";
		nodeAll = nodeAll.concat(this.toString() + " is adyacent with: ");
		Iterator<Node> iterator = adyacentNodes.iterator();
		while(iterator.hasNext()) {
			Node n = iterator.next();
			if (iterator.hasNext()) {
				nodeAll = nodeAll.concat(n.toString() + " / ");
			} else
				nodeAll = nodeAll.concat(n.toString());
		}
		return nodeAll;
		
	}

	
}
