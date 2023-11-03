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
                System.out.println("Introduzca minimo");
                int min = teclado.nextInt();
                System.out.println("Introduzca máximo");
                int max = teclado.nextInt();
                int aceptado = menu.Aceptado(min, max);
                System.out.println(aceptado);
                break;

            case 4:
                System.out.println("Introduzca el primer número");
                int n1m = teclado.nextInt();
                System.out.println("Introduzca el segundo número");
                int n2m = teclado.nextInt();
                System.out.println("Introduzca el tercer número");
                int n3m = teclado.nextInt();
                System.out.println("El menor de ");
                System.out.print(n1m + ", " + n2m + ", " + n3m + " es  ");
                System.out.print(menu.elMenor(n1m, n2m, n3m) + " ");

                break;

            case 5:
                System.out.println("Introduzca número de filas");
                int filas = teclado.nextInt();
                menu.TrianguloRectangulo(filas);
                break;

            case 6:

                System.out.println("Introduzca primer número");
                int n1M = teclado.nextInt();
                System.out.println("Introduzca segundo número");
                int n2M = teclado.nextInt();
                System.out.println("Introduzca tercer número");
                int n3M = teclado.nextInt();

                menu.elMayor(n1M, n2M, n3M);

                break;

            case 7:
                System.out.println("Introduzca número de filas");
                int filasP = teclado.nextInt();
                menu.Piramide(filasP);
                break;

            case 8:
                System.out.println("Introduzca número");
                int ntabla = teclado.nextInt();
                menu.TablaMult(ntabla);
                break;

            case 9:
                System.out.println("Introduzca la primera nota");
                double nota1 = teclado.nextDouble();
                System.out.println("Introduzca la segunda nota");
                double nota2 = teclado.nextDouble();
                System.out.println("Introduzca la terecera nota");
                double nota3 = teclado.nextDouble();
                System.out.println(menu.NotaMedia(nota1, nota2, nota3));

                break;

            case 10:
                System.out.println("Introduzca número");
                int numSumatorio = teclado.nextInt();
                menu.Sumatorio(numSumatorio);
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
