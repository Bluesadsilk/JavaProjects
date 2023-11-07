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

    int nAsteriscos = 1;
    int nEspacios = 1;

    public void DibujarTriangulo(int nTri) {

    }

    public void DibujarTronco(int nTri) {

        for (int h = 0; h < nTri; h++) {

            for (int i = 0; i < nTri; i++) {

                System.out.print(" ");
            }

            for (int j = 0; j < nTri; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    public void DibujarMaceta(int nTri) {

    }

}
