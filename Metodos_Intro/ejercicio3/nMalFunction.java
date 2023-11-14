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

        for (int i = 0; i < nTri; i++) {
            for (int j = 0; j < 3; j++) {

                for (int j2 = 0; j2 < espacios; j2++) {
                    System.out.print(" ");
                
                }
                 if (j % 3 == 0) {
                        if (j2 == espacios - 1) {
                            System.out.print("0");
                            j2++;
                        }
                    }

                for (int j2 = 0; j2 < asteriscos; j2++) {

                    System.out.print("*");

                }
                System.out.println();
                asteriscos = asteriscos + 2;
                espacios--;

            }

            asteriscos = asteriscos - 4;
            espacios = espacios + 2;
        }
    }

    public void DibujarTronco(int nTri) {
        int form1 = 5 + (2 * (nTri - 1));
        int baseMaceta = form1 / 3;
        int asteriscos = 1 % baseMaceta % 2 == 0 ? baseMaceta + 1 : baseMaceta;
        ;
        int espacios = (form1 - asteriscos) / 2;
        for (int i = 0; i < nTri; i++) {

            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            for (int j2 = 0; j2 < asteriscos; j2++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public void DibujarMaceta(int nTri) {
        int form1 = 5 + (2 * (nTri - 1));
        int asteriscos = form1 - nTri;
        int espacios = (form1 - asteriscos) / 2;

        for (int j = 0; j < nTri / 2; j++) {

            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");

            }
            for (int i = 0; i < asteriscos; i++) {
                System.out.print("*");

            }
            System.out.println("");
            asteriscos = asteriscos - 2;
            espacios++;
        }
    }

}
