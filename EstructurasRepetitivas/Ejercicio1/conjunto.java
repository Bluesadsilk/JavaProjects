package EstructurasRepetitivas.Ejercicio1;

import java.util.Scanner;

public class conjunto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.close();

        int alumnos = 100;
        int numeroAlumno = 1;
        int asignatura1 = 1, asignatura2 = 1, asignatura3 = 1, asignatura4 = 1, asignatura5 = 1, asignatura6 = 1,
                asignatura7 = 1;

        while (numeroAlumno > alumnos) {
            numeroAlumno++;
            asignatura1 = (int) (asignatura1 * Math.random()) + asignatura1;

        }
        int NotaAsignatura1 = asignatura1;
        int AprobadosAsignatura1 = NotaAsignatura1;

        int NotaAsignatura2 = asignatura2;
        int AprobadosAsignatura2 = NotaAsignatura2;

        int NotaAsignatura3 = asignatura3;
        int AprobadosAsignatura3 = NotaAsignatura3;

        int NotaAsignatura4 = asignatura4;
        int AprobadosAsignatura4 = NotaAsignatura4;

        int NotaAsignatura5 = asignatura5;
        int AprobadosAsignatura5 = NotaAsignatura5;

        int NotaAsignatura6 = asignatura6;
        int AprobadosAsignatura6 = NotaAsignatura6;

        int NotaAsignatura7 = asignatura7;
        int AprobadosAsignatura7 = NotaAsignatura7;

        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura1 + "%");
        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura2 + "%");
        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura3 + "%");
        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura4 + "%");
        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura5 + "%");
        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura6 + "%");
        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura7 + "%");

    }

}
