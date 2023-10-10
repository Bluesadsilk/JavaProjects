package EstructurasControl3.Ejercicio8;

import java.util.Scanner;

public class volverLeer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int nIntroducido = teclado.nextInt();

        while (true) {

            if (nIntroducido > 0) {

                int resultado = nIntroducido;

                System.out.println("El número " + nIntroducido + " contiene " + resultado + " decimales");

                break;

            }

            else {
                System.out.println("Introduzca un número válido.");

            }

        }

        teclado.close();

    }

}
