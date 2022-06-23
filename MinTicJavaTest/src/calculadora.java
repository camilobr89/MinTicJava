import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = 0, num2 = 0;
        boolean salir = false;
        int optiom;

        System.out.print("Ingresa el primer numero: ");
        num1 = sc.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        num2 = sc.nextDouble();
        System.out.println();

        while (!salir) {

            System.out.println();
            System.out.println("Introduce la operacion que desea hacer ");
            System.out.println(" Suma elije 1 ");
            System.out.println(" Division elije 2 ");
            System.out.println(" Multiplicacion elije 3 ");
            System.out.println(" Resta elije 4 ");
            System.out.println(" Raiz cuadrada elije 5 ");
            System.out.println(" Modulo % elije 6 ");
            System.out.println("Salir 7 ");
            optiom = sc.nextInt();
            System.out.println();

            switch (optiom){
                case 1:
                    System.out.printf("La suma de %.2f con el %.2f es de %.2f", num1, num2, num1 + num2);
                    System.out.println();
                    break;

                case 2:
                    System.out.printf("La division de %.2f con el %.2f es de %.2f", num1, num2, num1 / num2);
                    System.out.println();
                    break;

                case 3:
                    System.out.printf("La multiplicacion de %.2f con %.2f es de %.2f", num1, num2, num1 * num2);
                    System.out.println();
                    break;

                case 4:
                    System.out.printf("La resta de %.2f con %.2f es de %.2g", num1, num2, num1 - num2);
                    System.out.println();
                    break;

                case 5:
                    System.out.printf("La raiz cuadrada de %.2f es de %.2f y la raiz de %.2f es de %.2f",
                            num1, Math.sqrt(num1), num2, Math.sqrt(num2));
                    System.out.println();
                    break;

                case 6:
                    System.out.printf("El modulo de %.2f entre %.2f es de %.2f", num1, num2, num1 % num2);
                    System.out.println();
                    break;

                case 7:
                    salir = true;
                    System.out.println();
                    break;

                default:
                    System.out.println("No escogio una opcion valida ");
                    System.out.println();

            }

        }



    }
}
