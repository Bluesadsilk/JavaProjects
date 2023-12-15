/*
*
* 
*
* Creada el 14 dic 2023, 17:29:07
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 14 dic 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 14 dic 2023
*/
package MatricesBidimensionales.Ejemplo;

import java.util.Scanner;

public class ejemplo {

    Scanner teclado = new Scanner(System.in);

    public int[][] GeneraMatriz() {
        int min = 1;
        int max = 10;
        int rango = max - min + 1;
        int[][] tablaAlumnosNotas = new int[45][3];

        for (int f = 0; f < tablaAlumnosNotas.length; f++) {
            for (int c = 0; c < tablaAlumnosNotas[f].length; c++) {
                tablaAlumnosNotas[f][c] = (int) (Math.random() * rango + min);

            }

        }
        return tablaAlumnosNotas;
    }

    // Calcula si el alumno ha aprobado todas las asignaturas.
    public boolean AlumnPassed(int[][] matriz, int idAlumno) {
        boolean passed = true;
        int media = 0;
        for (int i = 0; i < matriz[idAlumno].length; i++) {
            media = media + matriz[idAlumno][i];
            if (matriz[idAlumno][i] < 5) {
                passed = false;
            }
        }
        return passed;
    }

    // Calcula la nota media de un alumno
    public int NotaMedia(int[][] matriz, int idAlumno) {
        int media = 0;
        for (int i = 0; i < matriz[idAlumno].length; i++) {
            media = media + matriz[idAlumno][i];
        }

        media = media / matriz[0].length;
        return media;
    }

    // Demanda la elección de un Alumno y la valida
    public int ChooseAlumn() {

        System.out.println("Escoja un alumno, existen 45 alumnos numerados del 1 al 45 incluidos");
        int idAlumno = teclado.nextInt();
        while (idAlumno >= 46 || idAlumno <= 0) {
            System.out.println("Por favor introduzca una opción válida");
            idAlumno = teclado.nextInt();
        }

        return idAlumno - 1;

    }

    // Pide la elección de un módulo y valida la opción
    public int ChooseModule() {
        int modulo;
        System.out.println("Escoja un módulo para operar");
        System.out.println("1. Programación");
        System.out.println("2. Entornos de Desarrollo");
        System.out.println("3. Bases de Datos");

        int moduleOption = teclado.nextInt();
        while (moduleOption <= 0 || moduleOption >= 4) {
            System.out.println("Por favor introduzca una opción válida");
            moduleOption = teclado.nextInt();
        }

        switch (moduleOption) {
            case 1:
                modulo = 0;
                break;

            case 2:
                modulo = 1;
                break;

            case 3:
                modulo = 2;
                break;
            default:
                modulo = 0;
                break;

        }
        return modulo;
    }

    // Calcula la nota máxima del módulo que se le ordene
    public float MaxGrade(int moduleChoosed, int[][] tablaAlumnosNotas) {
        float maxGrade = 0;
        for (int i = 0; i < tablaAlumnosNotas.length; i++) {

            maxGrade = Math.max(maxGrade, tablaAlumnosNotas[i][moduleChoosed]);

        }
        return maxGrade;
    }

    // Calcula la media del módulo seleccionado.
    public int MediumModule(int[][] matriz, int module) {
        int medium = 0;
        for (int i = 0; i < matriz.length; i++) {
            medium += matriz[i][module];

        }
        medium /= matriz.length;
        return medium;
    }

    // Calcula los que han pasado la media y los muestra uno por uno, acaba
    // devolviendo el contador de los que la han pasado la media.
    public int MediumModulePassed(int[][] matriz, int ChoosedModule) {
        int media = MediumModule(matriz, ChoosedModule);
        System.out.println("La nota media del modulo es = " + media);
        int passCounter = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][ChoosedModule] >= media) {
                System.out.println("El alumno " + i + " ha pasado la media con un " + matriz[i][ChoosedModule]);
                passCounter++;
            }

        }
        return passCounter;

    }

    public void ShowMenuOptions() {
        System.out.println();
        System.out.println();
        System.out.println("1. Mostrar la nota media de cada alumno");
        System.out.println("2. Mostrar la nota media de cada módulo");
        System.out.println("3. Mostrar la nota máxima de cada módulo");
        System.out.println("4. Mostrar cuantos alumnos sobrepasan la nota media de un módulo");
        System.out.println("5. Mostrar las opciones disponibles");
        System.out.println("6. Salir de la aplicación");

    }

    public boolean SelectMenuOptions(int[][] tablaAlumnosNotas, boolean active) {
        ShowMenuOptions();
        int menuOption = teclado.nextInt();
        while (menuOption >= 7 && menuOption <= 0) {
            System.out.println("Por favor introduzca una opción válida");
            menuOption = teclado.nextInt();
        }

        switch (menuOption) {
            case 1:
                int notaMedia = NotaMedia(tablaAlumnosNotas, ChooseAlumn());
                if (AlumnPassed(tablaAlumnosNotas, menuOption) == true) {
                    System.out.println("La nota media del alumno elegido es = " + notaMedia);
                } else {
                    System.out.println("No cumple con los requisitos");
                }
                break;

            case 2:
                int mediaModulo = MediumModule(tablaAlumnosNotas, ChooseModule());
                System.out.println("La nota media del modulo es = " + mediaModulo);

                break;

            case 3:
                float maxGrade = MaxGrade(ChooseModule(), tablaAlumnosNotas);
                System.out.println("La nota máxima del modulo seleccionado es = " + maxGrade);

                break;

            case 4:
                int passed = MediumModulePassed(tablaAlumnosNotas, ChooseModule());

                System.out.println("El total de alumnos aprobados es = " + passed);

                break;

            case 5:
                ShowMenuOptions();
                break;

            case 6:
                active = false;
                return active;
            default:
                System.out.println("Opción no válida, por favor introduzca una opción válida");

                break;

        }
        return active;

    }

    public ejemplo() {
    }

    public static void main(String[] args) {
        boolean appActive = true;
        // Llamar al constructor
        ejemplo Menu = new ejemplo();

        // Crear y llenar la tabla con una función que devuelva la matriz
        int[][] tablaAlumnosNotas = Menu.GeneraMatriz();

        // Menu para elegir que desea mostrar, guardado en un bucle del que se sale
        // cuando se selecciona la opción salir
        while (appActive == true) {
            appActive = Menu.SelectMenuOptions(tablaAlumnosNotas, appActive);
        }
    }

    // Calcular la nota máxima del módulo especificado
    // float maxGrade = Menu.MaxGrade(Menu.ChooseModule(), tablaAlumnosNotas);

    // Extraer la nota media por módulo y calcular cuantos alumnos la sobrepasan

    // Función que extraiga la nota media del módulo

}
