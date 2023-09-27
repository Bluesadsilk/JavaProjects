package EjerciciosDatos4.Triangulo;

import java.util.Scanner;

public class triangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca los cm del lado del trángulo");
        int ladoTri = teclado.nextInt();
        teclado.close();

        double area = (ladoTri * ladoTri * Math.sqrt(3)) / 4.0;
        double perim = ladoTri * 3;

        System.out.println("El area del triángulo es " + area + "cm y su perímetro es " + perim + "cm");

    }

}
