package Ejercicio2BFS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Nodo {
	
	private Integer value;
	private List<Nodo> nodosAdyacentes;
	private String estado;
	
	public Nodo(Integer value) {
		this.value = value;
		nodosAdyacentes = new LinkedList<Nodo>();
		estado = "";
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
	
	public List<Nodo> getAdyacent(){
		return nodosAdyacentes;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void printNodo() {
		System.out.println("Valor nodo: " + getValue() + "    ----- Estado: " + getEstado());
	}

	
}
