package ejercicio1;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		recursion r = new recursion();
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(6);
		ar.add(5);
		ar.add(7);
		
		/*ar.add(1);
		ar.add(5);
		ar.add(3);*/
		
		
		
		
		System.out.println(r.ordenado(ar, 0, ar.get(0)));

	}

}
