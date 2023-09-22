package Proyecto_3;

import java.util.Scanner;

/**
 * proyecto3
 */
public class proyecto3 {

    public static void main(String[] args) {

        System.out.println("Introduce tu nombre completo");

        Scanner tecladoNombre = new Scanner(System.in);
        String nombreCompleto = tecladoNombre.nextLine();

        System.out.println("Introduce tu fecha de nacimiento");

        Scanner tecladoFecha = new Scanner(System.in);
        String fechaNacimiento = tecladoFecha.nextLine();
        tecladoFecha.close();
        tecladoNombre.close();

        System.out.println("Bienvenido " + nombreCompleto + " nacido en " + fechaNacimiento);

    }
}