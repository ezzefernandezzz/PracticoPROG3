package ejercicio5;

public class main {

	public static void main(String[] args) {

        mergeSort mergeSort = new mergeSort();
        quickSort quickSort = new quickSort();
        int arr [] = {5,26,12,6,1,4,7};
        int n = arr.length;

        System.out.println("Array original:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("Array ordenado:");
        //mergeSort.sort(arr,0,n-1);
        //mergeSort.printArray(arr);
        
        quickSort.quicksort(arr, 0, arr.length-1);
        mergeSort.printArray(arr);
    }

}
