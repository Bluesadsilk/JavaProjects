/*
*
* 
*
* Creada el 07 nov 2023, 16:38:33
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 07 nov 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 07 nov 2023
*/
package Metodos_Intro.ejercicio3;

public class nMalFunction {

    public void DibujarTriangulo(int nTri) {
        int form1 = 5 + (2 * (nTri - 1));
        int asteriscos = 1;
        int espacios = (form1 - 1) / 2;

        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <= espacios; j++) {
                System.out.print(" ");

                for (int j2 = 0; j2 <= asteriscos; j2++) {
                    System.out.print("*");

                }

            }
            System.out.println("");
            asteriscos = asteriscos + 2;
            espacios--;
        }

    }

    public void DibujarTronco(int nTri) {
        int form1 = 5 + (2 * (nTri - 1));

    }

    public void DibujarMaceta(int nTri) {
        int form1 = 5 + (2 * (nTri - 1));

    }

}
