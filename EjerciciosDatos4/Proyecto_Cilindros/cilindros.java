package EjerciciosDatos4.Proyecto_Cilindros;

public class cilindros {

    public static void main(String[] args) {

        double diametro = 15.5;
        double altura = 42.4;
        double radio = diametro / 2.0;
        double area = 2 * Math.PI * Math.pow(radio, 2) + 2 * Math.PI * radio * altura;
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El area del cilindro es de " + area + "cm");
        System.out.println("El volumen del cilindro es de " + volumen + "cm");
    }

}
