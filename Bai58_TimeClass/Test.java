package Bai58_TimeClass;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Phuoc
 */
public class Test {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
    for(int i = 0; i < 100; i++) {
            System.out.println("TEST");
    }
    long t2 = System.currentTimeMillis();
    
    System.out.println("Truoc khi chay for: "+t1);
    System.out.println("Sau khi chay for: "+t2);
    System.out.println("Thoi gian: "+ (t2 - t1)+" mls ");
    System.out.println("Thoi gian: "+((t2 - t1)/1000)+" s ");
    
    //TimeUnit
        System.out.println("3000 nam = "+TimeUnit.DAYS.toSeconds(3000*365)+"s");
        System.out.println("25h = "+TimeUnit.HOURS.toSeconds(25)+"s");
        
    //Date
    Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDate()+"/" + (d.getMonth()+1) + "/" + (d.getYear()+1900));
    
    //Calendar
    Calendar c = Calendar.getInstance();
    System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH)+1) + "-" + c.get(Calendar.YEAR));
    
    //Thoi gian sau 30h nua tu hien tai
    c.add(Calendar.HOUR, 30);
    System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH)+1) + "-" + c.get(Calendar.YEAR));
    
    //Thoi gian sau 14 ngay nua ke tu bay gio
    c.add(Calendar.DATE, 14);
    System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH)+1) + "-" + c.get(Calendar.YEAR));
    
    //DateFormat
    DateFormat df = new SimpleDateFormat();
    System.out.println(df.format(d));
    
    df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(d));
    
    } 
}
