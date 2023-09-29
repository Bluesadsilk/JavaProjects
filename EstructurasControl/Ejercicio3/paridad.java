package EstructurasControl.Ejercicio3;

import java.util.Scanner;

public class paridad {

    public static void main(String[] args) {

        int numIntr;
        
        Scanner teclado = new Scanner(System.in)

        System.out.println("Introduzca un número para saber su paridad");
        numIntr = teclado.nextInt();

        if (numIntr == 0) {

            System.out.println("El número no posee el valor paridad");
            
        }

        if (numIntr%2 = 0) {

            System.out.println("El número introducido es par");

            else {

                System.out.println("El número introducido es inpar");
            }
            
        }

    }

}
