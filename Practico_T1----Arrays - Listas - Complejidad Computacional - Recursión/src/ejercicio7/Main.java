package ejercicio7;

public class Main {
	
	public static void main(String[] args) {
		Lista l1 = new Lista<>();
		//Nodo n1 = new Nodo<Integer>(1);
		//Nodo n2 = new Nodo<Integer>(4);
		
		l1.insertFront(5);
		l1.insertFront(9);
		l1.insertFront(3);
		l1.insertFront(395);
		
		Lista l2 = new Lista<>();
		l2.insertFront(77);
		l2.insertFront(5);
		l2.insertFront(9);
		l2.insertFront(3);
		
		System.out.println("dsafdsa");
		
		ListaDiferencia l4 = new ListaDiferencia();
		Lista resultado = l4.diferencia(l1, l2);
		
		System.out.println(resultado.get(0));
		System.out.println(resultado.get(1));
		System.out.println(resultado.get(2));
		System.out.println(resultado.get(10));
		
	}
}
