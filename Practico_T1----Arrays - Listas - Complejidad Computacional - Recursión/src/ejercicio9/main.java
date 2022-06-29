package ejercicio9;

public class main {

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		String prueba = new String("oro");
		String prueba1 = new String("");


		System.out.println(p.esPalindrome(prueba));
		System.out.println(p.esPalindrome(prueba1));

	}

}
