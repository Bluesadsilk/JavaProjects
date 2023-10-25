package EstructurasRepetitivas.Ejercicio5;

import java.util.Scanner;

public class devolver {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números que desea que se generen");
        int cant = teclado.nextInt();
        teclado.close();

        for (int i = 1; i <= cant; i++) {

            int imprimible = (int) ((Math.random() * Math.random()) * 10000);
            while (imprimible > 0) {

                if (imprimible % 10 == 0) {
                    System.out.println(imprimible);
                    break;
                }
                imprimible = imprimible / 10;

            }

        }

    }

}
