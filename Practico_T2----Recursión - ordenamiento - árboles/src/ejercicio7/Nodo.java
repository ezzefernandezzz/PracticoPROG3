package ejercicio7;

public class Nodo {
	 private int valor;
	 private Nodo izquierda;
	 private Nodo derecha;
	 
	 public Nodo(int value) {
		 this.valor = value;
		 this.izquierda = null;
		 this.derecha = null;
	 }

	public int getValor() {
		return valor;
	}

	public Nodo getIzquierda() {
		return izquierda;
	}

	public Nodo getDerecha() {
		return derecha;
	}

	public void setIzquierda(Nodo izquierda) {
		this.izquierda = izquierda;
	}

	public void setDerecha(Nodo derecha) {
		this.derecha = derecha;
	}

	public void print(Nodo n) {
		if (n != null) {
			System.out.println(this.getValor());
		}
	}
	
	
}
