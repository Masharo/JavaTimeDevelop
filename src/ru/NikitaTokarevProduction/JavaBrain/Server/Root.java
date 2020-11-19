package ru.NikitaTokarevProduction.JavaBrain.Server;

import ru.NikitaTokarevProduction.JavaBrain.Server.DTO.DTOObject;
import ru.NikitaTokarevProduction.JavaBrain.Server.DTO.DTOSet;

import java.io.ObjectInputStream;
import java.net.Socket;

public class Root extends SettingsApp implements Runnable {

    private final Socket socket;

    public Root(Socket socket) {

        super(socket.getInetAddress());
        this.socket = socket;
    }

    @Override
    public void run() {

        DTOObject InetDtoObject = getObject();

        FileOperator fileOperator = new FileOperator(InetDtoObject);
        DTOObject FileDtoObject = fileOperator.loadFile();

        if (fileOperator.needSave(FileDtoObject.isStatus())) {

            DTOSet dtoSet = new DTOSet(InetDtoObject);
            dtoSet.setStatus();
            InetDtoObject = dtoSet.getThis();
            fileOperator.saveFile(InetDtoObject);
        } else {


        }


    }

    private DTOObject getObject() {

        DTOObject dtoObject = null;

        try {

            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
            dtoObject = (DTOObject) objectInputStream.readObject();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return dtoObject;
    }
}
