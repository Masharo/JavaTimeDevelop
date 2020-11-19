package ru.NikitaTokarevProduction.JavaBrain.Server;

import java.net.ServerSocket;

public class InetLive {

    public static void main(String[] args) {

        new InetLive().run();
    }

    private void run() {

        try {

            ServerSocket serverSocket = new ServerSocket(SettingsApp.PORT_IN);

            while (true) {

                serverSocket.accept();

            }
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }
}
