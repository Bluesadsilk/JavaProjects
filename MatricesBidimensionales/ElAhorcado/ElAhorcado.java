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

import java.util.Scanner;

/**
 * ElAhorcado
 */
public class ElAhorcado {
    Scanner teclado = new Scanner(System.in);

    // Genera la lista de palabras vacia
    String[] WordList = new String[5];

    // Imprime el mensaje de titulo
    public void Title() {
        System.out.println(" _                                             \n" + //
                "| |                                            \n" + //
                "| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  \n" + //
                "| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ \n" + //
                "| | | | (_| | | | | (_| | | | | | | (_| | | | |\n" + //
                "|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|\n" + //
                "                    __/ |                      \n" + //
                "                   |___/                   ");
    }

    // Muestra las opciones del menú principal
    public void ShowOptions() {
        Title();
        System.out.println("");
        System.out.println("1. Gestionar palabras");
        System.out.println("2. Jugar");
        System.out.println("3. Salir");
        System.out.println("");
    }

    // Recoge la opción del menu principal elegida
    public int ChooseOptions() {
        System.out.println("Seleccione una opción");
        int option = teclado.nextInt();
        while (option > 3 && option < 1) {
            System.out.println("Opción no válida, por favor introduzca una opción válida");
            option = teclado.nextInt();
            teclado.nextLine();
        }
        return option;
    }

    // Muestra las opciones del menu gestionar palabras
    public void ShowManageOptions() {
        System.out.println("");
        System.out.println("1. Añadir palabra");
        System.out.println("2. Listar palabras");
        System.out.println("3. Buscar palabra");
        System.out.println("4. Eliminar palabra");
        System.out.println("5. Salir");
        System.out.println("");
    }

    // Recoge la opción del menu gestionar palabras escogida
    public int ChooseManageOptions() {
        System.out.println();
        System.out.println("Seleccione una opción");
        int option = teclado.nextInt();
        while (option > 5 && option < 1) {
            System.out.println("Opción no válida, por favor introduzca una opción válida");
            option = teclado.nextInt();
            teclado.nextLine();

        }
        return option;
    }

    // Metodo para válidar la palabra.
    public boolean ValidateWord(String addedWord) {
        boolean validate = true;
        for (int i = 0; i < WordList.length; i++) {
            if (addedWord.equals(WordList[i])) {
                validate = false;
            }
        }
        return validate;
    }

    // Añade una palabra y la guarda dentro del array para emplearla en el juego.
    // posteriormente
    public void AddWord() {
        teclado.nextLine();
        System.out.println("Debe introducir un total de " + WordList.length + " palabras");
        for (int i = 0; i < WordList.length; i++) {
            boolean validate = false;
            if (WordList[i] == null) {

                while (true) {
                    System.out.println("Introduzca la palabra " + i);
                    String tempString = teclado.nextLine().toUpperCase();
                    validate = ValidateWord(tempString);
                    if (validate == true) {
                        WordList[i] = tempString;
                        break;
                    }
                    System.out.println("Palabra no válida");
                }
            }

        }
    }

    // Muestra las palabras guardadas.
    public void ListWord() {
        System.out.println("");
        System.out.println("Las palabras son : ");
        for (int i = 0; i < WordList.length; i++) {
            System.out.println(i + ". " + WordList[i]);
        }

        System.out.println("");

    }

    public void SearchWord() {
        teclado.nextLine();
        System.out.println("Introduce la palabra que desea buscar");
        String lockedWord = teclado.nextLine().toUpperCase();
        int cont = 0;
        for (int i = 0; i < WordList.length; i++) {
            if (lockedWord.equals(WordList[i])) {
                System.out.println("La palabra " + WordList[i] + " se encuentra en la posición " + i);
                cont++;
            }

        }
        if (cont == 0) {
            System.out.println("No se encontró la palabra");
        }

    }

    public void RemoveWord() {
        teclado.nextLine();
        System.out.println("Elija la palabra que desea eliminar");
        int selectedWordIndex = teclado.nextInt();

        // Comprueba si la palabra seleccionada se encuentra dentro del vector
        if (selectedWordIndex >= 0 && selectedWordIndex < WordList.length) {
            // Utiliza System.arraycopy para poder modificar el vector en los parámetros
            // deseados
            System.arraycopy(WordList, selectedWordIndex + 1, WordList, selectedWordIndex,
                    WordList.length - 1 - selectedWordIndex);

            // Guarda el ultimo elemento como nulo
            WordList[WordList.length - 1] = null;

            System.out.println("Palabra eliminada correctamente");
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Elige una opción del menu gestionar palabras
    public void ManageWords() {
        int manageOption = 0;
        while (manageOption != 5) {
            System.out.println();
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
                    System.out.println("");
                    break;
            }
        }
    }

    // Enseña las opciones del menu de juego
    public void ShowGameOptions() {
        System.out.println("");
        System.out.println("1. Introducir letra");
        System.out.println("2. Adivinar la palabra");
        System.out.println("3. Salir del juego");
        System.out.println("");
    }

    public void ShowHangman(int failCounter) {
        System.out.println("");
        switch (failCounter) {
            case 1:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");

                break;

            case 2:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");

                break;

            case 3:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                break;

            case 4:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                break;
            case 5:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    /  ");
                System.out.println(" |                   /      ");
                System.out.println(" |                  /       ");
                break;

            case 6:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / \\");
                System.out.println(" |                   /   \\  ");
                System.out.println(" |                  /     \\ ");
                break;

            default:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                break;
        }
        System.out.println("");
    }

    // Escoge una palabra aleatoria
    public String ChooseWord() {
        int min = 0, max = WordList.length - 1, rango = max - min + 1;
        int choosedWord = (int) (Math.random() * rango + min);
        String playWord = WordList[choosedWord];
        return playWord;
    }

    // Crea un vector de la mimsa cantidad de letras que la palabra
    public char[] Genboard(String playWord) {
        char[] gameBoard = new char[playWord.length()];
        for (int i = 0; i < gameBoard.length; i++) {
            gameBoard[i] = ' ';
        }
        return gameBoard;
    }

    // Muestra el tablero interpretado
    public void ShowBoard(char[] gameBoard) {
        System.out.println("");
        for (int i = 0; i < gameBoard.length; i++) {

            if (gameBoard[i] == ' ') {
                System.out.print("_ ");
            }

            else {
                System.out.print(gameBoard[i] + " ");
            }

        }
        System.out.println("");
    }

    // Introduce una letra y válida si se encuentra otorgando un fallo o
    public boolean ChooseLetter(String playWord, char[] gameBoard) {
        boolean result = false;
        System.out.println("Introduzca una letra");
        char letter = teclado.nextLine().toUpperCase().charAt(0);
        for (int i = 0; i < playWord.length(); i++) {
            if (letter == playWord.charAt(i)) {
                result = true;
                gameBoard[i] = letter;
                System.out.println("Perfecto, ha acertado la letra " + letter);
            }
        }
        return result;

    }

    // Introduce una palabra entera y la válida si es cierta.
    public boolean GuessWord(String playWord) {
        boolean result = false;
        System.out.println("Introduzca la palabra");
        String userWord = teclado.nextLine().toUpperCase();
        if (userWord.equals(playWord)) {
            System.out.println("Ha acertado la palabra");
            result = true;

        }
        return result;
    }

    // Imprime el mensaje de derrota
    public void LostGame(String playWord) {
        System.out.println("");
        System.out.println("Ha sido derrotado, la palabra era " + playWord);
        System.out.println("\n" + //
                "\n" + //
                " ___                                                      ___   ___   ___  \n" + //
                "(   )                                                    (   ) (   ) (   ) \n" + //
                " | |    .--.     .--.       .--.      .--.    ___ .-.     | |   | |   | |  \n" + //
                " | |   /    \\   /    \\    /  _  \\    /    \\  (   )   \\    | |   | |   | |  \n" + //
                " | |  |  .-. ; |  .-. ;  . .' `. ;  |  .-. ;  | ' .-. ;   | |   | |   | |  \n" + //
                " | |  | |  | | | |  | |  | '   | |  |  | | |  |  / (___)  | |   | |   | |  \n" + //
                " | |  | |  | | | |  | |  _\\_`.(___) |  |/  |  | |         | |   | |   | |  \n" + //
                " | |  | |  | | | |  | | (   ). '.   |  ' _.'  | |         | |   | |   | |  \n" + //
                " | |  | '  | | | '  | |  | |  `\\ |  |  .'.-.  | |         |_|   |_|   |_|  \n" + //
                " | |  '  `-' / '  `-' /  ; '._,' '  '  `-' /  | |         .-.   .-.   .-.  \n" + //
                "(___)  `.__.'   `.__.'    '.___.'    `.__.'  (___)       (   ) (   ) (   ) \n" + //
                "                                                          '-'   '-'   '-'  \n" + //
                "                                                                           \n" + //
                "\n" + //
                "");
        System.out.println("");

    }

    // Imprime el mensaje de victoria
    public void WonGame(String playWord) {
        System.out.println("");
        System.out.println("Ha ganado la partida, la palabra era " + playWord);
        System.out.println("\n" + //
                "\n" + //
                "                            ___                                      \n" + //
                "            .-.            (   )                                     \n" + //
                " ___  ___  ( __)   .--.     | |_       .--.    ___ .-.     ___  ___  \n" + //
                "(   )(   ) (''\")  /    \\   (   __)    /    \\  (   )   \\   (   )(   ) \n" + //
                " | |  | |   | |  |  .-. ;   | |      |  .-. ;  | ' .-. ;   | |  | |  \n" + //
                " | |  | |   | |  |  |(___)  | | ___  | |  | |  |  / (___)  | |  | |  \n" + //
                " | |  | |   | |  |  |       | |(   ) | |  | |  | |         | '  | |  \n" + //
                " | |  | |   | |  |  | ___   | | | |  | |  | |  | |         '  `-' |  \n" + //
                " ' '  ; '   | |  |  '(   )  | ' | |  | '  | |  | |          `.__. |  \n" + //
                "  \\ `' /    | |  '  `-' |   ' `-' ;  '  `-' /  | |          ___ | |  \n" + //
                "   '_.'    (___)  `.__,'     `.__.    `.__.'  (___)        (   )' |  \n" + //
                "                                                            ; `-' '  \n" + //
                "                                                             .__.'   \n" + //
                "\n" + //
                "");
        System.out.println("");
        System.out.println();

    }

    // Muestra las opciones del menu de juego

    // Inicia el juego
    public void PlayGame() {
        int failCounter = 0, successCounter = 0, exitDoor = 0;
        boolean wordGuessed = false;
        String playWord = ChooseWord();
        char[] gameBoard = Genboard(playWord);

        while (true) {
            ShowHangman(failCounter);
            ShowBoard(gameBoard);
            ShowGameOptions();
            int gameOption = teclado.nextInt();
            teclado.nextLine();

            switch (gameOption) {
                case 1:
                    if (ChooseLetter(playWord, gameBoard) == true) {
                        successCounter++;
                    }

                    else {
                        failCounter++;
                    }
                    break;

                case 2:

                    if (GuessWord(playWord) == true) {
                        wordGuessed = true;
                    }

                    else {
                        failCounter++;
                    }
                    break;

                case 3:
                    exitDoor = 1;
                    break;
                default:
                    break;
            }

            if (failCounter == 6) {
                LostGame(playWord);
                break;
            }

            if (successCounter == playWord.length() || wordGuessed == true) {
                WonGame(playWord);
                break;
            }

            if (exitDoor == 1) {
                System.out.println("Ha decidido salir");
                break;
            }

        }
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
        Menu.teclado.close();

    }
}