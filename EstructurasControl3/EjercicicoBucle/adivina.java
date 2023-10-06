package EstructurasControl3.EjercicicoBucle;

import java.util.Scanner;

public class adivina {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Voy a pensar un numero de 1 al 100, tu objetivo es adivinarlo, si no al gulag");

        int adivina = (int) (Math.random() * 101);

        int resultado = 0;

        int intentos = 0;

        while (adivina != resultado) {

            System.out.println("¿Lo tienes?");
            resultado = teclado.nextInt();

            if (resultado > adivina) {

                System.out.println("Te has pasado amigo");

            } else {

                System.out.println("Te has quedado corto amigo");

            }

            intentos++;

        }

        System.out.println("Muy bien, lo has acertado");
        System.out.println("Numero de intentos = " + intentos);

        teclado.close();
    }

}
