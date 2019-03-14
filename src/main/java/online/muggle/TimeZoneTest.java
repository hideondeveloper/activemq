package online.muggle;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneTest {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = calendar.getTimeZone();
        String id = timeZone.getID();
        System.out.println(id);
    }
}
