/*
*
* 
*
* Creada el Dec 18, 2023, 1:26:18 PM
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia Dec 18, 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date Dec 18, 2023
*/
package MatricesBidimensionales.MatricesDos;

import java.util.Arrays;

public class EjMatricesDos {

    public EjMatricesDos() {
    }

    // Genera una matriz de 10x10 y llena las celdas pares con un 1 y las demas con
    // un 0.
    public int[][] GeneraMatriz() {
        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                if (i % 2 == 0) {
                    matriz[i][j] = 1;
                }
            }
        }
        return matriz;
    }

    // Genera una matriz de 5x5 y la llena en diagonal con unos.
    public int[][] MatrizDiagonal() {
        int[][] matriz2 = new int[5][5];
        for (int i = 0, h = 4; i < matriz2.length; i++, h--) {
            for (int j = 0; j < matriz2.length; j++) {
                if (j == i) {
                    matriz2[i][j] = 1;
                    matriz2[i][h] = 1;
                }

            }
        }
        return matriz2;
    }

    // Genera dos matrices de 5X4 las llena con datos aleatorios y las acaba sumando
    // en una nueva matriz
    public int[][] SumaMatrices() {
        int min = 1;
        int max = 100;
        int rango = max - min + 1;

        int[][] matrizSuma1 = new int[5][4];
        int[][] matrizSuma2 = new int[5][4];
        int[][] matrizSuma = new int[5][4];

        for (int i = 0; i < matrizSuma2.length; i++) {

            for (int j = 0; j < matrizSuma2[i].length; j++) {
                matrizSuma1[i][j] = (int) (Math.random() * rango + min);
                matrizSuma2[i][j] = (int) (Math.random() * rango + min);
                matrizSuma[i][j] = matrizSuma1[i][j] + matrizSuma2[i][j];

            }
        }

        return matrizSuma;
    }

    public static void main(String[] args) {

        EjMatricesDos Menu = new EjMatricesDos();

        // Llama al metodo que genera la matriz 1.
        int[][] matriz = Menu.GeneraMatriz();

        System.out.println(Arrays.deepToString(matriz));

        // Llama al metodo que genera la matriz 2;
        int[][] matriz2 = Menu.MatrizDiagonal();

        System.out.println(Arrays.deepToString(matriz2));

        // Llama al metodo que genera dos matrices de 5x4 y las suma en una nueva.
        int[][] matriz3 = Menu.SumaMatrices();

        System.out.println(Arrays.deepToString(matriz3));
    }

}
