package ejercicio6;

import java.util.Arrays;

public class main {
    
	public static void main(String[] args) {
		mergeSort mergeSort = new mergeSort();
	    quickSort quickSort = new quickSort();
		
	    long start = System.currentTimeMillis();
		for (int x = 0;	x < 10000;	x++) {
			int arreglo[];
			arreglo = aleatorioRecursivo(7);
			mergeSort.sort(arreglo, 0, arreglo.length-1);
		}
		
		long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("Tiempo de ejecucion MERGE "+ elapsedTime +" milisegundos");
		
		long start2 = System.currentTimeMillis();
		for (int x = 0;	x < 10000;	x++) {
			int arreglo[];
			arreglo = aleatorioRecursivo(7);
			quickSort.quicksort(arreglo, 0, arreglo.length-1);
		}
		
		long elapsedTime2 = System.currentTimeMillis() - start2;
		System.out.println("Tiempo de ejecucion QUICKSORT "+ elapsedTime2 +" milisegundos");
		
		long start3 = System.currentTimeMillis();
		for (int x = 0;	x < 10000;	x++) {
			int arreglo[];
			arreglo = aleatorioRecursivo(7);
			 Arrays.sort(arreglo);
		}
		
		long elapsedTime3 = System.currentTimeMillis() - start3;
		System.out.println("Tiempo de ejecucion ARRAYS.SORT "+ elapsedTime3 +" milisegundos");
			

	}
	
	public static int[] aleatorioRecursivo(int tamanio_Arreglo) {
		int arreglo[] = new int[tamanio_Arreglo];
		for (int x = 0;	x < arreglo.length;	x++)
			arreglo[x] = (int) (Math.random()*20)+1;
		return arreglo;
	}

}
