package ejerciciostecnicas5;

public class Ejercicio1 {
	
	private int[] arrInt = new int[11];

	public void ordenDescendente() {
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[(arrInt.length-1)-i] = i;
		}
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println("Posicion: " + i + " contiene: " + arrInt[i]);
		}
	}
}