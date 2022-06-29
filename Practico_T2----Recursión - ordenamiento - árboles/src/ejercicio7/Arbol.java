package ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Arbol {
	private Nodo raiz;

	public Arbol(int valor) {
		super();
		this.raiz = new Nodo(valor);
	}
	
	public int getRaiz() {
		return this.raiz.getValor();
	}
	
	public boolean isEmpty() {
		return (raiz.getIzquierda() == null && raiz.getDerecha() == null);
	}
	
	public int alturaArbol() {
		return getAltura(raiz);
	}
	public int getAltura(Nodo n) {
		if(n == null)
			return 0;
		else
			return 1 + Math.max(getAltura(n.getIzquierda()), getAltura(n.getDerecha()));
	}
	
	public void getLongestBranch() {
		//getNLongestBranch(raiz);
	}
	
	public void maxArbol() {
		System.out.println("Valor maximo: " + getMaxElem(raiz));
	}
	
	public int getMaxElem(Nodo n) {
		if(n == null)
			return 0;
		else
		{
			int max = n.getValor();
			int izq = getMaxElem(n.getIzquierda());
			int der = getMaxElem(n.getDerecha());
			
			if (max < izq || max < der) {
				max = Math.max(izq,der);
			}
			return max;
		}
	}

	public void add(int valor) {
		this.addNodo(raiz, valor);
	}
	
	public void addNodo(Nodo n, int valor) {
		 if (n.getValor() > valor) {
			 if (n.getIzquierda() == null) {
				 Nodo temp = new Nodo(valor);
				 n.setIzquierda(temp);
			 }
			 else {
				 addNodo(n.getIzquierda(), valor);
			 }
		} 
		else if (n.getValor() < valor) {
			 if (n.getDerecha() == null) {
				 Nodo temp = new Nodo(valor);
				 n.setDerecha(temp);
			 } 
			 else{
				 addNodo(n.getDerecha(), valor);
			 }
		}
	}
	
	public void imprimirArbol() {
		printInOrder(raiz);
	}

	public void printPreOrder(Nodo n) {
		if(n != null) {
			System.out.println(n.getValor());
			printPreOrder(n.getIzquierda());
			printPreOrder(n.getDerecha());
		}
	}
	
	public void printPosOrder(Nodo n) {	
		if(n != null) {
			printPosOrder(n.getIzquierda());
			printPosOrder(n.getDerecha());
			System.out.println(n.getValor());
		}
	}
	
	public void printInOrder(Nodo n) {
		if(n != null) {
			printInOrder(n.getIzquierda());
			System.out.println(n.getValor());
			printInOrder(n.getDerecha());
		}
	}




}
