package EstructurasControl2.Ejercicio3;

import java.util.Scanner;

public class sueldoNomina {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su nómina para conocer su aumento.");
        int nomina = teclado.nextInt();
        teclado.close();

        int porcentaje;

        if (nomina <= 1 && nomina <= 6000) {

            int porcentaje = 20;

        }

        if (nomina <= 6000 && nomina <= 7900) {

            int porcentaje = 10;

        }

        if (nomina <= 7900 && nomina <= ) {

            int porcentaje = 5;

        }

        if (nomina <= 12000 && nomina <= 6000) {

            int porcentaje = 0;

        }

        System.out
                .println("Tu sueldo ha sido incrementado en un " + porcentaje + "%, tu nómina actual es de: " + nomina);
    }

}
