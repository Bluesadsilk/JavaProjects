package EstructurasControl.ejercicio1;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double num1, num2;

        System.out.println("Introduce el primer número");
        num1 = teclado.nextInt();

        System.out.println("Introduce el segundo número");
        num2 = teclado.nextInt();

        teclado.close();

        if (num1 == num2) {

            System.out.println("Los números introducidos son iguales");

        }

        if (num1 > num2) {

            System.out.println("El primer número, " + num1 + "  es mayor.");

        } else {

            System.out.println("El segundo número," + num2 + "  es mayor.");

        }

    }

}
