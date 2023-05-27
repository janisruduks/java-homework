package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedMap;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        ArrayList<String> array = new ArrayList<>();

        //TODO: Add 10 values to list
        for (int i = 0; i < 11; i++) {
            array.add("word" + i);
        }

        //TODO: Add new value at 5th position
        array.add(4, "word10");

        //TODO: Change value at last position (Calculate last position programmatically)
        array.set(array.size() - 1, "last pos");

        //TODO: Sort your list in alphabetical order
        Collections.sort(array);

        //TODO: Check if your list contains "Foobar" element
        if (array.contains("Foobar")) {
            System.out.println("https://i.imgflip.com/32nifd.jpg?a467880");
        } else {
            System.out.println("There is no Foobar");
        }

        //TODO: Print each element of list using loop
        for (String x : array) {
            System.out.println(x);
        }
    }

}
