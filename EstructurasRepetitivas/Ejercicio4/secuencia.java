
package EstructurasRepetitivas.Ejercicio4;

import java.util.Scanner;

public class secuencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número N: ");

        int n = teclado.nextInt();
        teclado.close();

        for (int i = 1; i <= n; i++) {

            System.out.println("N = " + i);
            int ini = 1;
            int fin = i;

            while (ini <= fin) {

                for (int j = ini; j <= fin; j++) {
                    System.out.print(j + "");

                }
                System.out.println("");
                ini++;
                fin--;
            }

        }
    }
}
