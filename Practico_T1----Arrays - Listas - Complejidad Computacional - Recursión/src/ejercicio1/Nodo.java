package ejercicio1;

public class Nodo<T>{
	private T contenido;
	private Nodo<T> siguiente;
	
	public Nodo(T contenido, Nodo<T> siguiente) {
		super();
		this.contenido = contenido;
		this.siguiente = siguiente;
	}
	
	public Nodo<T> getNext(){
		return this.siguiente;
	}
	
	public void addSiguiente(Nodo<T> sig) {
		this.siguiente = sig;
	}

	@Override
	public String toString() {
		
		return "Contenido nodo: " + this.contenido;
	}
	
	
	
	
}
