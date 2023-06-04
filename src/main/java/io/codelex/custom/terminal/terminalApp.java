package io.codelex.custom.terminal;

import java.util.Scanner;

public class terminalApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Terminal terminal = new Terminal();

        while (true) {

            System.out.print( terminal.getPath() + "$ ");
            commands(keyboard, terminal);

        }
    }

    private static void commands(Scanner keyboard, Terminal terminal) {
        switch (keyboard.next()) {
            case "info" -> System.out.println("Hello this is test.");
            case "cd" -> terminal.setPath(keyboard.next());
            case "cd.." -> terminal.setPathBack();
            default -> System.out.println("Sorry I did not get that...");
        }
    }
}
