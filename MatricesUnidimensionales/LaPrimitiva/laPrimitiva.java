/*
*
* 
*
* Creada el 05 dic 2023, 15:55:15
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 05 dic 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 05 dic 2023
*/
package MatricesUnidimensionales.LaPrimitiva;

import java.util.Arrays;
import java.util.Scanner;

public class laPrimitiva {

    Scanner teclado = new Scanner(System.in);

    public int[] numApuesta() {

        System.out.println("Elija la forma que desea para obtener el número de su apuesta");
        System.out.println("1. Aleatorio");
        System.out.println("2. Introducir número");
        int option = teclado.nextInt();
        int min = 1;
        int max = 49;
        int rango = max - min + 1;

        int[] chooseNum = new int[6];
        switch (option) {
            case 1:

                for (int i = 0; i < chooseNum.length; i++) {
                    chooseNum[i] = (int) (Math.random() * rango + min);

                }

                break;

            case 2:

                for (int i = 0; i < chooseNum.length; i++) {
                    System.out.println("Introduzca número");

                }

            default:
                System.out.println("Error, seleccione opción 1 u opción 2");
                break;
        }

        System.out.println("Su numero es: " + Arrays.toString(chooseNum));
        return chooseNum;

    }

    public laPrimitiva() {
    }

    public static void main(String[] args) {
        laPrimitiva menu = new laPrimitiva();

        int[] numLocal = menu.numApuesta();

        System.out.println(numLocal);

    }

}
