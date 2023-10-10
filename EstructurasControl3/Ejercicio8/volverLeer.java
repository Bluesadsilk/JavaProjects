package EstructurasControl3.Ejercicio8;

import java.util.Scanner;

public class volverLeer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int nIntroducido = teclado.nextInt();
        int digitos = 0;
        int numerador = 1000;

        while (true) {

            if (nIntroducido > 0) {

                while (numerador >= 10) {
                    numerador = numerador / 10;
                    digitos++;

                }

                System.out.println("El número " + nIntroducido + " contiene " + digitos + " decimales");

                break;

            }

            else {
                System.out.println("Introduzca un número válido.");

            }

        }

        teclado.close();

    }

}
