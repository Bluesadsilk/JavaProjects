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

    public void Enseña() {
        int menor = 100;
        String menorPosicion = "";

        int mayor = 0;
        String mayorPosicion = "";

        int menorFila = 0;
        String menorFilaPosicion = "";

        int menorColumna = 0;
        String menorColumnaPosicion = "";

        int suma = 0;
        int[][] matriz = new int[3][6];
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100 + 1);
                menor = Math.min(menor, j);
                mayor = Math.max(mayor, j);
                suma += matriz[i][j];
            }

        }
        int media = suma / (matriz.length * matriz[1].length);

        System.out.println("El menor número de la matriz es = " + menor + " y su posición es " + menorPosicion);

        System.out.println("El mayor número de la matriz es = " + mayor + " y su posición es " + mayorPosicion);

        System.out.println("El menor número de la fila es = " + menorFila + " y su posición es " + menorFilaPosicion);

        System.out.println(
                "El menor número de la columna es = " + menorColumna + " y su posición es " + menorColumnaPosicion);

        System.out.println("La media de todos los números es = " + media);

        System.out.println("La suma de todos los números es = " + suma);

    }

    public void VerificaDiagonal() {
        int[][] matriz = new int[4][4];
        boolean comprobador = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 2 + 1);
            }
            if (matriz[0][0] != matriz[i][i]) {
                comprobador = false;
            }
        }
        System.out.println(Arrays.deepToString(matriz));
        if (comprobador == true) {
            System.out.println("Es simétrica");

        } else {
            System.out.println("No es simétrica");
        }
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

        // Llama al procedimiento que enseña parámetros de dentro de una matriz de 3x6.
        Menu.Enseña();

        // Llama al procedimineto que genera una matriz de 4x4 y verifica si la diagonal
        // es simétrica
        Menu.VerificaDiagonal();

    }

}
