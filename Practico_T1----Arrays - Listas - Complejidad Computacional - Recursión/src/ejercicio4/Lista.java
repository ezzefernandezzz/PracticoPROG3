package ejercicio4;

public class Lista<T> {
	private Nodo<T> primero;

	public Lista() {
		super();
		this.primero = null;
	}
	
	public void insertFront(T info) {
		Nodo<T> aux = this.getFinal();
		aux.setSig(info);
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
	
	public Integer indexOf(T elemento) {
		Nodo<T> actual = primero;
		Integer index = 0;
		while(actual.getInfo() != elemento && actual.getSig() != null) {
			actual = actual.getSig();
			index++;
		}
			
		
		if (actual.getInfo() == elemento)
			return index;
		else
			return -1;
	}
}
