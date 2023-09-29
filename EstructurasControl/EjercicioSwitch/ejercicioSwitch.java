package EstructurasControl.EjercicioSwitch;

import java.util.Scanner;

public class ejercicioSwitch {

    public static void main(String[] args) {

        int dia;
        Scanner teclado = new Scanner(System.in);

        System.out.println("DAme nº de dia: ");
        dia = teclado.nextInt();

        teclado.close();

        switch (dia) {

            case 1:

                System.out.println("Lunes");

                break;

            case 2:

                System.out.println("Martes");

                break;

            case 3:

                System.out.println("Miércoles");

                break;

            case 4:

                System.out.println("Jueves");

                break;

            case 5:

                System.out.println("Viernes");

                break;

            case 6:

                System.out.println("Sábado");

                break;

            case 7:

                System.out.println("Domingo");

                break;

            default:

                System.out.println("Valor no válido");

                break;
        }

    }
}
