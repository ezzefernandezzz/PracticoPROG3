package ejercicio4;

public class Nodo<T> {
	private T info;
	private Nodo<T> siguiente;
	
	public Nodo(T info) {
		super();
		this.info = info;
		this.siguiente = null;
	}
	
	public T getInfo() {
		return info;
	}

	public void setSig(T info) {
		this.siguiente = new Nodo<T>(info);
	}
	
	public Nodo<T> getSig(){
		return this.siguiente;
	}
	//ew arrayList<Integer>
	// Lista l1 = new Lista()<Integer>;
	// lista.primero.setSig(6);
}
