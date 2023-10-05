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

        System.out.println("Para máximo introduzca 1 , para minimo introduzca 2");
        int election = teclado.nextInt();

        teclado.close();

        int maximo1;
        int maximo2;
        int minimo1;
        int minimo2;

        switch (election) {
            case 1:

                maximo1 = Math.max(n1, n2);
                maximo2 = Math.max(maximo1, n3);
                System.out.println("El máximo es = " + maximo2);

                break;

            case 2:

                minimo1 = Math.min(n1, n2);
                minimo2 = Math.min(minimo1, n3);

                System.out.println("El mínimo es = " + minimo2);

                break;

            default:

                System.out.println("Error");

                break;
        }

    }

}
