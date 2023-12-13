/*
*
* 
*
* Creada el 13 dic 2023, 16:12:17
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 13 dic 2023
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 13 dic 2023
*/
package MatricesUnidimensionales.EjerciciosEntregables;

import java.util.Arrays;

public class Entregables {

    public Entregables() {

    }

    public void Muestra(int[] v1) {
        System.out.println(Arrays.toString(v1));
    }

    public void Busca(int[] v1) {
        int position = Arrays.binarySearch(v1, 7);
        if (position < 0) {

            System.out.println("No se encuentra el número 7");

        } else {
            System.out.println("La posición es = " + position);
        }

    }

    public void Crea1() {
        int[] v2 = new int[10];
        int manguera = 7;
        Arrays.fill(v2, manguera);
        System.out.println(Arrays.toString(v2));
    }

    public void Crea2(int[] v1) {
        int[] v3 = Arrays.copyOfRange(v1, 0, 10);
        System.out.println(Arrays.toString(v3));

    }

    public static void main(String[] args) {
        Entregables Menu = new Entregables();

        int min = 1;
        int max = 1000;
        int rango = max - min + 1;
        int[] v1 = new int[100];

        for (int i = 0; i < v1.length; i++) {
            v1[i] = (int) (Math.random() * rango + min);

        }

        Menu.Muestra(v1);
        Menu.Busca(v1);
        Menu.Crea1();
        Menu.Crea2(v1);

    }

}
