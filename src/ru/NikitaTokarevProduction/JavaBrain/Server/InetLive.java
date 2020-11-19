package ru.NikitaTokarevProduction.JavaBrain.Server;

import java.net.ServerSocket;
import java.net.Socket;

public class InetLive {

    public static void main(String[] args) {

        new InetLive().run();
    }

    private void run() {

        try {

            ServerSocket serverSocket = new ServerSocket(SettingsApp.PORT_IN);

            while (true) {

                Socket socket = serverSocket.accept();

                Thread thread = new Thread(new Root(socket));
                thread.start();

            }
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }
}
