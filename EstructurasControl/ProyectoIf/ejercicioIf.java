package EstructurasControl.ProyectoIf;

import java.util.Scanner;

/**
 * if
 */
public class ejercicioIf {

    public static void main(String[] args) {
        int n1, n2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame n1");
        n1 = teclado.nextInt();
        System.out.println("Dame n2");
        n2 = teclado.nextInt();
        teclado.close();

        if (n1 > n2) {

            System.out.println(n1 + "es el mayor");
        }

        else {
            if (n1 == n2) {

                System.out.println("son iguales");

            } else {

                System.out.println(n1 + "es el mas pequeño");
            }
        }

    }

}