/*
*
* 
*
* Creada el 20 dic 2023, 16:19:07
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 20 dic 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 20 dic 2023
*/
package MatricesBidimensionales.Talleres;

import java.util.Arrays;
import java.util.Scanner;

public class Talleres {
    Scanner teclado = new Scanner(System.in);

    int[][] WorkShopTable = GenTable();
    float[] WorkShopPrices = GenPrices();
    String[] WorkShopNames = GenWorkShopNames();
    String[] PiecesNames = GenPricesNames();

    // Genera la tabla de stock
    public int[][] GenTable() {
        int[][] table = new int[3][8];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (int) (Math.random() * 100 + 1);

            }

        }
        return table;
    }

    // Genera la tabla de precios
    public float[] GenPrices() {
        float[] prices = new float[8];

        for (int i = 0; i < prices.length; i++) {
            prices[i] = (float) Math.round((Math.random() * 99 + 10) * 100) / 100;

        }
        return prices;
    }

    public String[] GenWorkShopNames() {
        String[] workshopNames = { "M.Jesús San", "Jaime Ferrer", "Manuel e Hijos" };
        return workshopNames;
    }

    public String[] GenPricesNames() {
        String[] piecesNames = { "M.Jesús San", "Jaime Ferrer", "Manuel e Hijos" };
        return piecesNames;
    }

    // Muestra el valor general del stock
    public void ShowGenMoney() {

        System.out.println("");
        System.out.println();

        System.out.println("Ha elegido visualizar el valor del stock general");

        float genStockPrice = 0;

        for (int i = 0; i < WorkShopTable.length; i++) {
            for (int j = 0; j < WorkShopTable[0].length; j++) {

                genStockPrice += WorkShopTable[i][j] * WorkShopPrices[j];

            }

        }

        System.out.println("El valor del stock general es: " + genStockPrice + " euros.");
        System.out.println("");
        System.out.println("");
    }

    // Muestra el precio del stock de un taller
    public void ShowWorkshopMoney() {

        System.out.println("Ha elegido visualizar el precio del stock de un taller concreto");

        System.out.println("Por favor eliga que taller desea visualizar");
        for (int i = 0; i < WorkShopNames.length; i++) {
            System.out.println(i + ". " + WorkShopNames[i]);

        }
        int workshopChoosed = teclado.nextInt();

        while (workshopChoosed >= 4 && workshopChoosed <= 0) {
            System.out.println("Opción no válida, por favor introduzca una opción válida");
            workshopChoosed = teclado.nextInt();
        }

        float workshopStockPrice = 0;

        for (int j = 0; j < WorkShopTable[0].length; j++) {

            workshopStockPrice += WorkShopTable[workshopChoosed][j] * WorkShopPrices[j];
        }

        System.out.println(
                "El valor de todas las piezas del almacen " + WorkShopNames[workshopChoosed] + " es : "
                        + workshopStockPrice + " euros");
        System.out.println("");
        System.out.println("");
    }

    public void ShowPieceMoney() {
    }

    public void ShowOptions() {
        System.out.println("Menu de opciones: ");
        System.out.println("1. Consultar el valor total general.");
        System.out.println("2. Consultar el valor de todas las piezas por almacen.");
        System.out.println("3. Consultar el valor de cada pieza por almacén. ");
        System.out.println("4. Salir");

        System.out.println("");
        System.out.println("");
    }

    public void Options() {
        int option = 0;
        while (option != 4) {
            ShowOptions();
            option = teclado.nextInt();

            switch (option) {
                case 1:
                    ShowGenMoney();

                    break;

                case 2:
                    ShowWorkshopMoney();
                    break;

                case 3:
                    ShowPieceMoney();
                    break;

                case 4:
                    System.out.println("La ejecución ha terminado");
                    break;

                default:
                    System.out.println("Opció no válida");
                    break;
            }
        }
    }

    public Talleres() {

    }

    public static void main(String[] args) {
        Talleres Menu = new Talleres();

        System.out.println(Arrays.toString(Menu.WorkShopPrices));

        for (int i = 0; i < Menu.WorkShopTable.length; i++) {
            for (int j = 0; j < Menu.WorkShopTable[i].length; j++) {
                System.out.print(" (" + Menu.WorkShopTable[i][j] + ") ");
            }
            System.out.println();
        }

        Menu.Options();

    }

}
