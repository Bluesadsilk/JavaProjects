package EstructurasControl3.Ejercicio6;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número para conocer su factorial");
        int nIntroducido = teclado.nextInt();
        if (nIntroducido != 0) {

            int factorial = nIntroducido;
            int contador = 1;
            int operador = nIntroducido - 1;

            while (contador < nIntroducido) {

                factorial = factorial * operador;
                contador++;
                operador--;

            }

            System.out.println("El factorial de " + nIntroducido + " es igual a " + factorial);

        } else {
            System.out.println(" El factorial de 0 es igual a 1");
        }
        teclado.close();
    }

}
