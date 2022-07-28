/*
* Dada una lista de ńumeros, eliminar los duplicados e imprimir la lista
procesada.
*
*
* */

package Problemas;

public class Ejercicio1 {

    public static void main(String[] args) {

        int[] lista = {1, 2, 2, 2, 3, 4, 5, 6, 6, 6, 7, 8, 9, 10, 10};



        eliminarDuplicados(lista);


    }

    public static void eliminarDuplicados(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] == lista[j]) {
                    lista[j] = 0;
                }
            }
        }
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != 0) {
                System.out.println(lista[i]);
            }
        }
    }


}
