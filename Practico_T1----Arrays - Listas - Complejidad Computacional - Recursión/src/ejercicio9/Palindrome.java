package ejercicio9;

import java.util.Iterator;

public class Palindrome {

	public boolean esPalindrome(String palabra) {
		String valor = palabra.toLowerCase().replace(" ", "");
		
		if (valor == null || valor.isEmpty())
            return true;
		
		for (int i = 0; i < valor.length()/2; i++) {
			System.out.println(valor.charAt(i));
			//if (Character.compare(valor.charAt(i), valor.charAt(valor.length() - 1 - i)) != 0)
			if(valor.charAt(i) != valor.charAt(valor.length() - 1 - i)) {
				System.out.println("pq entra?: " + valor.charAt(i) + " - " + valor.charAt(valor.length() - 1 - i));
				return false;
			}
		}
		return true;
		
	}
}
