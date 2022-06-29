package ejercicio2DFS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Nodo {
	
	private Integer value;
	private List<Nodo> nodosAdyacentes;
	private String color;
	private int descubrimiento;
	private int _final;
	
	public Nodo(Integer value) {
		this.value = value;
		nodosAdyacentes = new LinkedList<Nodo>();
		color = "";
		descubrimiento = 0;
		_final = 0;
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
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDescubrimiento(int descubrimiento) {
		this.descubrimiento = descubrimiento;
	}

	public void set_final(int _final) {
		this._final = _final;
	}
	
	public void imprimirNodo() {
		System.out.println("Nodo: " + this.getValue() + "	----	" 
	+ "Color:" + color + " Descubrimiento: " + descubrimiento + " Final: " + _final);
	}

	
}
