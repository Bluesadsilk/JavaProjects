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
        int rango = max + min + 1;
        int[][] tablaAlumnosNotas = new int[15][3];
        for (int i = 0; i < tablaAlumnosNotas.length; i++) {
            tablaAlumnosNotas[i][i] = i;
            for (int j = 0; j < tablaAlumnosNotas.length; j++) {
                tablaAlumnosNotas[i][j] = (int) (Math.random() * rango + 1);

            }

        }
        return tablaAlumnosNotas;
    }

    public ejemplo() {
    }

    public static void main(String[] args) {
        ejemplo Menu = new ejemplo();

        int[][] tablaAlumnosNotas = Menu.GeneraMatriz();

    }

}
