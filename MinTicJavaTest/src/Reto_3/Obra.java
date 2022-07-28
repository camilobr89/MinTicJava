/*
* 1). (Vale 1) El arquitecto solicita que exista un metodo llamado "clases" que dada una lista de enteros, donde cada entero es la categoria de la obra, retorne una lista con las categorias únicas.

Por ejemplo, suponiendo que 10 obras son categorizadas de la siguiente manera:

[1,2,5,5,5,1,2,5,5,5]

la función debe retornar la lista

 [1,2,5]

2).  (Vale 1) El arquitecto solicita que exista un metodo llamado "meFaltanDeLaClase"  el cual recibe tres parámetros. El primero es un lista con las obras que a un museo le hacen falta para completar la Colección Sagrada. El segundo es una lista de las categorias a la que pertenece cada una de las obras de la Colección Sagrada. El tercero es un entero representando una de las categorias. Este método debe retornar una lista con los números de obra que faltan para completar pero que son de la categoria especificada en el tercer parámetro.

Por ejemplo si se ejecuta la función:

meFaltanDeLaClase([1,3,6,8], [1,2,5,5,5,1,2,5,5,5], 5)

debe retornar la lista

[3,8]

Por ejemplo si ejecutan la

función:

meFaltanDeLaClase([1,3,6,8], [1,2,5,5,5,1,2,5,5,5], 2)

 Se debe retornar la lista:

[1,6]

 3). (Vale 1) El arquitecto solicita que exista un metodo llamado "noTengo" que dada una lista con las Obras que tiene el museo A, una lista con las obras que tiene el museo B, retorne la lista con las obras que son de interés para el museo B (Las que tiene A que no tiene B).

Por ejemplo si se llama:

notengo([3,5,7,10,15,16],[4,10,5,8])

Se debe retornar la lista:

[3,7,15,16]

4.  (Vale 1). Algunos museos han desarrollado la capacidad de generar duplicados certificados de las obras. Esto les permite intercambiar obras y así mismo facilitar el proceso para completar la Colección Sagrada. El arquitecto solicita que exista un metodo llamado "puedoCambiar" que reciba la lista de duplicados que tiene el museo A y la lista de duplicados que tiene el museo B y que retorne el número de obras que pueden cambiar.

Por ejemplo, llamar la función:

puedocambiar([3,5,7,10,15,16],[4,10,5,8])

Debe retornar

2

Porque al museo B le interesan las obras [3,7,15,16] del museo A, mientras que al museo A solo le interesan las obras [4,8] del museo B. Para que sea evaluada correctamente, la función debe retornar un Integer.

Entrada:

Este programa no requiere entrada. Ni generará salida. Se requiere que el estudiante genere un archivo con el nombre Obra.java sin main y que se respeten los nombres de las funciones dadas y sus parámetros.
*
* */

package Reto_3;

import java.util.ArrayList;

public class Obra {

    public static ArrayList<Integer> clases(ArrayList<Integer> entrada) {
        ArrayList<Integer> salida = new ArrayList<>();

        for (Integer i : entrada) {
            if (!salida.contains(i)) {
                salida.add(i);
            }
        }
        return salida;

    }

    public static ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> obrasFalta, ArrayList<Integer> listaCategorias,
                                                       int categoria) {
        ArrayList<Integer> salida = new ArrayList<>();
        ArrayList<Integer> nueva = new ArrayList<>();

        for (int i = 0; i < listaCategorias.size(); i++) {
            if (categoria == listaCategorias.get(i)) {
                nueva.add(i);
            }
        }

        for (Integer i : obrasFalta) {
            if (nueva.contains(i)) {
                salida.add(i);
            }
        }
        return salida;
    }

    public static ArrayList<Integer> noTengo(ArrayList<Integer> obrasA, ArrayList<Integer> obrasB) {
        ArrayList<Integer> salida = new ArrayList<>();

        for (Integer i : obrasA) {
            if (!obrasB.contains(i)) {
                salida.add(i);
            }
        }
        return salida;
    }

    public static Integer puedoCambiar(ArrayList<Integer> dupliA, ArrayList<Integer> dupliB) {
        int salida = 0;

        if (dupliA.size() > dupliB.size()) {
            for (Integer i : dupliB) {
                if (!dupliA.contains(i)) {
                    salida++;
                }
            }
        } else {
            for (Integer i : dupliA) {
                if (!dupliB.contains(i)) {
                    salida++;
                }
            }
        }
        return salida;
    }
}