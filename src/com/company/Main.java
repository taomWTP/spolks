package com.company;

public class Main {

    public static void main(String[] args) {
        TCPServer server = new TCPServer(Integer.parseInt(args[0]));

        while (server.run() == 1) { }


    }
}
