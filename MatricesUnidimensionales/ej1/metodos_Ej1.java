/*
*
* 
*
* Creada el 30 nov 2023, 17:30:11
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 30 nov 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 30 nov 2023
*/
package MatricesUnidimensionales.ej1;

import java.util.Scanner;

public class metodos_Ej1 {
    Scanner teclado = new Scanner(System.in);

    public void elUno() {

        System.out.println("Introduzca los valores a los siguientes parámetros del vector");

        int[] vector = new int[15];
        int n;
        for (int i = 0; i < vector.length; i++) {

            System.out.println("Introduzca el valor para la posición: " + i);
            vector[i] = teclado.nextInt();

        }

        System.out.println("Introduzca el rango de números que desee que muestre");

        while (true) {
            n = teclado.nextInt();
            if (n <= vector.length) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {

            System.out.println("Valor: " + i + " = " + vector[i]);
        }

    }

}
