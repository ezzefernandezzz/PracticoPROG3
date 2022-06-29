package ejercicio7;

public class main {

	public static void main(String[] args) {
		Arbol a1 = new Arbol(5);
		a1.add(7);
		a1.add(9);
		a1.add(3);
		a1.add(19);
		a1.add(100);
		a1.imprimirArbol();
		System.out.println(a1.isEmpty());
		System.out.println("Altura: " + a1.alturaArbol());
		a1.maxArbol();

	}

}
