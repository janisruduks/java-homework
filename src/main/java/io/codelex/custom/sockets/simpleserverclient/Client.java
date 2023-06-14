package io.codelex.custom.sockets.simpleserverclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 5000);
        System.out.println("connected");

        DataInputStream input = new DataInputStream(System.in);
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        String line = "";

        while (!line.equals("End")) {
            line = input.readLine();
            output.writeUTF(line);
        }

        try {
            input.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
