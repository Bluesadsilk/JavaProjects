package Metodos_Intro.MenuMetodo;

import java.util.Scanner;

public class funcionesMenu {
    Scanner teclado = new Scanner(System.in);

    public void menu() {

        int option = 1;
        while (option != 12) {

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

            option = teclado.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Introduzca número");
                    Cuadrado(teclado.nextInt());

                    break;

                case 2:
                    System.out.println("Introduzca número");
                    int num = teclado.nextInt();
                    System.out.println("El número de digitos de " + num + " es igual a " + Digitos(num));

                    break;

                case 3:
                    System.out.println("Introduzca minimo");
                    int min = teclado.nextInt();
                    System.out.println("Introduzca máximo");
                    int max = teclado.nextInt();
                    int aceptado = Aceptado(min, max);
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
                    System.out.print(elMenor(n1m, n2m, n3m) + " ");

                    break;

                case 5:
                    System.out.println("Introduzca número de filas");
                    int filas = teclado.nextInt();
                    TrianguloRectangulo(filas);
                    break;

                case 6:

                    System.out.println("Introduzca primer número");
                    int n1M = teclado.nextInt();
                    System.out.println("Introduzca segundo número");
                    int n2M = teclado.nextInt();
                    System.out.println("Introduzca tercer número");
                    int n3M = teclado.nextInt();

                    elMayor(n1M, n2M, n3M);

                    break;

                case 7:
                    System.out.println("Introduzca número de filas");
                    int filasP = teclado.nextInt();
                    Piramide(filasP);
                    break;

                case 8:
                    System.out.println("Introduzca número");
                    int ntabla = teclado.nextInt();
                    TablaMult(ntabla);
                    break;

                case 9:
                    System.out.println("Introduzca la primera nota");
                    double nota1 = teclado.nextDouble();
                    System.out.println("Introduzca la segunda nota");
                    double nota2 = teclado.nextDouble();
                    System.out.println("Introduzca la terecera nota");
                    double nota3 = teclado.nextDouble();
                    System.out.println(NotaMedia(nota1, nota2, nota3));

                    break;

                case 10:
                    System.out.println("Introduzca número");
                    int numSumatorio = teclado.nextInt();
                    Sumatorio(numSumatorio);
                    break;

                case 11:
                    System.out.println("Introduzca número");
                    int nAnchura = teclado.nextInt();
                    Rombo(nAnchura);
                    break;

                case 12:
                    break;

                default:
                    break;
            }
        }
    }

    public void Cuadrado(int lado) {

        for (int i = 0; i < lado; i++) {

            for (int j = 0; j < lado; j++) {

                System.out.print("*");

            }

            System.out.println("");

        }

    }

    public int Digitos(int numeroDigitos) {

        int contador = 1;

        while (true) {

            numeroDigitos = numeroDigitos / 10;
            contador++;
            if (numeroDigitos < 10) {
                break;
            }

        }

        int digitos = contador;
        return digitos;

    }

    public int Aceptado(int min, int max) {

        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("Introduzca un número");
            int nIntroducido = teclado.nextInt();
            if (nIntroducido < min || nIntroducido > max) {

            } else {

                teclado.close();
                return nIntroducido;
            }
        }

    }

    public int elMenor(int n1, int n2, int n3) {

        int elMenor = Math.min(Math.min(n1, n2), n3);
        return elMenor;

    }

    public void TrianguloRectangulo(int filas) {
        for (int i = 1; i <= filas; i++) {
            System.out.println("*");
            for (int j = 0; j < i; j++) {
                System.out.print("**");
            }

        }

    }

    public void elMayor(int n1, int n2, int n3) {
        int elmayor = Math.max(Math.max(n1, n2), n3);
        System.out.println("El mayor de " + n1 + ", " + n2 + ", " + n3 + " es " + elmayor);
    }

    public void Piramide(int filas) {

        int asteriscos = 1;
        int espacios = filas;

        for (int i = 0; i <= filas; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");

            }
            System.out.println("");
            asteriscos = asteriscos + 2;
            espacios--;

        }

    }

    public void TablaMult(int nTabla) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(nTabla + " * " + i + " = " + (nTabla * i));

        }
    }

    public double NotaMedia(double nota1, double nota2, double nota3) {

        double notaMedia = (nota1 + nota2 + nota3) / 3;
        return notaMedia;
    }

    public void Sumatorio(int numSum) {

        int operador = numSum - 1;
        System.out.print("El sumatorio de " + numSum + " es : " + numSum);
        for (int i = 2; i <= numSum; i++) {
            System.out.print(" + " + operador);
            operador--;

        }
        System.out.println(" = " + numSum);

    }

    public void Rombo(int nAnchura) {

        if (nAnchura % 2 == 0) {
            System.out.println("Error");
        }

        else {

            int nAsteriscos = 1;
            int nEspacios = nAnchura;
            while (nAsteriscos <= nAnchura) {

                for (int j = 0; j < nEspacios; j++) {
                    System.out.print(" ");
                }
                nEspacios--;
                for (int j = 1; j <= nAsteriscos; j++) {

                    System.out.print("*");

                }
                nAsteriscos = nAsteriscos + 2;
                System.out.println();

            }

            nAsteriscos = nAsteriscos - 2;
            nEspacios++;

            while (nAnchura >= nEspacios) {
                nAsteriscos = nAsteriscos - 2;
                nEspacios++;

                for (int i = 0; i < nEspacios; i++) {
                    System.out.print(" ");
                }

                for (int i = 0; i < nAsteriscos; i++) {
                    System.out.print("*");
                }

                System.out.println();

            }
        }
    }
}
