package ru.NikitaTokarevProduction.JavaBrain.Server.DTO;

import java.util.Calendar;

public class DTOSet extends DTOObject {

    public DTOSet(DTOObject dtoObject) {

        super(dtoObject);
    }

    public void setStatus(boolean status) {

        if (this.status != status) {

            if (status) {

                setWorkTime();
            } else {

                setAllTime();
            }
        }
        this.status = status;
    }

    public void setAllTime() {

        this.allTime = workTime - Calendar.getInstance().getTimeInMillis();
    }

    public void setWorkTime() {

        this.workTime = Calendar.getInstance().getTimeInMillis();
    }
}
