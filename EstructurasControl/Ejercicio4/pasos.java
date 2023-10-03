package EstructurasControl.Ejercicio4;

import java.util.Scanner;

public class pasos {

    public static void main(String[] args) {

        /* Llamamos al objeto Scanner para poder introducir los pasos totales */

        System.out.println("Introduce el numero de pasos totales para calcular el coste de la llamada");

        Scanner teclado = new Scanner(System.in);

        double pasosTotales = teclado.nextInt();
        teclado.close();

        /*
         * Definimos una variable para almacenar el precio del paso y que varíe según la
         * cantidad
         */

        if (pasosTotales <= 5) {

            pasosTotales = pasosTotales * 0.10;

        }

        else {
            pasosTotales = 5 * 0.10 + (pasosTotales - 5) * 0.05;
        }

        /*
         * Indicamos una nueva variable que almacene el precio de la llamada total e
         * introducimos una operación que lo calcule
         */

        double precioLlamada = pasosTotales;

        System.out.println("El precio de la llamada es: " + precioLlamada + "$");

    }

}
