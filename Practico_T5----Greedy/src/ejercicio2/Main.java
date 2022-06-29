package ejercicio2;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Mochila m1 = new Mochila(20);
		
		List<Objeto> listaObjetos = new LinkedList<Objeto>();
		Objeto o1 = new Objeto(25, 18);
		Objeto o2 = new Objeto(24, 15);
		Objeto o3 = new Objeto(15, 10);
		listaObjetos.add(o1);
		listaObjetos.add(o2);
		listaObjetos.add(o3);
		
		System.out.println(m1.maximizarValor(listaObjetos));

	}

}
