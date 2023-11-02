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

    public void Aceptado() {

    }

}
