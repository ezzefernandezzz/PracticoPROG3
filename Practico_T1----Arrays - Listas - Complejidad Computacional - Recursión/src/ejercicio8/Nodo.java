package ejercicio8;

public class Nodo<T>{
	private T info;
	private Nodo<T> anterior;
	private Nodo<T> siguiente;
	
	public Nodo(T info) {
		super();
		this.info = info;
		this.anterior = null;
		this.siguiente = null;
	}
	
	public void setInfo(T info) {
		this.info = info;
	}

	public T getInfo() {
		return info;
	}

	/*public void setSig(T info) {
		this.siguiente = new Nodo<T>(info);
	}*/
	
	public void setSig(T info) {
		this.siguiente = new Nodo<T>(info);
	}
	
	public void setAnteriorNodo(Nodo<T> n) {
		this.anterior = n;
	}
	
	public void setSiguienteNodo(Nodo<T> n) {
		this.siguiente = n;
	}
	
	public Nodo<T> getSig(){
		return this.siguiente;
	}
	
	public Nodo<T> getAnterior() {
		return anterior;
	}
	
	//ew arrayList<Integer>
	// Lista l1 = new Lista()<Integer>;
	// lista.primero.setSig(6);

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "NODO: " + this.info;
	}
	
	
}
