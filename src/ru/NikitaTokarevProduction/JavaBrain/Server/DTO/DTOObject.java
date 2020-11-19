package ru.NikitaTokarevProduction.JavaBrain.Server.DTO;

public class DTOObject extends ReadingObject {

    protected boolean status;
    protected long allTime;
    protected long workTime;

    public DTOObject(boolean read) {

        super(read);
    }

    public DTOObject() {

        this(false);
    }

    public DTOObject(DTOObject dtoObject) {

        super(dtoObject.isRead());
        status = dtoObject.isStatus();
        workTime = dtoObject.getWorkTime();
        allTime = dtoObject.getAllTime();
    }

    @Override
    public boolean isStatus() {

        return this.status;
    }

    @Override
    public long getWorkTime() {

        return this.workTime;
    }

    @Override
    public long getAllTime() {

        return this.allTime;
    }
}
