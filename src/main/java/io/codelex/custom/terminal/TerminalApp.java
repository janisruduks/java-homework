package io.codelex.custom.terminal;

import io.codelex.custom.terminal.terminal.Folder;
import io.codelex.custom.terminal.terminal.Terminal;

import java.util.Scanner;

public class TerminalApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Folder rootFolder = new Folder("/");
        Terminal terminal = new Terminal(rootFolder);

        while (true) {

            System.out.print( terminal.getPath() + "$ ");
            commands(keyboard, terminal);

        }
    }

    private static void commands(Scanner keyboard, Terminal terminal) {
        switch (keyboard.next()) {
            case "info" -> System.out.println("Hello this is test.");
            case "cd" -> terminal.cd(keyboard.next()); // TODO cd ..
            case "mkdir" -> terminal.mkdir(keyboard.next());
            case "touch" -> terminal.touch(keyboard.next()); // TODO file extensions - write a actual content
            case "ls" -> terminal.ls(); // TODO list folders correctly
            case "clear" -> terminal.clear(); // ugly way to clear terminal
            default -> System.out.println("Sorry I did not get that...");
        }
    }
}