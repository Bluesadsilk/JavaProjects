/*
*
* 
*
* Creada el 17 nov 2023, 16:07:07
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 17 nov 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 17 nov 2023
*/
package Metodos_Strings.Ej1;

import java.util.Scanner;

public class NombreApellido {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su nombre");
        String nombre = teclado.next();

        System.out.println("Introduzca primer apellido");
        String apellido1 = teclado.next();

        System.out.println("Introduzca segundo apellido");
        String apellido2 = teclado.next();
        teclado.close();

        String NombreCompleto = nombre + " " + apellido1 + " " + apellido2;

        System.out.println(NombreCompleto);
        char PrimChar = NombreCompleto.charAt(0);
        char SecChar = NombreCompleto.charAt(1);

        if (NombreCompleto.length() > 2) {
            System.out.println(PrimChar + SecChar);

        }

    }

}
