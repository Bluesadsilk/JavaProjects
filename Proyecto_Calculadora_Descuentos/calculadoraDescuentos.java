package Proyecto_Calculadora_Descuentos;

public class calculadoraDescuentos {

    public static void main(String[] args) {

        int precioBotas = 85;
        double descuentoAplicableNT = (15.0 / 100.0);
        double descuentoAplicable = 85 * descuentoAplicableNT;
        double precioConDescuento = precioBotas - descuentoAplicable;

        System.out.println("Las botas con el descuento cuestan " + precioConDescuento);
    }

}
