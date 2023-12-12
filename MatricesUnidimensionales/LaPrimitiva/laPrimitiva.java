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
    int min, max, rango = max - min + 1;

    int[] chooseNum = new int[6];
    boolean stat = true;

    // Genera de forma automática el número jugador para el usuario.
    public int[] NumGen() {
        min = 1;
        max = 49;
        for (int i = 0; i < chooseNum.length; i++) {
            stat = true;
            chooseNum[i] = (int) (Math.random() * rango + min);

            for (int j = 0; j < i; j++) {

                if (chooseNum[i] == chooseNum[j]) {
                    stat = false;
                    System.out.println("Número no válido");
                    break;
                }

            }

        }

        return chooseNum;
    }

    // Permita al usuario ingresar los números del vector posición por posición y
    // los contrasta para ver si són válidos.
    public int[] NumUser() {
        min = 1;
        max = 49;
        for (int i = 0; i < chooseNum.length; i++) {
            System.out.println("Introduzca número");
            chooseNum[i] = teclado.nextInt();
            if (chooseNum[i] < 0 || chooseNum[i] > 49) {
                System.out.println("Numero erróneo");
                i--;

            }

        }

        return chooseNum;
    }

    // Interfaz para que el usuario elija de que forma desea obtener el número
    // jugador.
    public int[] NumApuesta() {

        System.out.println("Elija la forma que desea para obtener el número de su apuesta");
        System.out.println("1. Aleatorio");
        System.out.println("2. Introducir número");
        int option = teclado.nextInt();

        switch (option) {
            case 1:
                chooseNum = NumGen();
                break;

            case 2:

                chooseNum = NumUser();

            default:
                System.out.println("Error, seleccione opción 1 u opción 2");
                break;
        }

        System.out.println("Su numero es: " + Arrays.toString(chooseNum));
        return chooseNum;

    }

    // Realiza la operación para calcular el número de reintegro.
    public int Reintegro() {
        min = 0;
        max = 9;
        int reintegro = (int) (Math.random() * rango + min);
        return reintegro;
    }

    // Realiza la operación para calcular el número complementario.
    public int Complementario() {
        min = 0;
        max = 49;
        int complementario = (int) (Math.random() * rango + min);
        return complementario;
    }

    // Realiza la operación para calcular el número ganador.
    public int[] Sorteo() {

        int[] numSorteo = new int[6];
        return numSorteo;
    }

    // Realiza la asignación de premios una vez se tienen todas las variables.
    public void Premios(int reintegro, int complementario, int[] numApuesta, int[] numSorteo) {

        int numAciertos = 0;
        boolean valComp = false;

        for (int i = 0; i < numSorteo.length; i++) {

            if (numApuesta[i] == numSorteo[i]) {
                numAciertos++;
            }
        }

        if (numAciertos == 5) {
            valComp = true;

        }

        System.out.println("Su permio es " + numAciertos);
        System.out.println("Perdedor");

    }

    // Método constructor.
    public laPrimitiva() {
    }

    public static void main(String[] args) {
        laPrimitiva Menu = new laPrimitiva();

        int[] numJugador = Menu.NumApuesta();
        int reintegro = Menu.Reintegro();
        int complementario = Menu.Complementario();
        int[] numGanador = Menu.Sorteo();

        Menu.Premios(reintegro, complementario, numJugador, numGanador);

    }

}
