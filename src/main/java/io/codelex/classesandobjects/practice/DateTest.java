package io.codelex.classesandobjects.practice;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date((byte) 16, (byte) 4, 2077);

        System.out.println(date.displayDate());

        date.setDay((byte) 21);
        date.setMonth((byte) 12);
        date.setYear(40000);

        System.out.println(date.displayDate());

        System.out.println(date.getYear());
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
    }
}
