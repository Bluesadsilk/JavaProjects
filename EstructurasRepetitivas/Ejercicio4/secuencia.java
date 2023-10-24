
package EstructurasRepetitivas.Ejercicio4;

import java.util.Scanner;

public class secuencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número N: ");
        int n = teclado.nextInt();
        teclado.close();

        // Imprime la secuencia ascendente
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Imprime las secuencias descendentes
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
