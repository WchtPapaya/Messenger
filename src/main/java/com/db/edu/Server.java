package com.db.edu;

import com.db.edu.connection.Acceptor;
import com.db.edu.controller.MessageController;

public class Server {
    static public void main(String[] args) {
           Acceptor acceptor = new Acceptor(new MessageController(), 55555, 3);
           acceptor.accept();
    }
}
