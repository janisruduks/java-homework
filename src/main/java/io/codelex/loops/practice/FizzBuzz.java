package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int newLine = 20;
        for(int i = 1; i <= input; i++) {

            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz ");
            }else if(i % 3 == 0) {
                System.out.print("Fizz ");
            }else if(i % 5 == 0){
                System.out.print("Buzz ");
            }else {
                System.out.print(i + " ");
            }

            if(i == newLine){
                System.out.print("\n");
                newLine += 20;
            }
        }
    }

}
