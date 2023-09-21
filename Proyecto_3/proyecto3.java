package Proyecto_3;

public class proyecto3 {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        boolean dada;
        dada = a++ / 2 < b && (a++ / 2 > b) || (a * 2 < b * 4);
        System.out.println(dada);
        System.out.println("3+5= " + (3 + 5));
    }

}
