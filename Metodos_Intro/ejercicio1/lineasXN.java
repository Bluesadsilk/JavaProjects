/*
*
* 
*
* Creada el 07 nov 2023, 16:36:00
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 07 nov 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 07 nov 2023
*/
package Metodos_Intro.ejercicio1;

import java.util.Scanner;

public class lineasXN {
    int columnas;
    int filas;

    public static void main(String[] args) {
        new lineasXN();

    }

    public lineasXN() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca filas");
        filas = teclado.nextInt();
        System.out.println("Introduzca columnas");
        columnas = teclado.nextInt();
        teclado.close();
        escribir_linea();
    }

    public void escribir_linea() {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}