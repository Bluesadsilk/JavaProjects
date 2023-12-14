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
    int min, max;
    int[] chooseNum = new int[6];
    boolean stat = true;

    // Genera de forma automática el número jugador para el usuario.
    public int[] NumGen() {
        min = 1;
        max = 49;
        int rango = max - min + 1;
        for (int i = 0; i < chooseNum.length; i++) {

            do {
                chooseNum[i] = (int) (Math.random() * rango + min);
                stat = true;
                for (int j = 0; j < i; j++) {
                    if (chooseNum[i] == chooseNum[j]) {
                        stat = false;

                    }

                }
            } while (!stat);

            // mientras no sea valido
            // generar num
            // comprobar si es valido
            // si es válido sale

        }

        return chooseNum;
    }

    // Permita al usuario ingresar los números del vector posición por posición y
    // los contrasta para ver si són válidos.
    public int[] NumUser() {

        for (int i = 0; i < chooseNum.length; i++) {

            do {
                chooseNum[i] = teclado.nextInt();

                while (chooseNum[i] <= 0 || chooseNum[i] >= 50) {
                    System.out.println("Número no válido, por favor introduzca un número comprendido entre 1 y 49");
                    chooseNum[i] = teclado.nextInt();

                }
                stat = true;
                for (int j = 0; j < i; j++) {
                    if (chooseNum[i] == chooseNum[j]) {
                        stat = false;
                        System.out.println("Número no válido, por favor introduzca un número válido");

                    }

                }
            } while (!stat);
        }

        return chooseNum;
    }

    // Interfaz para que el usuario elija de que forma desea obtener el número
    // jugador.
    public int[] NumApuesta() {

        System.out.println("Elija la forma que desea para obtener el número de su apuesta");
        System.out.println("1. Aleatorio");
        System.out.println("2. Introducir número");
        int option = 0;

        // Bucle para obligar a elegir una opción válida
        while (option != 1 && option != 2) {
            option = teclado.nextInt();
            if (option != 1 && option != 2) {
                System.out.println("Opción no válida");
            }
        }

        switch (option) {
            // Llama a la función NumGen que crea el número aleatorio.
            case 1:
                chooseNum = NumGen();
                break;

            case 2:
                // Llama a la función NumUser para que el usuario pueda introducir el número
                // manualmente.
                System.out.println("Introduzca el primer número");
                chooseNum = NumUser();

            default:
                System.out.println("Error, seleccione opción 1 u opción 2");
                break;
        }

        // Comunica al usuario el número jugador
        System.out.println("Su numero es: " + Arrays.toString(chooseNum));
        return chooseNum;

    }

    // Metodo genera el reintegro del usuario
    public int usuarioReintegro() {
        int userReintegro = (int) (Math.random() * 10);
        System.out.println("Su número de reintegro es:" + userReintegro);
        return userReintegro;
    }

    // Realiza la operación para calcular el número de reintegro.
    public int Reintegro() {
        min = 0;
        max = 9;
        int rango = max - min + 1;
        int reintegro = (int) (Math.random() * rango + min);
        System.out.println("El número de reintegro es :" + reintegro);
        return reintegro;
    }

    // Realiza la operación para calcular el número complementario.
    public int Complementario() {
        min = 0;
        max = 49;
        int rango = max - min + 1;
        int complementario = (int) (Math.random() * rango + min);
        System.out.println("El número complementario es :" + complementario);
        return complementario;
    }

    // Realiza la operación para calcular el número ganador.
    public int[] Sorteo() {
        min = 0;
        max = 49;
        int rango = max - min + 1;
        int[] numSorteo = new int[6];
        for (int i = 0; i < numSorteo.length; i++) {
            numSorteo[i] = (int) (Math.random() * rango + min);
        }
        // Comunica al usuario el número premiado
        System.out.println("El numero premiado es: " + Arrays.toString(numSorteo));
        return numSorteo;
    }

    // Realiza la asignación de premios una vez se tienen todas las variables.
    public void Premios(int reintegro, int complementario, int[] numApuesta, int[] numSorteo, int reintegroUsuario) {

        int numAciertos = 0;
        boolean reintegroComp = false;
        boolean complementarioComp = false;

        if (reintegroUsuario == reintegro) {
            reintegroComp = true;

            for (int i = 0; i < numSorteo.length; i++) {

                if (numApuesta[i] == numSorteo[i]) {
                    numAciertos++;
                }
                if (numApuesta[i] == complementario) {
                    complementarioComp = true;

                }

            }

        }

        // Switch para repartir los premios sin contar el reintegro
        switch (numAciertos) {
            case 1:
                System.out.println("Su número ha sido premiado con 1 acierto");

                break;

            case 2:
                System.out.println("Su número ha sido premiado con 2 aciertos");

                break;

            case 3:
                System.out.println("Su número ha sido premiado con 3 aciertos");

                break;

            case 4:
                System.out.println("Su número ha sido premiado con 4 aciertos.");

                break;

            // Si el número de aciertos equivale a 5 identifica si el complementario aparece
            // en el número jugador
            case 5:
                if (complementarioComp == true) {
                    System.out.println("Su número ha sido premiado con 5 aciertos y el número complementario.");

                } else {
                    System.out.println("Su número ha sido premiado con 5 aciertos.");
                }

                break;

            case 6:
                System.out.println("Su número ha sido premiado con 6 aciertos.");

                break;

            default:
                System.out.println("Su número no ha sido premiado");
                break;
        }

        if (reintegroComp == true) {
            System.out.println("Su número ha obtenido el reintegro");
        }

        else {
            System.out.println("Su número no ha obtenido el reintegro");
        }

    }

    // Método constructor.
    public laPrimitiva() {
    }

    public static void main(String[] args) {

        // Llama al metodo constructor.
        laPrimitiva Menu = new laPrimitiva();

        // Menú para escoger el número jugador, generado o introducido y mostrarlo.
        int[] numJugador = Menu.NumApuesta();

        // Genera el número de reintegro jugador y lo muestra.
        int userReintegro = Menu.usuarioReintegro();

        // Genera el número ganador y lo muestra.
        int[] numGanador = Menu.Sorteo();

        // Genera el número de reintegro y lo muestra.
        int reintegro = Menu.Reintegro();

        // Genera el número complementario y lo muestra.
        int complementario = Menu.Complementario();

        // Compara los números y muestra los premios.
        Menu.Premios(reintegro, complementario, numJugador, numGanador, userReintegro);

    }

}
