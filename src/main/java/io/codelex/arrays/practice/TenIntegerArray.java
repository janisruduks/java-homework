package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class TenIntegerArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] firstArray = new int[9];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(100) + 1;
        }

        int[] secondArray = new int[9];
        System.arraycopy(firstArray, 0, secondArray, 0, firstArray.length);

        secondArray[secondArray.length - 1] = -7;

        System.out.println("Array 1: " + Arrays.toString(firstArray));
        System.out.println("Array 2: " + Arrays.toString(secondArray));
    }
}
