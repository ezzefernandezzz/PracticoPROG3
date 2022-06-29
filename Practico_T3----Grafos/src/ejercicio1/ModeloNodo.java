package ejercicio1;

public class ModeloNodo {
	private int dato;
	private ModeloNodo siguiente;
	
	public ModeloNodo(int dato) {
		super();
		this.dato = dato;
		this.siguiente = null;
	}

	public void setSiguiente(ModeloNodo siguiente) {
		this.siguiente = siguiente;
	}

	public ModeloNodo getSiguiente() {
		return siguiente;
	}

	public int getDato() {
		return dato;
	}

	public void imprimir() {
		
	}
	
	
	
	
	
	

}
