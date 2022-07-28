/*Desarrollar una funcion que reciba dos TreeMap como paŕametros y
los mezcle,     es decir, que se construya un nuevo TreeMap con las
llaves de los dos TreeMap recibidos; si hay una clave repetida en
ambos TreeMap, se debe asignar el valor que tenga la clave en el
primer TreeMap.*/

package Problemas;

import java.util.TreeMap;

public class Ejercicio5 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map1 = new TreeMap<>();
        TreeMap<String, Integer> map2 = new TreeMap<>();
        TreeMap<String, Integer> map3 = new TreeMap<>();
        map1.put("A", 2);
        map1.put("B", 2);
        map1.put("C", 3);
        map2.put("A", 2);
        map2.put("B", 5);
        map2.put("C", 6);
        map3 = mezclar(map1, map2);
        System.out.println(map3);


    }

    public static <K, V> TreeMap<K, V> mezclar(TreeMap<K, V> map1, TreeMap<K, V> map2) {
        TreeMap<K, V> map3 = new TreeMap<K, V>();
        for (K key : map1.keySet()) {
            map3.put(key, map1.get(key));
        }
        for (K key : map2.keySet()) {
            map3.put(key, map2.get(key));
        }
        return map3;


    }


}
