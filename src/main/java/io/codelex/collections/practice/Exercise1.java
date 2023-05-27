package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};
        String[] origination = {"Germany", "Germany", "Japan", "Germany", "Germany", "Germany", "USA"};

        System.out.println("Using ArrayList");
        ArrayList<Object> array1 = new ArrayList<>(List.of(array));
        array1.forEach(System.out::println);

        System.out.println("Using HashSet");
        HashSet<Object> array2 = new HashSet<>(List.of(array));
        array2.forEach(System.out::println);

        System.out.println("Using HashSet");
        HashMap<String, String> array3 = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            array3.put(array[i], origination[i]);
        }
        array3.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
