import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        float nota1 = 0F, nota2 = 0F, nota3 = 0F, nota4 = 0F, nota5 = 0F,
                nota6 = 0F, nota7 = 0F;



        float estudiantes = 0F;

        float notaFinalAlumno1 = 0F;
        float notaFinalAlumno2 = 0F;
        float notaFinalAlumno3 = 0F;
        float notaFinalAlumno4 = 0F;
        float notaFinalAlumno5 = 0F;
        float notaFinalAlumnos = 0F;

        while (estudiantes < 5) {
            System.out.println("Ingrese las notas del estudiante ".concat(Float.toString(estudiantes + 1)));
            System.out.print("Ingresse la nota del Reto 1: ");
            nota1 = sc.nextFloat();
            System.out.print("Ingresse la nota del Reto 2: ");
            nota2 = sc.nextFloat();
            System.out.print("Ingresse la nota del Reto 3: ");
            nota3 = sc.nextFloat();
            System.out.print("Ingresse la nota del Reto 4: ");
            nota4 = sc.nextFloat();
            System.out.print("Ingresse la nota del Reto 5: ");
            nota5 = sc.nextFloat();
            System.out.print("Ingresse la nota del Reto habilidades: ");
            nota6 = sc.nextFloat();
            System.out.print("Ingresse la nota del Reto ingles: ");
            nota7 = sc.nextFloat();
            estudiantes++;
            System.out.println();
        }

        notaFinalAlumno1 = (nota1 * 0.1F) + (nota2 * 0.1F) + (nota3 * 0.2F) + (nota4 * 0.2F) + (nota5 * 0.2F) + (nota6 * 0.1F) + (nota7 * 0.1F);
        notaFinalAlumno2 = (nota1 * 0.1F) + (nota2 * 0.1F) + (nota3 * 0.2F) + (nota4 * 0.2F) + (nota5 * 0.2F) + (nota6 * 0.1F) + (nota7 * 0.1F);
        notaFinalAlumno3 = (nota1 * 0.1F) + (nota2 * 0.1F) + (nota3 * 0.2F) + (nota4 * 0.2F) + (nota5 * 0.2F) + (nota6 * 0.1F) + (nota7 * 0.1F);
        notaFinalAlumno4 = (nota1 * 0.1F) + (nota2 * 0.1F) + (nota3 * 0.2F) + (nota4 * 0.2F) + (nota5 * 0.2F) + (nota6 * 0.1F) + (nota7 * 0.1F);
        notaFinalAlumno5 = (nota1 * 0.1F) + (nota2 * 0.1F) + (nota3 * 0.2F) + (nota4 * 0.2F) + (nota5 * 0.2F) + (nota6 * 0.1F) + (nota7 * 0.1F);
        notaFinalAlumnos = (notaFinalAlumno1 + notaFinalAlumno2 + notaFinalAlumno3 + notaFinalAlumno4 + notaFinalAlumno5) / 5;
        System.out.printf("La nota final del alumno 1 es: %.2f\n", notaFinalAlumno1);
        System.out.printf("La nota final del alumno 2 es: %.2f\n", notaFinalAlumno2);
        System.out.printf("La nota final del alumno 3 es: %.2f\n", notaFinalAlumno3);
        System.out.printf("La nota final del alumno 4 es: %.2f\n", notaFinalAlumno4);
        System.out.printf("La nota final del alumno 5 es: %.2f\n", notaFinalAlumno5);
        System.out.println("La nota final de los 5 estudiantes es: " + notaFinalAlumnos);







    }
}
