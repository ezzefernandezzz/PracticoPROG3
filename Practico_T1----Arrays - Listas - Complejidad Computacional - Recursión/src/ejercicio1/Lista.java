package ejercicio1;

public class Lista <T>{
	private Nodo<T> primero;

	public Lista(Nodo<T> primero) {
		super();
		this.primero = primero;
	}
	
	public void insertFront(Nodo n) {
		Nodo<T> aux = getFinal();

		aux.addSiguiente(n);
	}
	
	public void extractFront() {
		Nodo<T> aux = getFinal();
		System.out.println(aux);
		aux = null;
	}
	
	
	public Nodo<T> getFinal(){
		Nodo<T> aux = primero;
		
		while (aux.getNext() != null) {
			aux = aux.getNext();
		}
		return aux;
	}
	
	public Nodo<T> get(int posBuscada){
		Nodo<T> aux = primero;
		int cantidad = 1;
		
		while (aux.getNext() != null && cantidad < posBuscada) {
			aux = aux.getNext();
			cantidad++;
		}
		if (cantidad == posBuscada)
			return aux;
		return null;
	}
	
	public int size() {
		Nodo<T> aux = primero;
		int cantidad = 1;
		
		while (aux.getNext() != null) {
			aux = aux.getNext();
			cantidad++;
		}
		return cantidad;
	}
	
	public boolean isEmpty() {
		return !(this.size() > 1);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return primero.toString(); // como imprimo toda la lista?
	}
	
	
	
}
