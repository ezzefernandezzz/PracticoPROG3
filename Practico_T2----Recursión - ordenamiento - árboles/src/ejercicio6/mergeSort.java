package ejercicio6;

public class mergeSort {
	
	public void sort(int arr[], int izquierda, int derecha){
		//caso contrario, izquierda = derecha = arreglo de 1 solo elemento
	    if(izquierda < derecha){
	      //Encuentra el punto medio del arreglo.
	      int mitad = (izquierda + derecha) / 2;
	      
	      //Divide la primera y segunda mitad (llamada recursiva).
	      sort(arr, izquierda, mitad);
	      sort(arr, mitad+1, derecha);

	      //Une las mitades.
	      merge(arr, izquierda, mitad, derecha);
	    }
	}
	
	public void merge(int arr[], int izquierda, int mitad, int derecha) {
		  //Encuentra el tamaño de los sub-arreglos para unirlos.
		  int n1 = mitad - izquierda + 1;
		  int n2 = derecha - mitad;

		  //Arreglos temporales.
		  int leftArray[] = new int [n1];
		  int rightArray[] = new int [n2];

		  //Copia los datos a los arrays temporales.
		  for (int i=0; i < n1; i++) {
		    leftArray[i] = arr[izquierda+i];
		  }
		  for (int j=0; j < n2; j++) {
		    rightArray[j] = arr[mitad + j + 1];
		  }
		  /* Une los arreglostemporales. */

		  //Índices inicial del primer y segundo sub-arreglo.
		  int i = 0, j = 0;

		  //Índice inicial del sub-arreglo arr[].
		  int k = izquierda;

		  //Ordenamiento.
		  while (i < n1 && j < n2) {
		    if (leftArray[i] <= rightArray[j]) {
		      arr[k] = leftArray[i];
		      i++;
		    } else {
		        arr[k] = rightArray[j];
		        j++;
		    }
		    k++;
		  }//Fin del while.

		  /* Si quedan elementos por ordenar */
		  //Copiar los elementos restantes de leftArray[].
		  while (i < n1) {
		    arr[k] = leftArray[i];
		    i++;
		    k++;
		  }
		  //Copiar los elementos restantes de rightArray[].
		  while (j < n2) {
		    arr[k] = rightArray[j];
		    j++;
		    k++;
		  }
		  
		}
	
	public void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
