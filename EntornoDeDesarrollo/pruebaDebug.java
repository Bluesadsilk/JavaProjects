/*
*
* 
*
* Creada el 06 nov 2023, 17:06:49
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 06 nov 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 06 nov 2023
*/
package EntornoDeDesarrollo;

import java.util.Scanner;

public class pruebaDebug {

    public static void main(String[] args) {

        int numAdivinar = 0;
        int numIntroducido = 0;
        int nIntentos = 0;

        Scanner sc = new Scanner(System.in);

        numAdivinar = (int) (Math.random() * 100);
        System.out.println("**********************************");
        System.out.println("* Adivina el número del 0 al 100 *");
        System.out.println("**********************************");

        do {

            System.out.println("Dame un número:");
            numIntroducido = sc.nextInt();
            sc.nextLine();
            nIntentos++;

            if (numIntroducido < numAdivinar) {

                System.out.println("El número buscado es mayor...");

            }

            else {

                if (numIntroducido > numAdivinar) {

                    System.out.println("El número buscado es menor...");
                }

                else {

                    System.out.println(
                            "¡Acertaste! (en " + numAdivinar + " con un número de intentos de " + nIntentos + " )");
                }
            }

        } while (numIntroducido != numAdivinar);
        sc.close();
    }
}
