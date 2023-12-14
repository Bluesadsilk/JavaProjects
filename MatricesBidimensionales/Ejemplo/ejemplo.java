/*
*
* 
*
* Creada el 14 dic 2023, 17:29:07
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 14 dic 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 14 dic 2023
*/
package MatricesBidimensionales.Ejemplo;

public class ejemplo {

    public int[][] GeneraMatriz() {
        int min = 1;
        int max = 10;
        int rango = max - min + 1;
        int[][] tablaAlumnosNotas = new int[45][3];

        for (int f = 0; f < tablaAlumnosNotas.length; f++) {
            for (int c = 0; c < tablaAlumnosNotas[f].length; c++) {
                tablaAlumnosNotas[f][c] = (int) (Math.random() * rango + min);

            }

        }
        return tablaAlumnosNotas;
    }

    public int NotaMedia(int[][] matriz) {
        int media = 0;
        for (int i = 0; i < matriz.length; i++) {
            media += matriz[i][i];
        }

        media /= matriz.length;
        return media;
    }

    public ejemplo() {
    }

    public static void main(String[] args) {
        ejemplo Menu = new ejemplo();

        int[][] tablaAlumnosNotas = Menu.GeneraMatriz();

    }

}
