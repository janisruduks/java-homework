package io.codelex.arithmetic.practice;

public class CheckOddEven {
    public static void main(String[] args){
        Input(14);
    }
    public static void Input(int number){
        if(number % 2 == 0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
        System.out.println("bye!");
    }
}
