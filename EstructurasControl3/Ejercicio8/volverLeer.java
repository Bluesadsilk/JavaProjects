package EstructurasControl3.Ejercicio8;

import java.util.Scanner;

public class volverLeer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int digitos = 1;

        while (true) {
            int nIntroducido = teclado.nextInt();
            if (nIntroducido > 0) {
                while (nIntroducido >= 10) {
                    nIntroducido = nIntroducido / 10;
                    digitos++;

                }

                System.out.println("El número contiene " + digitos + " decimales");

                break;

            }

            else {
                System.out.println("Introduzca un número válido.");

            }

        }

        teclado.close();

    }

}
