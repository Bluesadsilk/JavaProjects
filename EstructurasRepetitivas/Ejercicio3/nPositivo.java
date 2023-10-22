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

                break;
            }

        }

        int contador = 0;

        while (contador < n - 3) {

            contador = contador + 3;
            System.out.println(contador + " 10es multiplo de 3");
            String divisores = "";

            while (true) {

                break;
            }

            System.out.println("Los divisores de " + contador + " son " + divisores);

        }

        teclado.close();
    }

}
