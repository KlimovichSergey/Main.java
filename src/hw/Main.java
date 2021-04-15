package hw;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(" Current day " + today );
        System.out.println(" Next day date " + today.plusDays(1));

        System.out.println(" Day after 5 weeks "+ today.plusWeeks(5));
        System.out.println(" 2 months ago " + today.minusMonths(2));

        LocalTime timeNow = LocalTime.now();
        System.out.println(" Current time " + timeNow);
        System.out.println(" Through 12 hours " + timeNow.plusHours(12));

        Calendar cal = Calendar.getInstance();
        int endDay = cal.getActualMaximum(Calendar.DATE);
        System.out.println(" Last day month " + endDay);

        LocalDate lastDate = LocalDate.of(2021,12,31);
        long day = ChronoUnit.DAYS.between(today,lastDate);
        System.out.println(" Until the end of the years " + day + " days");

        Date date = new Date();
        String DATE_FORMAT = " MMMM dd yyyy ";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        System.out.println(sdf.format(date));

        SimpleDateFormat sdf1 = new SimpleDateFormat(" dd MMM y");
        System.out.println(sdf1.format(date));

        SimpleDateFormat sdf2 = new SimpleDateFormat(" dd.MM.yy");
        System.out.println(sdf2.format(date));

        DateFormat format = new SimpleDateFormat(" dd.MM.yy H:mm");
        System.out.println(format.format(date));

        DateFormat df = new SimpleDateFormat(" d-M-y H:mm:ss.SSS");
        System.out.println(df.format(date));

        DateFormat df1 = new SimpleDateFormat(" dd.MM.yy H-mm-ss");
        System.out.println(df1.format(date));
        
    }
}
