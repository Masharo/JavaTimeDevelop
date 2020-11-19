package ru.NikitaTokarevProduction.JavaBrain.Server;

import java.net.InetAddress;

public abstract class SettingsApp {

    public final static int PORT_IN = 4040;
    public final static int PORT_OUT = 4140;
    public final static String PATH_FILE = "";

    private final InetAddress address;

    public SettingsApp(InetAddress address) {

        this.address = address;
    }

    public InetAddress getAddress() {

        return address;
    }
}
