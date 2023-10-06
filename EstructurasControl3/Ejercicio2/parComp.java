package EstructurasControl3.Ejercicio2;

import java.util.Scanner;

public class parComp {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println(
                "Introduzca dos números para conocer los números pares que se encuentran en el rango de estos");

        System.out.println("Introduzca el primer número");
        int n1 = teclado.nextInt();

        System.out.println("Introduzca el segundo número");
        int n2 = teclado.nextInt();
        teclado.close();

        int nmax;
        int nmin;

        System.out.println("Los números pares son : ");

        if (n1 > n2) {

            nmax = n1;
            nmin = n2;

        } else {

            nmax = n2;
            nmin = n1 + 1;

        }

        while (nmin != nmax) {

            if (nmin % 2 == 0) {

                System.out.println(nmin);
            }
            nmin++;
        }
    }

}
