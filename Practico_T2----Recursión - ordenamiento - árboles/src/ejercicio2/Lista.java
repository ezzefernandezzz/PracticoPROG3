package ejercicio2;

public class Lista<T> {
	private Nodo<T> primero;

	public Lista() {
		super();
		this.primero = null;
	}
	
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
		//Nodo<T> fin = this.getFinal();
		//fin = null;
		
		get(this.size()-1).setSiguienteNodo(null);
		
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
			if (auxPos != index)
				aux = null;
		}
		return aux;
	}
}
