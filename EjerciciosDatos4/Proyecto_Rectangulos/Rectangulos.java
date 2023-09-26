package EjerciciosDatos4.Proyecto_Rectangulos;

public class Rectangulos {
    public static void main(String[] args) {

        int ladoLong = 25;
        int ladoShort = 15;
        double perim = ladoLong + ladoLong + ladoShort + ladoShort;
        double area = ladoLong * ladoShort;

        System.out.println("El lado largo tiene la longitud de " + ladoLong + "cm");
        System.out.println("El lado corto tiene la longitud de " + ladoShort + "cm");
        System.out.println("El área del rectángulo es " + area + "cm");
        System.out.println("El perímetro del rectángulo es " + perim + "cm");

    }

}
