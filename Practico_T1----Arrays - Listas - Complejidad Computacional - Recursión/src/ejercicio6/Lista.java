package ejercicio6;

import java.util.Iterator;

public class Lista<T extends Comparable<T>> implements Iterable<T>{
	private Nodo<T> primero;

	public Lista() {
		super();
		this.primero = null;
	}
	
	/*public void insertFront(T info) {
		Nodo<T> aux = this.getFinal();
		aux.setSig(info);
	}*/
	
	public void insertFront(T info) {
		if (this.primero == null)
			primero = new Nodo<T>(info);
		else
		{
			Nodo<T> aux = this.getFinal();
			aux.setSig(info);
		}
	}
	
	public Nodo<T> extractFront() {
		Nodo<T> aux = this.getFinal();
		Nodo<T> fin = this.getFinal();
		fin = null;
		
		return aux;
	}
	
	public boolean isEmpty() {
		return primero == null;
	}
	
	public int size() {
		if(isEmpty())
			return 0;
		else {
			int cantidad = 0;
			Nodo<T> aux = primero;
			while (aux.getSig() != null) {
				aux = aux.getSig();
				cantidad++;
				
			}
			return cantidad;
		}
		
	}
	
	/*public void insertarOrdenado(T valor) {
		Nodo<T> aux = primero;
		if(primero == null) {
			 primero = new Nodo<T>(valor);
			 //System.out.println(aux);
		}
		
		while((aux != null) && (aux.getInfo().compareTo(valor) < 0)) {
			System.out.println("DASJNDJSA");
			Nodo<T> aux2 = aux;
			aux = aux.getSig();
			aux2.setSig(valor);
			//hago esto debido a que ¿¿¿¿?
			Nodo<T> aux2Apunta = aux2.getSig();
			aux2Apunta = aux;
			
		}
	}*/
	
	public void insertarOrdenado(T valor) {
		Nodo<T> nuevo = new Nodo<T>(valor);
	
		Nodo<T> aux1 = primero;
		Nodo<T> aux2 = new Nodo<T>(null);
	
		while((aux1 != null) && (aux1.getInfo().compareTo(valor) < 0)) {
			aux2 = aux1;
			aux1 = aux1.getSig();
		}
	
		if(primero == aux1)
			primero = nuevo;
		else
			aux2.setSiguienteNodo(nuevo);
	
		nuevo.setSiguienteNodo(aux1);
	}
		
		
	
	public Nodo<T> getFinal(){
		Nodo<T> aux = primero;
		while (aux.getSig() != null)
			aux = aux.getSig();
		return aux;
	}
	
	public Nodo<T> get(int index){
		Nodo<T> aux = primero;
		if (!this.isEmpty()){
			int auxPos = 0;
			while (aux.getSig() != null && auxPos < index) {
				aux = aux.getSig();
				auxPos++;
			}
			if (auxPos != index)
				aux = null;
		}
		return aux;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new IteradorLista<>(this.primero);
	}
}
