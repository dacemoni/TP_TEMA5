package ejerciciostecnicas5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

	protected ArrayList<Integer> notas = new ArrayList<>();
	private int nota = 0;
	private double sumatorio = 0;

	public void notaMedia4(Scanner teclado) {
		do {
			System.out.println("¿Nota?");
			nota = teclado.nextInt();
			if (nota >= 0) {
				notas.add(nota);
			} 
			else {
				for (Integer integer : notas) {
					sumatorio += integer;
				}
				double media = sumatorio / notas.size();
				System.out.println("La media de las notas " + notas + " es: " + media);
				notas.clear();
			}
		} while (nota != -1);
	}
}
