/*
*
* ElAhorcado.java
*
* Creada el Dec 28, 2023, 1:52:08 PM
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia Dec 28, 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date Dec 28, 2023
*/
package MatricesBidimensionales.ElAhorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ElAhorcado
 */
public class ElAhorcado {
    Scanner teclado = new Scanner(System.in);

    // Genera la lista de palabras vacia
    String[] WordList = new String[5];

    // Muestra las opciones del menú principal
    public void ShowOptions() {
        System.out.println("1. Gestionar palabras");
        System.out.println("2. Jugar");
        System.out.println("3. Salir");
    }

    // Recoge la opción del menu principal elegida
    public int ChooseOptions() {
        System.out.println();
        System.out.println("Seleccione una opción");
        int option = teclado.nextInt();
        while (option > 3 && option < 1) {
            System.out.println("Opción no válida, por favor introduzca una opción válida");
            option = teclado.nextInt();
        }
        return option;
    }

    // Muestra las opciones del menu gestionar palabras
    public void ShowManageOptions() {
        System.out.println("1. Añadir palabra");
        System.out.println("2. Listar palabras");
        System.out.println("3. Buscar palabra");
        System.out.println("4. Eliminar palabra");
        System.out.println("5. Salir");
    }

    // Recoge la opción del menu gestionar palabras escogida
    public int ChooseManageOptions() {
        System.out.println();
        System.out.println("Seleccione una opción");
        int option = teclado.nextInt();
        while (option > 5 && option < 1) {
            System.out.println("Opción no válida, por favor introduzca una opción válida");
            option = teclado.nextInt();
        }
        return option;
    }

    public void AddWord() {
        for (int i = 0; i < WordList.length; i++) {

        }
        System.out.println("Las palabras son : " + Arrays.toString(WordList));
    }

    public void ListWord() {
        System.out.println("Las palabras son : ");
        for (int i = 0; i < WordList.length; i++) {
            System.out.print(WordList[i] + " ");
        }

    }

    public void SearchWord() {

    }

    public void RemoveWord() {
    }

    // Elige una opción del menu gestionar palabras
    public void ManageWords() {
        int manageOption = 0;
        while (manageOption != 5) {
            ShowManageOptions();
            manageOption = ChooseManageOptions();
            switch (manageOption) {
                case 1:
                    AddWord();
                    break;

                case 2:
                    ListWord();
                    break;

                case 3:
                    SearchWord();
                    break;

                case 4:
                    RemoveWord();
                    break;

                default:
                    manageOption = 5;
                    System.out.println("Gestión finalizada");
                    break;
            }
        }
    }

    // Inicia el juego
    public void PlayGame() {
    }

    // Selecciona una opción del menu principal y la ejecuta
    public void Options() {
        int option = 0;
        while (option != 3) {
            ShowOptions();
            option = ChooseOptions();
            switch (option) {
                case 1:
                    ManageWords();
                    break;
                case 2:
                    PlayGame();
                    break;

                default:
                    System.out.println("Ha elegido salir, que tenga un buen día.");
                    break;
            }
        }
    }

    // Metodo constructor
    public ElAhorcado() {
    }

    public static void main(String[] args) {
        ElAhorcado Menu = new ElAhorcado();
        Menu.Options();

    }
}