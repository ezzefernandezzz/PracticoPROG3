package ejercicio1codeadobien;

public class Nodo<T> {
	private T info;
	private Nodo<T> siguiente;
	
	public Nodo(T info) {
		super();
		this.info = info;
		this.siguiente = null;
	}
	
	public void setInfo(T info) {
		this.info = info;
	}

	public T getInfo() {
		return info;
	}

	public void setSig(T info) {
		this.siguiente = new Nodo<T>(info);
	}
	
	public void setSiguienteNodo(Nodo<T> n) {
		this.siguiente = n;
	}
	
	public Nodo<T> getSig(){
		return this.siguiente;
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
