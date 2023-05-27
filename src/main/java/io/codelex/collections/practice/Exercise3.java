package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Set;

public class Exercise3 {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        //TODO: add 5 values to Set.
        mySet.add("Red");
        mySet.add("Black");
        mySet.add("Yellow");
        mySet.add("Purple");
        mySet.add("Green");
        //..

        System.out.println("Should have 5 elements: " + mySet); //Pay attention on order!

        //TODO: iterate through all elements in set
        /*
        for (...) {
            System.out.println(element);
        }
        */
        for (String element : mySet) {
            System.out.println(element);
        }

        //TODO: remove all values from set
        mySet.clear();
        System.out.println("Should be empty: " + mySet);

        //TODO: check if it is possible to add duplicated values
        boolean add = mySet.add("Green");
        System.out.println("Did we add Green? " + add);
        add = mySet.add("Orange");
        System.out.println("Did we add Orange? " + add);
        add = mySet.add("Green");
        System.out.println("Did we add Green? " + add);
        add = mySet.add("Purple");
        System.out.println("Did we add Purple? " + add);

        System.out.println(mySet);
    }

}
