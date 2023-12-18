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
    int[] chooseNum = new int[6];
    int min = 1;
    int max = 49;
    int rango = max - min + 1;
    boolean stat = true;

    public int[] numGen() {

        for (int i = 0; i < chooseNum.length; i++) {

            chooseNum[i] = (int) (Math.random() * rango + min);

            for (int j = 0; j < i; j++) {
                if (chooseNum[i] == chooseNum[j]) {
                    stat = false;
                }
                while (!stat) {
                    chooseNum[i] = (int) (Math.random() * rango + min);
                }

            }

        }
        return chooseNum;

    }

    public int[] numChoose() {
        for (int i = 0; i < chooseNum.length; i++) {
            System.out.println("Introduzca el " + (i + 1) + "º");
            chooseNum[i] = teclado.nextInt();

            for (int j = 0; j < i; j++) {

                if (chooseNum[i] == chooseNum[j]) {

                    System.out.println("Número no válido");
                    break;
                }

            }
        }

        return chooseNum;

    }

    public int[] numApuesta() {

        System.out.println("Elija la forma que desea para obtener el número de su apuesta");
        System.out.println("1. Aleatorio");
        System.out.println("2. Introducir número");
        int option = teclado.nextInt();

        switch (option) {
            case 1:
                chooseNum = numGen();

                break;

            case 2:
                chooseNum = numChoose();
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
