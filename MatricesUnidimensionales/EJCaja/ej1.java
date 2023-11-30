/*
*
* 
*
* Creada el 30 nov 2023, 17:02:52
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 30 nov 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 30 nov 2023
*/
package MatricesUnidimensionales.EJCaja;

public class ej1 {

    public static void main(String[] args) {

        int[] notas = new int[10];
        int min = 1;
        int max = 10;
        int rango = max - min + 1;
        int contador = 0;
        int media = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * rango + min);

            media += notas[i];
        }
        media = media / 10;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= media) {
                contador++;

            }
        }

        System.out.println("Las notas que superan la media son " + contador + " , la media es : " + media);

    }

}
