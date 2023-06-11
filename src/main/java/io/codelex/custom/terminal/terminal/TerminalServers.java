package io.codelex.custom.terminal.terminal;

import java.util.HashMap;

public class TerminalServers {

    private HashMap<String, Terminal> terminalList;
    private Terminal rootTerminal;
    private Terminal serverConnectedTo;

    public TerminalServers(HashMap<String, Terminal> terminalList, Terminal rootTerminal) {
        this.terminalList = terminalList;
        this.rootTerminal = rootTerminal;
        this.serverConnectedTo = rootTerminal;
    }

    public void connectToDifferentServer(String serverName) {
        prettifyConnection(serverName);
        Terminal target = terminalList.get(serverName);
        serverConnectedTo = target;
        rootTerminal = target;

    }

    public Terminal getServerConnectedTo() {
        return serverConnectedTo;
    }

    public Terminal getRootTerminal() {
        return rootTerminal;
    }

    public void prettifyConnection(String serverName) {
        for (int i = 0; i < 5; i++) {
            System.out.print("█");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("Connected to " + serverName);
    }

}
