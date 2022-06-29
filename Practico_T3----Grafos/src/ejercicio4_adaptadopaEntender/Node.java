package ejercicio4_adaptadopaEntender;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Node {
	
	private Integer value;
	private List<Node> adyacentNodes;
	private String color;
	private int foundTime;
	private int finishTime;
	
	public Node(Integer value) {
		this.value = value;
		adyacentNodes = new LinkedList<Node>();
		color = "";
		foundTime = 0;
		finishTime = 0;
	}
	
	public void addAdyacent(Node node) {
		adyacentNodes.add(node);
	}
	
	public Integer getValue() {
		return value;
	}	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getFoundTime() {
		return foundTime;
	}

	public void setFoundTime(int foundTime) {
		this.foundTime = foundTime;
	}

	public int getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}

	public List<Node> getAdyacentNodes() {
		return new LinkedList<Node>(adyacentNodes);
	}
	
	public boolean hasAdyacentNodes() {
		return !adyacentNodes.isEmpty();
	}

	/*@Override
	public String toString() {
		return ("Node value: " + getValue() + " Color: " + getColor() 
					+ " Found and Finish Time: " + getFoundTime() + " - " + getFinishTime());
	}*/
	
	@Override
	public String toString() {
		return ("Node value: " + getValue());
	}
	
	
	public String printAdyacentNodes1() {
		String nodeAll = "";
		nodeAll = nodeAll.concat(this.toString() + " and is adyacent with: ");
		Iterator<Node> iterator = adyacentNodes.iterator();
		while(iterator.hasNext()) {
			Node n = iterator.next();
			if (iterator.hasNext()) {
				nodeAll = nodeAll.concat("\r\t" + n.toString());
			} else
				nodeAll = nodeAll.concat("\r\t" + n.toString());
		}
		return nodeAll;
		
	}

	
}
