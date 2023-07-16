// Write a progtam to display the current date and time in a specific format
// i.e   Now : 2017/06/16 08:52:03.066
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
public class CurrentDataTime {
    public static void main(String... args){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY/MM/DD hh:mm:ss.sss");
        simpleDateFormat.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        System.out.println("Now : " + simpleDateFormat.format(System.currentTimeMillis()));
    }
}
