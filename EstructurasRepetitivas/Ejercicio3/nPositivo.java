package EstructurasRepetitivas.Ejercicio3;

import java.util.Scanner;

public class nPositivo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int n = teclado.nextInt();

        while (true) {

            if (n < 1) {

                System.out.println("Introduzca un número válido");
                n = teclado.nextInt();

            }

            else {

                teclado.close();
                break;
            }

        }

        int contador = 3;

        while (n + 1 > contador) {

            System.out.println(contador + " es multiplo de 3");

            int divisor = 1;

            while (divisor < contador + 3) {

                if (contador % divisor == 0) {

                    System.out.println(divisor + " es divisor de " + contador);

                }

                divisor++;
            }

            contador = contador + 3;
        }
    }

}
