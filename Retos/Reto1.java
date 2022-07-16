import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();

        int distanciaCasaGoku = entrada;
        int proximaEsfera = (entrada * 2) + 4;
        int duracionViaje = (distanciaCasaGoku + proximaEsfera) / 5;

        System.out.printf("%d %d %d\n", distanciaCasaGoku, proximaEsfera, duracionViaje);

        if (duracionViaje > 0 && duracionViaje < 21){
            System.out.println("uno");
        } else if (duracionViaje > 20 && duracionViaje < 31) {
            System.out.println("dos");
        } else if (duracionViaje > 30 && duracionViaje < 51) {
            System.out.println("tres");

        } else {
            System.out.println("cuatro");
        }


    }
}
