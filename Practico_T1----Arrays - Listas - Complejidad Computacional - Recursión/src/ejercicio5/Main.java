package ejercicio5;

import java.util.Iterator;

import ejercicio5.Lista;

public class Main {
	
	public static void main(String[] args) {
		Lista<Integer> l1 = new Lista<>();
		l1.insertFront(1);
		l1.insertFront(5);
		l1.insertFront(7);
		l1.print();
		
		//System.out.println(l1.get(0));

        for (Integer value : l1) {
            System.out.println(value);
        }
		
		
		System.out.println(l1.get(2));
	}
}
