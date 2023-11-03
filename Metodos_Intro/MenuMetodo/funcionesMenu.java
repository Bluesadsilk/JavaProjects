package Metodos_Intro.MenuMetodo;

import java.util.Scanner;

public class funcionesMenu {

    Scanner teclado = new Scanner(System.in);

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

        int operador = numSum;
        for (int i = 1; i < numSum; i++) {
            System.out.print(operador + " + ");
            numSum = numSum + operador;
            operador--;

        }
        System.out.println(" = " + numSum);

    }
}
