package io.codelex.custom.terminal;

import io.codelex.custom.terminal.terminal.File;
import io.codelex.custom.terminal.terminal.Folder;
import io.codelex.custom.terminal.terminal.Terminal;
import io.codelex.custom.terminal.terminal.TerminalServers;

import java.util.HashMap;
import java.util.Scanner;

public class TerminalApp {

    //TODO maybe try to fix nobvim so it displays old content or something.
    //TODO Implement colors is a must!
    //TODO Add different types of files. (idk for what reason)
    //TODO split help section into parts?

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String rootFolderName = "root";
        Folder rootFolder = new Folder(rootFolderName);
        File rootFile = new File("file", "some random content\nhello world");
        rootFolder.add(rootFile);
        Terminal rootTerminal = new Terminal("MyPC", rootFolder, rootFolderName);

        String SSECRootFolderName = "ssec";
        Folder SSECRootFolder = new Folder(SSECRootFolderName);
        File SSECFile = new File("info", "Hello world!");
        SSECRootFolder.add(SSECFile);
        Terminal SSECTerminal = new Terminal("SSEC", SSECRootFolder, SSECRootFolderName);

        HashMap<String, Terminal> serverList = new HashMap<>();
        serverList.put("root", rootTerminal);
        serverList.put("SSEC", SSECTerminal);

        TerminalServers allServers = new TerminalServers(serverList, rootTerminal);

        rootTerminal.printLogo();

        while (true) {
            System.out.print(allServers.getRootTerminal().getPath() + "$ ");
            commands(keyboard, allServers);
        }
    }

    private static void commands(Scanner keyboard, TerminalServers servers) {

        switch (keyboard.next()) {
            case "help" -> servers.getServerConnectedTo().printAllCommands();
            case "cd" -> servers.getServerConnectedTo().cd(keyboard.next());
            case "mkdir" -> servers.getServerConnectedTo().mkdir(keyboard.next());
            case "rm" -> servers.getServerConnectedTo().rm(keyboard.next());
            case "touch" -> servers.getServerConnectedTo().touch(keyboard.next());
            case "nobvim" -> servers.getServerConnectedTo().textEditor(keyboard.next(), keyboard);
            case "ls" -> servers.getServerConnectedTo().ls();
            case "cat" -> servers.getServerConnectedTo().cat(keyboard.next());
            case "clear" -> servers.getServerConnectedTo().clear(); // ugly way to clear terminal
            case "connect" -> servers.connectToDifferentServer(keyboard.next());
            case "logo" -> servers.getServerConnectedTo().printLogo();
            case "exit()" -> System.exit(0);
            default -> System.out.println("Sorry I did not get that... Try using 'help'");
        }
    }
}