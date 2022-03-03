package ejerciciostecnicas5;

import java.util.Random;

public class Ejercicio7 {
	
    Random random = new Random();
    private char[][] char2d  = new char[20][30];
    private char caracter = (char) (random.nextInt(26) + 'a');

    public void mostrarTabla() {
        for (int i = 0; i < char2d.length; i++) {
            for (int j = 0; j < char2d.length; j++) {
            	char2d[i][j] = caracter;
            	caracter = (char) (random.nextInt(26) + 'a');
                System.out.print(char2d[i][j]);
            }
            System.out.println();
        }
    }
}
