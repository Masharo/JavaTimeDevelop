package ru.NikitaTokarevProduction.JavaBrain.Server;

import ru.NikitaTokarevProduction.JavaBrain.Server.DTO.DTOObject;

public class FileOperator {

    private DTOObject dtoObject;

    public boolean needSave(boolean status) {

        return dtoObject.isStatus() != status;
    }

    public FileOperator(DTOObject dtoObject) {

        this.dtoObject = dtoObject;
    }

    public void saveFile(DTOObject dtoObject) {


    }

    public DTOObject loadFile() {

        return new DTOObject();
    }
}
