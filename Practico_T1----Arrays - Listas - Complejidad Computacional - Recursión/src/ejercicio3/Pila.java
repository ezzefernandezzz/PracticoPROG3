package ejercicio3;

public class Pila <T>{
	private Lista<T> lista;

	public Pila() {
		super();
		this.lista = new Lista<T>();
	}
	
	public void push(T obj) {
		this.lista.insertFront(obj);
	}
	
	public T pop() {
		T aux = this.lista.getFinal().getInfo();
		Nodo<T> fin = this.lista.getFinal();
		fin = null;
		return aux;
	}
	
	public T top() {
		T aux = this.lista.getFinal().getInfo();
		return aux;
	}
	
	public void reverse() {
		Lista<T> listaAux = new Lista<T>();
		while(!this.lista.isEmpty()) {
			listaAux.insertFront(this.lista.extractFront().getInfo());
		}
		this.lista = listaAux;
	}
	
	
	
}
