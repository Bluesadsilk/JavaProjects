package EstructurasRepetitivas.Ejercicio6;

import java.util.Scanner;

public class eliminar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num = teclado.nextInt();
        teclado.close();

        if (num <= 99) {

            System.out.println("0");

        }

        else {

            num = num / 10;
            int operador = 1;
            while (num > 9) {
                operador++;

            }

            System.out.println(resultado);

        }

    }
}
