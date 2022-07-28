package Reto_3;

import java.util.ArrayList;

public class Main extends Obra {

    public static void main(String[] args) {


        // Probamos el primer metodo de la clase Obra llamado clases
        int[] clases = {1, 2, 5, 5, 5, 1, 2, 5, 5, 5};
        ArrayList<Integer> entrada = new ArrayList<>();
        for (int i : clases) entrada.add(i);
        System.out.println(clases(entrada));

        // Probamos el segundo metodo de la clase Obra llamado meFaltanDeLaClase
        int[] meFaltanDeLaClase1 = {1, 3, 6, 8};
        int[] meFaltanDeLaClase2 = {1, 2, 5, 5, 5, 1, 2, 5, 5, 5};
        int meFaltanDeLaClase3 = 5;
        ArrayList<Integer> obrasFalta = new ArrayList<>();
        ArrayList<Integer> listaCategorias = new ArrayList<>();
        for (int i : meFaltanDeLaClase1) obrasFalta.add(i);
        for (int i : meFaltanDeLaClase2) listaCategorias.add(i);
        System.out.println(meFaltanDeLaClase(obrasFalta, listaCategorias, meFaltanDeLaClase3));


        // Probamos el tercer metodo de la clase Obra llamado noTengo
        int[] noTengo1 = {3, 5, 7, 10, 15, 16};
        int[] noTengo2 = {4, 10, 5, 8};
        ArrayList<Integer> obrasA = new ArrayList<>();
        ArrayList<Integer> obrasB = new ArrayList<>();
        for (int i : noTengo1) obrasA.add(i);
        for (int i : noTengo2) obrasB.add(i);
        System.out.println(noTengo(obrasA, obrasB));


        // Probamos el cuarto metodo de la clase Obra llamado puedoCambiar
        int[] cambiar1 = {3, 5, 7, 10, 15, 16};
        int[] cambiar2 = {4, 10, 5, 8};
        ArrayList<Integer> dupliA = new ArrayList<>();
        ArrayList<Integer> dupliB = new ArrayList<>();
        for (int i : cambiar1) dupliA.add(i);
        for (int i : cambiar2) dupliB.add(i);
        System.out.println(puedoCambiar(dupliA, dupliB));


    }

}


