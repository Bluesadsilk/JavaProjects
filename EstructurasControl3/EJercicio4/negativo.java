package EstructurasControl3.EJercicio4;

import java.util.Scanner;

public class negativo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int suma = 0;

        System.out.println(
                "Introduzca un número para proceder a la suma, ha de ser con valor positivo, si introduce uno con valor negativo el programa acabará");

        while (true) {

            int numInsertado = teclado.nextInt();

            if (numInsertado >= 0) {

                suma = suma + numInsertado;

                System.out.println("Introduzca el siguiente número");

            } else {

                break;
            }

        }

        teclado.close();
        System.out.println("La suma de los números introducidos es = " + suma);

    }

}
