import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TimeTest {

/**
 * Main Method
 */
public static void main(String[] args) {
    System.out.println(getTheTime());
}


/**
 * @return String in format "hh:mm:ss.SSS"
 */
public static String getTheTime()
{
    // Create a DateFormatter object for displaying date in specified format.
    SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss.SSS");

    // Create a calendar object that will convert the date and time value in milliseconds to date. 
     Calendar calendar = Calendar.getInstance();
     calendar.setTimeInMillis(System.currentTimeMillis());
     return formatter.format(calendar.getTime());
}
}
