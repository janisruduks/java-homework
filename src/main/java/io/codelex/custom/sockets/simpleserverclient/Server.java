package io.codelex.custom.sockets.simpleserverclient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(5000);
            Socket socket = server.accept();
            DataInputStream connected = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String line = "";
            while (!line.equals("End")) {
                try {
                    line = connected.readUTF();
                    if (line.equals("marco")) {
                        System.out.println("polo");
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Closing connection");
            socket.close();
            server.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
