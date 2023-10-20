package EstructurasRepetitivas.Ejercicio1;

import java.util.Random;

public class conjunto {

    public static void main(String[] args) {
        Random random = new Random();

        int alumnos = 100;
        int numeroAlumno = 0;
        double asignatura1 = 0, asignatura2 = 0, asignatura3 = 0, asignatura4 = 0, asignatura5 = 0, asignatura6 = 0,
                asignatura7 = 0;

        while (numeroAlumno < alumnos) {
            double NotaAsignatura1 = Math.round(random.nextDouble()) * 10;
            asignatura1 = asignatura1 + NotaAsignatura1;

            double NotaAsignatura2 = random.nextDouble() * 10;
            asignatura2 = asignatura2 + NotaAsignatura2;

            numeroAlumno++;

        }

        int AprobadosAsignatura1 = (int) asignatura1 / alumnos;
        int AprobadosAsignatura2 = (int) asignatura2 / alumnos;
        int AprobadosAsignatura3 = (int) asignatura3 / alumnos;
        int AprobadosAsignatura4 = (int) asignatura4 / alumnos;
        int AprobadosAsignatura5 = (int) asignatura5 / alumnos;
        int AprobadosAsignatura6 = (int) asignatura6 / alumnos;
        int AprobadosAsignatura7 = (int) asignatura7 / alumnos;

        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura1 + "%");
        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura2 + "%");
        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura3 + "%");
        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura4 + "%");
        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura5 + "%");
        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura6 + "%");
        System.out.println("El porcentaje de aprobados es  = " + AprobadosAsignatura7 + "%");

    }

}
