package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;

public class userListOfNames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> names = new HashSet<>();
        while (true) {
            System.out.print("Enter name: ");
            String name = in.nextLine();
            if (name.equals("")) {
                System.out.print("Unique name list contains: ");
                names.forEach(element -> System.out.print(element + " "));
                break;
            } else {
                names.add(name);
            }
        }
    }
}
