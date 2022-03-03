package ejerciciostecnicas5;

import java.util.Scanner;

public class Ejercicio5 {
	
	Scanner teclado = new Scanner(System.in);
	String palindromo = "";

	public boolean comprobarPalindromo(Scanner teclado) {
		System.out.println("Escriba una palabra sin acentos, en minúsculas y después #");
		palindromo = teclado.nextLine().toLowerCase();
		char[] valores = palindromo.toCharArray();
		for (int inicio = 0, fin = palindromo.length() - 2; inicio <= fin; inicio++, fin--) {
			if (valores[inicio] != valores[fin]) {
				return false;
			}
		}
		return true;
	}

	public void esPalindromo() {
		if (comprobarPalindromo(teclado)) {
			System.out.println(palindromo + " es palíndromo.");
		} 
		else {
			System.out.println(palindromo + " no es palíndromo.");
		}
	}
}
