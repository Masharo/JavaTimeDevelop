package ru.NikitaTokarevProduction.JavaBrain.Server.DTO;

public abstract class ReadingObject implements DTOGet {

    private final boolean read;

    public ReadingObject(boolean read) {

        this.read = read;
    }

    @Override
    public boolean isRead() {

        return read;
    }
}
