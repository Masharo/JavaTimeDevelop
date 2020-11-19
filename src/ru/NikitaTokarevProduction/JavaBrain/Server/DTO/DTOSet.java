package ru.NikitaTokarevProduction.JavaBrain.Server.DTO;

import java.util.Calendar;

public class DTOSet extends DTOObject {

    public DTOSet(DTOObject dtoObject) {

        super(dtoObject);
    }

    public void setStatus() {

        if (status) {

            setWorkTime();
        } else {

            setAllTime();
        }
    }

    private void setAllTime() {

        this.allTime = workTime - Calendar.getInstance().getTimeInMillis();
    }

    private void setWorkTime() {

        this.workTime = Calendar.getInstance().getTimeInMillis();
    }
}
