package EstructurasControl3.Ejercicio3;

import java.util.Scanner;

public class numcomp {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;
        int resultado = 0;

        System.out.println(
                "Introduce un número para calcular la suma entre los números que existen del rango de 1 hasta el introducido");

        int n2 = teclado.nextInt();
        teclado.close();

        if (n2 < 1) {

            System.out.println("El número introducido no es válido");

        } else {
            while (contador <= n2) {

                resultado = resultado + contador;
                contador++;

            }
            System.out.println("La suma total es = " + resultado);

        }
    }
}
