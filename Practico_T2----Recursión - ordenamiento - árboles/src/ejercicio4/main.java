package ejercicio4;

import java.lang.reflect.Array;

public class main {

	public static void main(String[] args) {
		int array[] = {1,3,4,9,2};
		System.out.println(array[1]);
		//OrdenamientoSeleccion(array);
		OrdenamientoBurbujeo(array);
		System.out.println(array[1]);

	}

	public static void OrdenamientoSeleccion(int array[]) {
		int minimo, aux;
		for (int i = 0; i < array.length - 1; i++) {
			minimo = i;
			for (int j = i+1; j < array.length; j++) {
				if(array[j] < array[i])
					minimo = j;
			}
			aux = array[i];
			array[i] = array[minimo];
			array[minimo] = aux;
			
		}
	}
	
	public static void OrdenamientoBurbujeo(int array[]) {
		int aux;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if(array[j] > array[j+1]) {
					aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
				}
			}
		}
	}
}
