package EstructurasControl.Ejercicio6;

import java.util.Scanner;

public class notasAL {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nota para saber la letra");
        int notaIntroducida = teclado.nextInt();

        switch (notaIntroducida) {
            case 10:
            case 9:
                System.out.println("Tu nota es A");
                break;

            case 8:
                System.out.println("Tu nota es B");
                break;

            case 7:
                System.out.println("Tu nota es C");
                break;

            case 6:
                System.out.println("Tu nota es D");
                break;

            case 5:
                System.out.println("Tu nota es E");
                break;

            default:
                System.out.println("Tu nota es F");
        }

        teclado.close();
    }

}
