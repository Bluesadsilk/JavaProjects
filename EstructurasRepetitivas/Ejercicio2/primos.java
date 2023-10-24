package EstructurasRepetitivas.Ejercicio2;

public class primos {

    public static void main(String[] args) {

        boolean esprimo;
        int num = 1, contprimo = 0;

        while (contprimo < 20) {

            esprimo = true;
            for (int div = 2; div < num; div++) {
                if (num % div == 0) {
                    esprimo = false;
                }

            }

            if (esprimo) {
                System.out.println(num);
                contprimo++;

            }

            num++;

        }

    }

}
