package EstructurasControl3.EJercicioBucleContar;

import java.util.Scanner;

public class contador {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuantos números quieres y te los generaré de forma aleatoria");
        int numeroIntroducido = teclado.nextInt();
        int contadorBucle = 0;

        while (contadorBucle != numeroIntroducido) {

            int numero = (int) (Math.random() * 101);

            contadorBucle++;

            System.out.println(contadorBucle + " : " + numero);
        }

        teclado.close();

    }

}
