package ProyectosConjuntos.GeneradorContraseñas;

import java.util.Scanner;

/* Queremos crear un programa para uso propio que genere contraseñas según los parámetros que le indiquemos, por ejemplo, 
*  longitud de la contraseña, frequencia de caracteres, según el tipo de carácter que se desee. Queremos usar 
*/

public class passwordGenerator {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca los parámetros para crear su contraseña personalizada");

        System.out.println("Primero introduzca la longitud que desea la contraseña");
        int longitud = teclado.nextInt();

        System.out.println(
                "Segundo introduzca la cantidad de caracteres alfabéticos que desea que contenga la contraseña");
        int alfaCant = teclado.nextInt();

        System.out.println("Introduzca la cantidad de caracteres numéricos que desea que contengatenga la contraseña");
        int numCant = teclado.nextInt();

        System.out.println("Introduzca la cantidad de caracteres especiales que desea que contenga la contraseña");
        int espeCant = teclado.nextInt();

        teclado.close();

        var contrasenia = 1;

        System.out.println("Tu contraseña es: " + contrasenia + espeCant + numCant + alfaCant + longitud);

    }

}
