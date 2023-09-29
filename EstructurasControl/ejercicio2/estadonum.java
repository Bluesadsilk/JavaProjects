package EstructurasControl.ejercicio2;

import java.util.Scanner;

public class estadonum {

    public static void main(String[] args) {

        int numIntr;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número para saber su estado");
        numIntr = teclado.nextInt();

        teclado.close();

        if (numIntr >= 1) {

            System.out.println("El número es positivo");

        }

        if (numIntr < 0) {

            System.out.println("El número es negativo");

        }

        if (numIntr == 0) {

            System.out.println("El número es nulo");

        }

    }

}
