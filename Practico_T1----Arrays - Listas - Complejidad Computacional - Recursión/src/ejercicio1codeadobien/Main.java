package ejercicio1codeadobien;

public class Main {
	
	public static void main(String[] args) {
		Lista l1 = new Lista<>();
		Nodo n1 = new Nodo<Integer>(1);
		Nodo n2 = new Nodo<Integer>(4);
		l1.insertFront(n1);
		l1.insertFront(n2);
		l1.insertFront(9);
		
		
		System.out.println(l1.get(0));
		System.out.println(l1.get(1));
		System.out.println(l1.get(2));
		l1.extractFront();
		System.out.println("dsanmjsadn");
		System.out.println(l1.get(2));
	}
}
