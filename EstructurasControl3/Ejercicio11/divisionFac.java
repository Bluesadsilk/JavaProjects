package EstructurasControl3.Ejercicio11;

import java.util.Scanner;

public class divisionFac {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca dos números para saber el resultado de su división");
        System.out.println("Introduzca el dividendo");
        int dividendo = teclado.nextInt();
        System.out.println("Introduzca el divisor");
        int divisor = teclado.nextInt();

        while (true) {

            if (dividendo >= 1) {

                break;

            }

            else {

                System.out.println("Introduzca un dividendo válido");
                dividendo = teclado.nextInt();

            }

        }

        while (true) {

            if (divisor >= 1) {

                break;
            }

            else {

                System.out.println("Introduzca un divisor válido");
                divisor = teclado.nextInt();

            }

        }

        teclado.close();

        int resto = dividendo % divisor;
        int contador = 0;

        while (dividendo >= 1) {
            dividendo = dividendo - divisor;
            contador++;
        }

        System.out.println("El resultado es = " + contador + ", el resto es " + resto);

    }

}
