package Ejercicios;
import java.util.ArrayList;

public class Ejemplo1 {


    public static void main(String[] args) {
        // Creando una lista de enteros
        ArrayList<Integer> lista = new ArrayList<Integer>();
        // Agregando elementos
        for (int i = 1; i <= 10; i++) lista.add(i);
        // Imprimiendo elementos
        System.out.println(lista);
        // Quitando el elemento en la posici ́on 3
        lista.remove(3);
        // Imprimiendo el arreglo
        System.out.println(lista);
        for (int i = 0; i < lista.size(); i++)
            System.out.print(lista.get(i) + " ");
        System.out.println();
        // Usando el iterador de la lista
        for( Integer n:lista ) System.out.print(n + " ");
    }
}

