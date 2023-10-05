package EstructurasControl2.Ejercicio4;

import java.util.Scanner;

public class enterosOrdenados {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tres enteros distintos:");

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        teclado.close();

        // Encontrar el mayor
        int mayor = Math.max(Math.max(num1, num2), num3);

        // Encontrar el menor
        int menor = Math.min(Math.min(num1, num2), num3);

        // Calcular el número medio
        int medio = num1 + num2 + num3 - mayor - menor;

        // Mostrar los números ordenados de mayor a menor
        System.out.println("Números ordenados de mayor a menor: " + mayor + ", " + medio + ", " + menor);

    }

}
