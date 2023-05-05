package io.codelex.typesandvariables.practice;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        byte a = 1;
        byte b = 2;
        byte c = 3;
        byte d = 4;
        byte e = 5;

        //fixme - should be 15 :| 
        int sum = a + b + c + d + e;
        System.out.println(sum);
    }

    private static void second() {
        byte a = 1;
        byte b = 2;
        byte c = 3;
        float d = 4.2f;
        float e = 5.3f;

        //fixme - should be 15.5 :| 
        float sum = (a + b + c + d + e);
        System.out.println(sum);
    }
}
