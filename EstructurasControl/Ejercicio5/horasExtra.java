package EstructurasControl.Ejercicio5;

import java.util.Scanner;

public class horasExtra {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de horas extra");
        double nHoras = teclado.nextInt();
        System.out.println("Introduce el precio base de las horas");
        double pHoras = teclado.nextDouble();
        teclado.close();

        if (nHoras <= 8) {

            nHoras = nHoras * (pHoras * 2);
        }

        else {
            nHoras = ((8 * pHoras) * 2) + (nHoras - 8) * (pHoras * 3);
        }

        double nomina = nHoras;

        System.out.println("La nómina extra del trabajador será de: " + nomina + "$");

    }

}
