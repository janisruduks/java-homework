package io.codelex.maps.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise1 {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Red");
        myMap.put(2, "Green");
        myMap.put(3, "Black");
        myMap.put(4, "White");
        myMap.put(5, "Blue");

        System.out.println("Size of the hash map: " + myMap.size());

        if (myMap.containsKey(3)) {
            System.out.println("Contains! :" + ")".repeat(myMap.size()));
        } else {
            System.out.println("It does not contain :(");
        }

        if (myMap.containsValue("White")) {
            System.out.println("Contains! :" + ")".repeat(myMap.size()));
        } else {
            System.out.println("It does not contain. :(");
        }

        Map<Integer, String> newMap = new HashMap<>(myMap);

        myMap.forEach((i, s) -> System.out.println(i + " : " + s));

        myMap.clear();
        System.out.println("Hash map after clearing: " + myMap);
    }

}
