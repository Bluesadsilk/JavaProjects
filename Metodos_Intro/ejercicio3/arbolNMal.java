/*
*
* 
*
* Creada el 07 nov 2023, 16:36:58
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

import java.util.Scanner;

public class arbolNMal {

    public static void main(String[] args) {

        nMalFunction callFunction = new nMalFunction();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número de triángulos que desea que tenga el árbol de navidad");
        int nTri = teclado.nextInt();
        teclado.close();

        callFunction.DibujarTriangulo(nTri);
        callFunction.DibujarTronco(nTri);
        callFunction.DibujarMaceta(nTri);

    }
}
