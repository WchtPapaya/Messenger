package com.db.edu.connection;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Connector extends ObjectConnection {

    @Override
    public void connect() {
        try {
            Socket socket = new Socket(InetAddress.getLoopbackAddress(), 55555);
            System.out.println("Connected to the Server");
            output = new ObjectOutputStream((socket.getOutputStream()));
            input = new ObjectInputStream((socket.getInputStream()));
        } catch (IOException e) {
            System.out.println("Connection with server lost");
        }
    }
}
