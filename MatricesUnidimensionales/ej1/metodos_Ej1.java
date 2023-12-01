/*
*
* 
*
* Creada el 30 nov 2023, 17:30:11
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 30 nov 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 30 nov 2023
*/
package MatricesUnidimensionales.ej1;

import java.util.Scanner;

public class metodos_Ej1 {
    Scanner teclado = new Scanner(System.in);

    public void elUno() {

        System.out.println("Introduzca los valores a los siguientes parámetros del vector");

        int[] vector = new int[15];
        int n;
        for (int i = 0; i < vector.length; i++) {

            System.out.println("Introduzca el valor para la posición: " + i);
            vector[i] = teclado.nextInt();

        }

        System.out.println("Introduzca el rango de números que desee que muestre");

        while (true) {
            n = teclado.nextInt();
            if (n <= vector.length) {
                break;
            }
        }

        int res = 0;

        for (int i = 0; i < n; i++) {

            res += vector[i];

            System.out.println(vector[i]);

        }

        System.out.println("Valor de rango: " + n + " = " + res);
    }

    public void elDos() {

        int[] origen = { 10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32 };
        int contador = 0;

        for (int i = 0; i < origen.length; i++) {

            if (origen[i] % 2 == 0 && origen[i] > 25) {

                contador++;

            }

        }

        int[] destino = new int[contador];
        int contador2 = 0;

        for (int i = 0; i < origen.length; i++) {

            if (origen[i] % 2 == 0 && origen[i] > 25) {

                destino[contador2] = origen[i];
                contador2++;

            }

        }

        for (int i = 0; i < origen.length; i++) {
            System.out.print(" " + origen[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < destino.length; i++) {
            System.out.print(" " + destino[i] + " ");
        }
    }

    public void elTres() {

        int[] notas = new int[10];
        int nA = 1;

        System.out.println("Introduzca la nota numero " + nA);
        nA++;
        notas[0] = teclado.nextInt();

        System.out.println("Introduzca la nota numero " + nA);
        nA++;
        notas[1] = teclado.nextInt();

        System.out.println("Introduzca la nota numero " + nA);
        nA++;
        notas[2] = teclado.nextInt();

        System.out.println("Introduzca la nota numero " + nA);
        nA++;
        notas[3] = teclado.nextInt();

        System.out.println("Introduzca la nota numero " + nA);
        nA++;
        notas[4] = teclado.nextInt();

        System.out.println("Introduzca la nota numero " + nA);
        nA++;
        notas[5] = teclado.nextInt();

        System.out.println("Introduzca la nota numero " + nA);
        nA++;
        notas[6] = teclado.nextInt();

        System.out.println("Introduzca la nota numero " + nA);
        nA++;
        notas[7] = teclado.nextInt();

        System.out.println("Introduzca la nota numero " + nA);
        nA++;
        notas[8] = teclado.nextInt();

        System.out.println("Introduzca la nota numero " + nA);
        nA++;
        notas[9] = teclado.nextInt();

        int media = 0;

        for (int i = 0; i < notas.length; i++) {

            media += notas[i];

        }

        media = media / notas.length;

        System.out.print("La media es : " + media + " , las notas del suspenso son:");

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] < media) {

                System.out.print(" " + notas[i] + " ");
            }

        }

    }

    public void elCuatro() {

        int numeros[] = new int[15];

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Introduzca número");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 14; i >= 0; i--) {

            System.out.print(numeros[i]);
        }

    }

    public void elCinco() {

        int min = 1;
        int max = 100;
        int rango = max - min + 1;
        int[] vct = new int[10];
        for (int i = 0; i < vct.length; i++) {

            vct[i] = (int) (Math.random() * rango) + min;

        }

        int elMayor = 0;
        int posicion = 0;

        for (int i = 0; i < vct.length; i++) {

            if (vct[i] > elMayor) {

                elMayor = vct[i];
                posicion = i;
            }

        }

        System.out.println("El mayor es " + elMayor + " y su posición el vector es " + posicion);

    }

    public void elSeis() {
        int min = 0;
        int max = 9;
        int rango = max - min + 1;
        int[] cap = new int[10];

        for (int i = 0; i < cap.length; i++) {

            cap[i] = (int) (Math.random() * rango) + min;

        }
        Boolean capicua = true;

        for (int i = 0, j = cap.length - 1; i < cap.length; i++, j--) {

            capicua = j == i;

        }
        System.out.println("soy necrozoofilico");
        if (capicua == true) {

            System.out.println(cap + " es capicua");

        }

        else {
            System.out.println(cap + " no es capicua");
        }
    }
}
