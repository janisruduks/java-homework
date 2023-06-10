package io.codelex.custom.terminal;

import io.codelex.custom.terminal.terminal.File;
import io.codelex.custom.terminal.terminal.Folder;
import io.codelex.custom.terminal.terminal.Terminal;

import java.util.Scanner;

public class TerminalApp {

    //TODO maybe try to fix nobvim so it displays old content or something.
    //TODO Implement colors is a must!
    //TODO Add different types of files. (idk for what reason)
    //TODO Maybe allow connections to different 'servers' aka terminals

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Folder rootFolder = new Folder("root");
        File file = new File("file", "some random content\nhello world");
        rootFolder.add(file);
        Terminal terminal = new Terminal(rootFolder);
        terminal.printLogo();

        while (true) {
            System.out.print(terminal.getPath() + "$ ");
            commands(keyboard, terminal);
        }
    }

    private static void commands(Scanner keyboard, Terminal terminal) {

        switch (keyboard.next()) {
            case "help" -> terminal.printAllCommands();
            case "cd" -> terminal.cd(keyboard.next());
            case "mkdir" -> terminal.mkdir(keyboard.next());
            case "rm" -> terminal.rm(keyboard.next());
            case "touch" -> terminal.touch(keyboard.next());
            case "nobvim" -> terminal.textEditor(keyboard.next(), keyboard);
            case "ls" -> terminal.ls();
            case "cat" -> terminal.cat(keyboard.next());
            case "clear" -> terminal.clear(); // ugly way to clear terminal
            case "logo" -> terminal.printLogo();
            case "exit()" -> System.exit(0);
            default -> System.out.println("Sorry I did not get that... Try using 'help'");
        }
    }
}