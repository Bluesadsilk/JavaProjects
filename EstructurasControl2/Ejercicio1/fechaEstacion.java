package EstructurasControl2.Ejercicio1;

import java.util.Scanner;

public class fechaEstacion {

    public static void main(String[] args) {
        /*
         * Creamos un input y le pedimos al usuario que introduzca la fecha mediante dos
         * variables, mes y dia.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número del dia");
        int dia = teclado.nextInt();
        System.out.println("Introduzca el número del mes");
        int mes = teclado.nextShort();
        teclado.close();

        boolean diasMes;

        diasMes = ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                && (dia <= 31 && dia >= 1))
                || ((mes == 2 && dia <= 28 && dia >= 1)
                        || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 30));
        /* Usamos un switch para que calcule los dias del mes */
        if (diasMes == false) {

            System.out.println("Entrada incorrecta");

        }

        else {

            switch (mes) {
                case 1:

                    System.out.println("Es Invierno");

                    break;

                case 2:

                    System.out.println("Es Invierno");

                    break;

                case 3:

                    if (dia < 20) {
                        System.out.println("Es Invierno");
                    } else {
                        System.out.println("Es Primavera");
                    }

                    break;

                case 4:

                    System.out.println("Es Primavera");

                    break;

                case 5:

                    System.out.println("Es Primavera");
                    break;

                case 6:

                    if (dia < 21) {

                        System.out.println("Es Primavera");

                    } else {

                        System.out.println("Es Verano");

                    }

                    break;

                case 7:

                    System.out.println("Es Verano");

                    break;

                case 8:

                    System.out.println("Es Verano");

                    break;

                case 9:

                    if (dia < 23) {

                        System.out.println("Es Verano");

                    } else {

                        System.out.println("Es Otoño");

                    }

                    break;

                case 10:

                    System.out.println("Es Otoño");

                    break;

                case 11:
                    System.out.println("Es Otoño");
                    break;

                case 12:

                    if (dia < 21) {

                        System.out.println("Es Otoño");
                    } else {

                        System.out.println("Es Invierno");

                    }

                    break;

                default:

                    System.out.println("Error");

                    break;
            }

        }

    }

}
