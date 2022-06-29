package ejercicio6;

public class ListaInterseccion<T extends Comparable<T>>{

	public Lista<T> interseccion(Lista<T> l1, Lista<T> l2){
		Lista<T> Listarepetidos = new Lista<>();
		for (T lista1 : l1) { 
			for (T lista2 : l2) { 
				if (lista1.equals(lista2))
			    	//Listarepetidos.insertFront(lista1);
					Listarepetidos.insertarOrdenado(lista1);
			}
		}
		//return Listarepetidos;
		return Listarepetidos;
	}
}
