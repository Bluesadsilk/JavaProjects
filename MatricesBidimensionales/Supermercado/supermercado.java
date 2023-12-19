/*
*
* 
*
* Creada el 19 dic 2023, 15:21:39
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 19 dic 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 19 dic 2023
*/
package MatricesBidimensionales.Supermercado;

import java.util.Arrays;
import java.util.Scanner;

public class supermercado {

    Scanner teclado = new Scanner(System.in);

    // Guarda la tabla como valor global.
    float[][] tabla = GenerateTable();
    String[] Departamentos = { "Panadería", "Carnicería", "Permufería", "Verdulería", "Charcutería", "Almacén",
            "Ventas" };

    // Procedimiento muestra los departamentos.

    public void ShowDepartamentos() {
        System.out.println("Departamentos");
        System.out.println("1. Panadería");
        System.out.println("2. Carnicería");
        System.out.println("3. Perfumería");
        System.out.println("4. Verdulería");
        System.out.println("5. Charcutería");
        System.out.println("6. Almacén");
        System.out.println("7. Ventas");
        System.out.println("");
    }

    // Genera la tabla y la llena.
    public float[][] GenerateTable() {
        float min = 7.0f;
        float max = 16.0f;
        float rango = max - min + 1.0f;
        float[][] table = new float[7][6];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                table[i][j] = (float) Math.round((Math.random() * rango + min) * 100) / 100;
            }
        }

        return table;

    }

    // Muestra que empleados han fichado antes de la hora tope
    public void ShowBeforeHour() {
        System.out.println("");
        System.out.println("Introduzca una hora tope para conocer los empleados que ficharon a tiempo");
        int hour = teclado.nextInt();

        // Compara la tabla con la hora tope

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[j].length; j++) {
                if (tabla[i][j] < hour) {
                    System.out.println("El empleado " + i + "-" + j + " llegó antes de las " + hour
                            + ", en concreto a las " + tabla[i][j] + ".");
                }
            }
        }
        System.out.println("");
    }

    // Muestra cuantos empleados se encontraban entre las horas dadas
    public void ShowEmpOnWork() {
        int empNumber = 0;
        System.out.println("");

        System.out.println("Introduzca la hora inicial");
        int horaInit = teclado.nextInt();

        System.out.println("Introduzca la hora final");
        int horaFin = teclado.nextInt();

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {

                if (tabla[i][j] > horaFin && tabla[i][j] > horaInit) {
                    empNumber++;
                }

            }
        }
        System.out.println(
                "El número de empleados trabajando entre las " + horaInit + " y " + horaFin + " es = " + empNumber);
        System.out.println("");
    }

    public void ShowEmpOnDep() {
        System.out.println("Introduzca la hora de fichaje");
        int hour = teclado.nextInt();
        int[] empNumber = new int[7];

        for (int i = 0; i < tabla.length; i++) {

            for (int j = 0; j < tabla[i].length; j++) {

                if (hour > tabla[i][j]) {
                    empNumber[i]++;
                }
            }
        }
        for (int i = 0; i < empNumber.length; i++) {
            System.out.println("El número de departamentos en " + Departamentos[i] + " es = " + empNumber[i]);
        }

    }

    public void Options() {
        int option = 0;
        while (option != 5) {
            System.out.println("1. Muestra Departamentos");
            System.out.println("2. Muestra los empleados que han fichado antes de la hora tope");
            System.out.println("3. Muestra los empleados que se encontraban entre dos horas predeterminadas");
            System.out.println("4. Muestra cuantos empleados por departamento se encuentran en una hora");
            System.out.println("5. Salir del programa");

            option = teclado.nextInt();

            switch (option) {
                case 1:
                    ShowDepartamentos();
                    break;

                case 2:
                    ShowBeforeHour();
                    break;

                case 3:
                    ShowEmpOnWork();
                    break;

                case 4:
                    ShowEmpOnDep();
                    break;

                case 5:
                    System.out.println("Adiós");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    public supermercado() {
    }

    public static void main(String[] args) {
        supermercado Menu = new supermercado();
        Menu.Options();

    }

}
