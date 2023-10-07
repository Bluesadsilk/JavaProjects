package ProyectosConjuntos.GeneradorContraseñas;

import java.security.SecureRandom;
import java.util.Scanner;

/* Queremos crear un programa para uso propio que genere contraseñas según los parámetros que le indiquemos, por ejemplo, 
*  longitud de la contraseña, frequencia de caracteres, según el tipo de carácter que se desee. Queremos usar 
*/

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean comprobador = false;

        while (comprobador == false) {

            System.out.println("Introduzca los parámetros para crear su contraseña personalizada");

            System.out.println("Primero introduzca la longitud que desea la contraseña: ");
            int longitud = teclado.nextInt();

            System.out.println(
                    "Segundo introduzca la cantidad de caracteres alfabéticos que desea que contenga la contraseña: ");
            int alfaCant = teclado.nextInt();

            System.out.println(
                    "Introduzca la cantidad de caracteres numéricos que desea que contenga la contraseña: ");
            int numCant = teclado.nextInt();

            System.out.println(
                    "Introduzca la cantidad de caracteres especiales que desea que contenga la contraseña: ");
            int espeCant = teclado.nextInt();

            if (longitud == (espeCant + numCant + alfaCant)) {

                comprobador = true;
                teclado.close();
                String contraseña = generarContraseña(longitud, alfaCant, numCant, espeCant);

                System.out.println("Tu contraseña es : " + contraseña);
            }

            else {

                System.out.println(
                        "Entrada incorrecta de datos, La suma de datos no coincide con la longitud de la contraseña");

            }

        }

    }

    public static String generarContraseña(int longitud, int alfaCant, int numCant, int espeCant) {

        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numeros = "123456789";
        String especiales = "|@#~{[]}¿!$%&/()=";

        StringBuilder contraseña = new StringBuilder();
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < alfaCant; i++) {

            char letra = letras.charAt(random.nextInt(letras.length()));

            contraseña.append(letra);

        }

        for (int e = 0; e < numCant; e++) {

            char numero = numeros.charAt(random.nextInt(numeros.length()));

            contraseña.append(numero);

        }

        for (int a = 0; a < espeCant; a++) {

            char especial = especiales.charAt(random.nextInt(especiales.length()));
            contraseña.append(especial);

        }
        return contraseña.toString();

    }

}
