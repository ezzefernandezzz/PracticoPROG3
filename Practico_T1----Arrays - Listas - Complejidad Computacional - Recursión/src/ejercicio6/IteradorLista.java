package ejercicio6;

import java.util.Iterator;

public class IteradorLista<T> implements Iterator<T> {
	private Nodo<T> actual;
	
	public IteradorLista(Nodo<T> primero) {
        this.actual = primero;
    }
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub.
		return (actual != null);
	}

	@Override
	public T next() {
		T resultado = actual.getInfo(); //obtengo el valor del nodo actual
		actual = actual.getSig(); // me posiciono sobre el valor siguiente
		return resultado;
	}

}
