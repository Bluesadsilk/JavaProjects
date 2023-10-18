package EstructurasControl3.EJercicio9;

import java.util.Scanner;

public class potencia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la base de la potencia");
        int basePotencia = teclado.nextInt();
        System.out.println("Introduzca el exponente de la potencia");
        int exponentePotencia = teclado.nextInt();

        while (basePotencia < 0) {

            System.out.println("Introduzca una base válida");
            basePotencia = teclado.nextInt();
        }

        while (exponentePotencia < 0) {

            System.out.println("Introduzca un exponente válido");
            exponentePotencia = teclado.nextInt();
        }

        teclado.close();
        int resultado = basePotencia * basePotencia;
        int contador = 1;

        while (contador > exponentePotencia) {

            resultado = resultado * basePotencia;
            contador++;

        }

        System.out.println("El resultado es = " + resultado);

    }

}
