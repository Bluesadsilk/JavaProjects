package EstructurasControl3.Ejercicio7;

import java.util.Scanner;

public class mayor1000 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println(
                "Introduzca números para sumarlos entre si hasta que la suma sea mayor que 1000, si en primera instancia introduce un número mayor a 1000, el programa acabará.");
        int nIntroducido = teclado.nextInt();
        int suma = nIntroducido;
        if (nIntroducido < 1000) {

            System.out.println("El primer número es " + suma);

            while (suma < 1000) {
                System.out.println("Introduzca el número que quiere sumar a " + suma);
                nIntroducido = teclado.nextInt();

                suma = suma + nIntroducido;

            }
        }

        else {

            System.out.println("Adiós.");
        }

        teclado.close();
    }

}
