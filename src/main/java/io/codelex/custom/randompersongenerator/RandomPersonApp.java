package io.codelex.custom.randompersongenerator;

public class RandomPersonApp {

    public static void main(String[] args) {

        Person person = RandomPersonGenerator.getPerson();
        System.out.println(person);

    }

}
