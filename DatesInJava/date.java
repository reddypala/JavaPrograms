package DatesInJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {
    public static void main(String[] args) {

        // To print current date and time in the java
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate = sdf.format(d);
        System.out.println("The date in Format MMM/dd/yyyy:" + formattedDate);

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println(sdf1.format(cal.getTime()));
        int currentDay = cal.get(Calendar.DAY_OF_MONTH);
        int currentMonth = cal.get(Calendar.MONTH);
        int currentYear = cal.get(Calendar.YEAR);
        int currentDayOfWeek = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println("The currentDay is:"+currentDay);
        System.out.println("The currentMonth is:"+currentMonth); //since java counts months from 0 as Jan, 1 as Feb etc
        System.out.println("The currentYear is:"+currentYear);
        System.out.println("The currentDayOfweek is:"+currentDayOfWeek);


    }
}
