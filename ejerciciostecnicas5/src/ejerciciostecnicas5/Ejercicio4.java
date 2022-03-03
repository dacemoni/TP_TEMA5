package ejerciciostecnicas5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	private int[] votos = new int[4];
	private double cantidadVotos = 0;

	public void elecciones(Scanner teclado) {
		Arrays.fill(votos, 0);
		int opcion = 0;
		do {
			try {
				System.out.println("Elija entre: ");
				menuCandidatos();
				opcion = teclado.nextInt();
				switch (opcion) {
				case 1:
					votos[0]++;
					break;
				case 2:
					votos[1]++;
					break;
				case 3:
					votos[2]++;
					break;
				case 4:
					votos[3]++;
					break;
				default:
					System.out.println("La opción elegida no existe. ");
					break;
				}
				System.out.println("ha votado");
			} 
			catch (InputMismatchException e) {
				System.out.println("El caracter introducido no es correcto.");
				teclado.nextLine();
			}
		} while (opcion != 68753421);

		for (int voto : votos) {
			cantidadVotos += voto;
		}
		
		System.out.println("\nResultados: ");
		System.out.println("Emilia TERREROS: " + Math.round(votos[0] / cantidadVotos * 100 * 100.0) / 100.0 + " %");
		System.out.println("Gerardo ESCODAR: " + Math.round(votos[1] / cantidadVotos * 100 * 100.0) / 100.0 + " %");
		System.out.println("María AGUAVIVA: " + Math.round(votos[2] / cantidadVotos * 100 * 100.0) / 100.0 + " %");
		System.out.println("Nadia LETUX: " + Math.round(votos[3] / cantidadVotos * 100 * 100.0) / 100.0 + " %");
	}

	private void menuCandidatos() {
		System.out.println("1 - Emilia TERREROS");
		System.out.println("2 - Gerardo ESCODAR");
		System.out.println("3 - María AGUAVIVA");
		System.out.println("4 - Nadia LETUX");
	}
}
