package Metodos_Intro.MenuMetodo;

import java.util.Scanner;

public class menuMetodo {

    public static void main(String[] args) {
        funcionesMenu menu = new funcionesMenu();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un núero para acceder al parámetro del menú");
        System.out.println("1. Dibujar Cuadrado");
        System.out.println("2. Calcular número digitos");
        System.out.println("3. Recoger opción valida en un rango de valores");
        System.out.println("4. Calcular el menor de 3 números");
        System.out.println("5. Dibujar triángulo rectángulo de un número de filas");
        System.out.println("6. Calcular el mayor de 3 números");
        System.out.println("7. Dibujar trinagulo de un número de filas ");
        System.out.println("8. Mostrar tabla de multiplicar");
        System.out.println("9. Calcular media de 3 notas");
        System.out.println("10. Calcular el sumatorio de un número");
        System.out.println("11. Dibujar rombo");
        System.out.println("12. Salir");

        int option = teclado.nextInt();

        switch (option) {

            case 1:
                System.out.println("Introduzca número");
                menu.Cuadrado(teclado.nextInt());

                break;

            case 2:
                System.out.println("Introduzca número");
                int num = teclado.nextInt();
                System.out.println("El número de digitos de " + num + " es igual a " + menu.Digitos(num));

                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                break;

            case 7:
                break;

            case 8:
                break;

            case 9:
                break;

            case 10:
                break;

            case 11:
                break;

            case 12:
                break;

            default:
                break;
        }

        teclado.close();
    }

}
