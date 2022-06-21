import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i, n;

        double guerra, nomina, pensiones, salario_minimo, salud;
        double seguridad, sueldo_devengado;
        String nombre;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();

        in.nextLine();
        for (i = 1; i <= n; i = i + 1) {
            System.out.print("PROCESO    " + i);
            System.out.print("Ingresa el nombre: ");
            nombre = in.nextLine();

            System.out.print("Ingresa el valor de salario minimo: ");
            salario_minimo = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de sueldo devengado: ");
            sueldo_devengado = in.nextDouble();
            in.nextLine();
            in.nextLine();
            salud = 0;
            pensiones = 0;
            seguridad = 0;
            guerra = 0;

            if (sueldo_devengado <= salario_minimo * 3) {
                salud = sueldo_devengado * 0.05;
                pensiones = sueldo_devengado * 0.118;
                seguridad = sueldo_devengado * 0.03;
            }
            if (sueldo_devengado > salario_minimo * 4 && sueldo_devengado < salario_minimo * 8) {
                salud = sueldo_devengado * 0.1;
                pensiones = sueldo_devengado * 0.15;
                seguridad = sueldo_devengado * 0.05;
            }
            if (sueldo_devengado > salario_minimo * 8 && salario_minimo <= salario_minimo * 20) {
                nomina = sueldo_devengado - salud - pensiones - seguridad - guerra;
                System.out.println("Nombre: " + nombre);
                System.out.println("Valor de guerra: " + guerra);
                System.out.println("Valor de nomina: " + nomina);
                System.out.println("Valor de pensiones: " + pensiones);
                System.out.println("Valor de salud: " + salud);
                System.out.println("Valor de seguridad: " + seguridad);
                System.out.println();
            }
        }
    }
}