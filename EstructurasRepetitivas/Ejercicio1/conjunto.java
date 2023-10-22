package EstructurasRepetitivas.Ejercicio1;

import java.util.Random;

public class conjunto {

    public static void main(String[] args) {
        Random random = new Random();

        int idMateria = 1;

        while (idMateria < 7) {
            int aprobado = 1;
            int idAlumnos = 1;
            while (idAlumnos < 100) {

                int notaAlumno = random.nextInt(11);

                if (notaAlumno >= 5) {
                    aprobado++;
                }
                idAlumnos++;
            }

            System.out.println("El porcentaje de aprobados es " + aprobado);
            idMateria++;
        }

    }
}
