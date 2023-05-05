package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class CountUserInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        scan.close();

        int sum = 0;
        for(String numberString: input){
            int number = Integer.parseInt(numberString);
            sum += number;
        }
        System.out.println(sum);
    }
}
