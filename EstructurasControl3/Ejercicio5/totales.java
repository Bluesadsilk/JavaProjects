package EstructurasControl3.Ejercicio5;

import java.util.Scanner;

public class totales {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;
        int positivos = 1;
        int negativos = 1;
        int nulos = 1;

        while (contador < 101) {

            System.out.println("Introduzca un número para proceder a la suma de totales.");

            int entrada = teclado.nextInt();

            contador++;

            if (entrada < 0) {

                negativos = negativos++;

            } else {

                if (entrada == 0) {

                    nulos = nulos++;

                } else {
                    positivos = positivos++;
                }

            }

        }

        teclado.close();

        System.out.println(
                "La suma de los números positivos introducidos es = " + positivos
                        + ", la suma de los números negativos introducidos es = "
                        + negativos + " y la suma de los números nulos es = 0 ");

    }

}
