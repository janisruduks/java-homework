package io.codelex.arrays.practice;

public class Exercise4 {

    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };

        int specificValue = 12345;

        for (int value : myArray) {
            if (value == specificValue) {
                System.out.println("Contains!");
            }
        }
    }
}
