package ejercicio3;

public class main {

	public static void main(String[] args) {
		decToBinary(12);

	}
	
	public static void decToBinary(int num) {
		if(num >0) {
			decToBinary(num/2);
			System.out.println(num%2);
		}
	}

}
