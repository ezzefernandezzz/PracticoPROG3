package ejercicio1_bienResuelto;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Nodo {
	
	private Integer value;
	private List<Nodo> nodosAdyacentes;
	
	public Nodo(Integer value) {
		this.value = value;
		nodosAdyacentes = new LinkedList<Nodo>();
	}
	
	public void addAdyacent(Nodo node) {
		nodosAdyacentes.add(node);
	}
	
	public Integer getValue() {
		return value;
	}	
	
	@Override
	public String toString() {
		return ("Valor de nodo: " + getValue());
	}
	
	public String printAdyacentNodes1() {
		String nodeAll = "";
		nodeAll = nodeAll.concat(this.toString() + " es adyacente con: ");
		Iterator<Nodo> iterator = nodosAdyacentes.iterator();
		while(iterator.hasNext()) {
			Nodo n = iterator.next();
			if (iterator.hasNext()) {
				nodeAll = nodeAll.concat(n.toString() + " / ");
			} else
				nodeAll = nodeAll.concat(n.toString());
		}
		return nodeAll;
		
	}

	
}
