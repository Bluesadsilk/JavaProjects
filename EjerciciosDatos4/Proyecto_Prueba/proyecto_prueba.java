package EjerciciosDatos4.Proyecto_Prueba;

import java.util.Scanner;

public class proyecto_prueba {

    public static void main(String[] args) {

        // Añadiendo variables/atributos y objeto scanner(teclado)

        double ex1, ex2, notaExa, notaTot;
        int numPrac;
        Scanner teclado = new Scanner(System.in);

        // Introducción de las variables mediante objeto scanner (teclado)

        System.out.println("Dame la nota del primer examen:");
        ex1 = teclado.nextDouble();
        System.out.println("Dame la nota del segundo examen:");
        ex2 = teclado.nextDouble();
        System.out.println("Dame el número de practicas totales");
        numPrac = teclado.nextInt();

        // Cierre del objeto para evitar problemas

        teclado.close();

        // Método de funcion del calculo de la media final

        notaExa = (ex1 + ex2) / 2;
        notaTot = notaExa * 0.8 + numPrac * 0.2;

        // Impresión en la terminal de la media final

        System.out.println("La nota final es:" + notaTot);
    }

}
