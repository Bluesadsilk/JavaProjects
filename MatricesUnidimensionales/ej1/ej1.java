/*
*
* 
*
* Creada el 30 nov 2023, 17:28:16
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

public class ej1 {

    public ej1() {
    }

    public static void main(String[] args) {
        metodos_Ej1 menu = new metodos_Ej1();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Seleccione una de las opciones:");
        System.out.println("1. Muestre la suma del rango y numero indicados.");
        System.out.println("2. Muestra los arrays con los parámetros.");
        System.out.println("3. Muestra la media de las notas y las notas por debajo de esta");
        int num = teclado.nextInt();

        switch (num) {
            case 1:
                menu.elUno();

                break;
            case 2:

                menu.elDos();

                break;

            case 3:

                menu.elTres();

                break;

            default:
                break;
        }

        teclado.close();

    }

}
