package EstructurasControl3.Ejercicio10;

import java.util.Scanner;

public class productoSuma {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("");

        System.out.println("Introduzca el primer número para su multiplicación");
        int n1 = teclado.nextInt();
        System.out.println("Introduzca el segundo número para su multiplicación");
        int n2 = teclado.nextInt();
        teclado.close();

        while (n1 < 0) {
            System.out.println("El primer número no es válido, introduzca otro.");
            n1 = teclado.nextInt();

        }

        while (n2 < 0) {
            System.out.println("El segundo número no es válido, introduzca otro.");
            n2 = teclado.nextInt();

        }

        int resultado = n1;
        int contador = 1;

        while (contador < n2) {

            resultado = resultado + n1;
            contador++;

        }

        System.out.println("El resultado es = " + resultado);

    }
}
