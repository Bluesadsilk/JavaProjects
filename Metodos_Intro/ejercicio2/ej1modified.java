/*
*
* 
*
* Creada el 07 nov 2023, 16:36:27
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 07 nov 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 07 nov 2023
*/
package Metodos_Intro.ejercicio2;

import java.util.Scanner;

public class ej1modified {

    int columnas;

    public static void main(String[] args) {
        new ej1modified();

    }

    public ej1modified() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca número de asteriscos");
        columnas = teclado.nextInt();
        teclado.close();
        escribir_linea();
    }

    public void escribir_linea() {

        while (columnas > 1) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("*");
            }
            System.out.println();
            columnas--;
        }

    }

}
