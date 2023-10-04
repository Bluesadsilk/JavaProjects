package EstructurasControl2.EJercicio2;

import java.util.Scanner;

public class secnum {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer número");

        int n1 = teclado.nextInt();

        System.out.println("Introduzca el segundo número");

        int n2 = teclado.nextInt();

        System.out.println("Introduzca el tercer número");

        int n3 = teclado.nextInt();

        teclado.close();

        System.out.println("Para máximo introduzca 1 , para minimo introduzca 2");
        int election = teclado.nextInt();

        switch (election) {
            case 1:

                System.out.println("El máximo es = ");

                break;

            case 2:

                System.out.println("El mínimo es = ");

                break;

            default:

                System.out.println("Error");

                break;
        }

    }

}
