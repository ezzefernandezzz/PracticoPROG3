package ejercicio7;

public class ListaDiferencia<T extends Comparable<T>>{

	public Lista<T> diferencia(Lista<T> l1, Lista<T> l2){
		Lista<T> Listarepetidos = new Lista<>();
		for (T lista1 : l1) {
			boolean coincidencia = false;
			for (T lista2 : l2) { 
				if (lista2.equals(lista1)) {
					coincidencia = true;
					//System.out.println("compara: " + lista1 + " con: " + lista2);
			    	//Listarepetidos.insertFront(lista1);
					//Listarepetidos.insertarOrdenado(lista1);
				}
			}
			if(!coincidencia)
				Listarepetidos.insertarOrdenado(lista1);
			
		}
		//return Listarepetidos;
		return Listarepetidos;
	}
}
