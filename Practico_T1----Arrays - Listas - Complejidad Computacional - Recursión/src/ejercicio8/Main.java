package ejercicio8;

public class Main {
	
	public static void main(String[] args) {
		Lista l1 = new Lista<>();
		//Nodo n1 = new Nodo<Integer>(1);
		//Nodo n2 = new Nodo<Integer>(4);
		
		l1.insertarOrdenado(5);
		l1.insertarOrdenado(9);
		l1.insertarOrdenado(3);
		l1.insertarOrdenado(10);
		
		Lista l2 = new Lista<>();
		//l2.insertFront(77);
		l2.insertFront(5);
		l2.insertFront(9);
		l2.insertFront(3);
		l2.insertFront(10);
		
		System.out.println(l1.get(0));
		System.out.println(l1.get(0).getSig());
		System.out.println(l1.get(0).getSig().getSig());
		System.out.println(l1.get(0).getSig().getSig().getSig());
		///// al reves
		System.out.println(l1.get(3)); System.out.println(l1.get(3).getAnterior());
		System.out.println(l1.get(3).getAnterior().getAnterior());
		System.out.println(l1.get(3).getAnterior().getAnterior().getAnterior());
		System.out.println("prueba");
		System.out.println(l2.get(0));
		System.out.println(l2.get(0).getSig());
		System.out.println(l2.get(0).getSig().getSig());
		System.out.println(l2.get(0).getSig().getSig().getSig());
		
	}
}
