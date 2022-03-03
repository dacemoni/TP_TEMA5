package ejerciciostecnicas5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	
	private int[] contador = new int[10];
	private ArrayList<Integer> arrNum = new ArrayList<>();

	public void nOcurrencias(Scanner teclado) {
		Arrays.fill(contador, 0);
		int valor;
		do {
			System.out.println("Introduzca un valor comprendido entre 0 y 9 o -1 para terminar: ");
			valor = teclado.nextInt();
			arrNum.add(valor);
		} while (valor != -1);

		for (int i = 0; i < contador.length; i++) {
			for (int aux : arrNum) {
				if (aux == i) {
					contador[i]++;
				}
			}
		}
		for (int i = 0; i < contador.length; i++) {
			System.out.printf("Cantidad de %d: %d%n", i, contador[i]);
		}
	}
}
