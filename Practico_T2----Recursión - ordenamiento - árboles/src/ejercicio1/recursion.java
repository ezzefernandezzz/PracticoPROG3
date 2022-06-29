package ejercicio1;

import java.util.ArrayList;

public class recursion {
	
	
	public recursion() {
		super();
		// TODO Auto-generated constructor stub
	}

	//public Integer ordenado(ArrayList<Integer> a, int indice, int v1) {
	public boolean ordenado(ArrayList<Integer> a, int indice, int v1) {
		//System.out.println("entra");
		//Integer suma = 0;
		//suma += a.get(indice);
		////
		boolean b = true;
		
		///
		if(indice == 0)
			b = ordenado(a, indice+1, v1);
		else if(indice < a.size()) {
			System.out.println("compara: " + a.get(indice) + " con: " + v1);
			//ordenado(a, indice+1, v1);
			//System.out.println("pppp: " + ordenado(a, indice+1));
			if(a.get(indice) < v1)
				return false;
			v1 = a.get(indice);
			//suma += ordenado(a, indice+1, v1);
			b = ordenado(a, indice+1, v1);
			/*if(suma < 10)
				System.out.println("menor 10");
			else
				System.out.println("sobrepasa");*/
		}
		return b;
		//return suma;
	}
}
