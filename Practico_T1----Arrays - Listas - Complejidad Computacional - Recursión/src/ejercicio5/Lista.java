package ejercicio5;

import java.util.Iterator;

public class Lista<T> implements Iterable<T>{
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
		}
		return aux;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new IteradorLista<>(primero);
	}

	public void print() {
        System.out.println("Lista vinculada(" + this.size() + "): " + this + " " + this.isEmpty());
    }
}
