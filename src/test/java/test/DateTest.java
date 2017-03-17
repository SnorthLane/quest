package test;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Eric on 2017/3/7.
 */
public class DateTest {

    @Test
    protected void testDate() throws ParseException {
        Calendar c = Calendar.getInstance();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        long l1=df.parse(df.format(c.getTime())).getTime();

        System.out.println(df.format(c.getTime()));
        System.out.println(l1);
        //24*4*3600

        c.add(Calendar.DATE, 3);
        System.out.println(df.parse(df.format(c.getTime())).getTime());
    }
}
