package EjerciciosDatos4.Plazo_Fijo;

public class ejPlazoFijo {

    public static void main(String[] args) {

        /*
         * Defino las variables, el dinero total de la cuenta, el porcentaje que
         * ingresa el banco y la el porcentaje que se lleva hacienda
         */

        double totalCuenta = 3500;
        double interesBanco = (3.25 / 100.0);
        double haciendaInteres = (21 / 100.0);

        /*
         * Defino una variable en la que se calcula lo que paga el banco sobre el dinero
         * del fondo
         * para mas tarde definir la variable en la que resto el porcentaje de hacienda
         * dandome el resultado
         */

        double ingreso = totalCuenta * interesBanco;
        double beneficio = ingreso - ingreso * haciendaInteres;

        /* Aquí imprimo el resultado en la terminal */

        System.out.println(beneficio);

    }
}
