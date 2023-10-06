package EstructurasControl3.Ejercicio1;

import java.util.Scanner;

public class compren {

    public static void main(String[] args) {

        int n1;
        int n2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca dos números para conocer los números que comprenden el rango entre si.");
        System.out.println("Introduzca el primer número");
        n1 = teclado.nextInt();
        System.out.println("Introduza el segundo número");
        n2 = teclado.nextInt();
        teclado.close();

        int nmenor;
        int nmayor;

        if (n1 > n2) {

            nmayor = n1;
            nmenor = n2;

        } else {

            nmayor = n2;
            nmenor = n1;
        }

        while (nmenor != nmayor + 1) {

            System.out.println(nmenor);

            nmenor++;

        }

    }

}
