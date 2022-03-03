package ejerciciostecnicas5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		Ejercicio1 ejercicio1 = new Ejercicio1();
		Ejercicio2 ejercicio2 = new Ejercicio2();
		Ejercicio3 ejercicio3 = new Ejercicio3();
		Ejercicio4 ejercicio4 = new Ejercicio4();
		Ejercicio5 ejercicio5 = new Ejercicio5();
		Ejercicio6 ejercicio6 = new Ejercicio6();
		Ejercicio7 ejercicio7 = new Ejercicio7();
		Ejercicio8 ejercicio8 = new Ejercicio8();
		Ejercicio9 ejercicio9 = new Ejercicio9();
		Ejercicio10 ejercicio10 = new Ejercicio10();

		do {
			System.out.println("\nElija una de las opciones: ");
			menu();
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				ejercicio1.ordenDescendente();
				break;
			case 2:
				ejercicio2.nOcurrencias(teclado);
				break;
			case 3:
				ejercicio3.notaMedia4(teclado);
				break;
			case 4:
				ejercicio4.elecciones(teclado);
				break;
			case 5:
				ejercicio5.esPalindromo();
				break;
			case 6:
				ejercicio6.queHace(teclado);
				break;
			case 7:
				ejercicio7.mostrarTabla();
				break;
			case 8:
				ejercicio8.juegoBarcos(teclado);
				break;
			case 9:
				ejercicio9.juego3EnRaya(teclado);
				break;
			case 10:
				ejercicio10.cosaEmpleado(teclado);
				break;
			case 11:
				System.out.println("Adios.");
				break;
			default:
				System.out.println("La opción elegida no existe.");
			} 
		}
		while (opcion != 11);	
	}

    private static void menu() {
        System.out.println("1 - Despegue inmediato");
        System.out.println("2 - Número de ocurrencias");
        System.out.println("3 - Nota media (versión 4)");
        System.out.println("4 - Máquina de votar");
        System.out.println("5 - Palíndromo");
        System.out.println("6 - ¿Qué hace?");
        System.out.println("7 - Matriz");
        System.out.println("8 - Micro guerra de barcos");
        System.out.println("9 - Tres en raya");
        System.out.println("10 - Registro de Empleados");
        System.out.println("11 - Salir");
    }

}
