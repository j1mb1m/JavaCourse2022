package by.itacademy.hw12.task5.timehandler;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentDataTime {

    public static String getDataTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        return sdf.format(cal.getTime());
    }

}
