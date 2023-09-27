package EjerciciosDatos4.Calculadora_Segundos;

import java.util.Scanner;

public class calculadoraSegundos {

    public static void main(String[] args) {

        Scanner tsegundos = new Scanner(System.in);
        long dias, horas, minutos, segundos, srestantes;

        System.out.println("Introduzca un numero indeterminado de segundos");
        segundos = tsegundos.nextLong();

        dias = segundos / 86400;
        srestantes = segundos % 86400;

        horas = srestantes / 3600;
        srestantes = srestantes % 3600;

        minutos = srestantes / 60;
        srestantes = srestantes % 60;

        System.out.println("En total son " + dias + "dias, " + horas + "horas, " + minutos + "minutos y " + srestantes
                + "segundos.");
        tsegundos.close();

    }

}
