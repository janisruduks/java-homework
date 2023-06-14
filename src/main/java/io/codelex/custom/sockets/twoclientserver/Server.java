package io.codelex.custom.sockets.twoclientserver;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(5000);
            Runnable user1 = () -> {
                try {
                    Socket socket = server.accept();
                    System.out.println("Client 1 connected.");
                    serverConnection(socket);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            };
            Runnable user2 = () -> {
                try {
                    Socket socket = server.accept();
                    System.out.println("Client 2 connected.");
                    serverConnection(socket);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            };

            new Thread(user1).start();
            new Thread(user2).start();
            System.out.println("Waiting for clients...");


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void serverConnection(Socket socket) {
        try {
            DataInputStream connected = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String line = "";
            while (!line.equals("End")) {
                try {
                    line = connected.readUTF();
                    System.out.println(line);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Closing connection");
            socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
