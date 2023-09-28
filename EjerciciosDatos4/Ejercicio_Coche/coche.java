package EjerciciosDatos4.Ejercicio_Coche;

import java.util.Scanner;

public class coche {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca precio por litro de combustible del primer repostaje");

        double prcLtr1 = teclado.nextDouble();

        System.out.println("Introduzca el coste del primer repostaje");

        double prcRep1 = teclado.nextDouble();

        System.out.println("Introduzca el valor del cuentakilómetros actual");

        double cuentaKm1 = teclado.nextDouble();

        System.out.println("Introduzca precio por litro de combustible del segundo repostaje");

        double prcLtr2 = teclado.nextDouble();

        System.out.println("Introduzca el coste del segundo repostaje");

        double prcRep2 = teclado.nextDouble();

        System.out.println("Introduzca el valor del cuentakilómetros actual");

        double cuentaKm2 = teclado.nextDouble();

        double cuentaKm = cuentaKm2 - cuentaKm1;
        double consumoTotal = (prcRep1 / prcLtr1) + (prcRep2 / prcLtr2);
        double consumo100 = (consumoTotal / cuentaKm) * 100;
        double costeKm = (prcRep1 + prcRep2) / cuentaKm;

        teclado.close();

        System.out.println(
                "El consumo cada 100km es de " + consumo100 + "litroscl" + " y el coste por km es de " + costeKm
                        + "euros");

    }

}
