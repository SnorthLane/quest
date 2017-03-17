package test;

import java.text.ParseException;

/**
 * Created by Eric on 2017/3/10.
 */
public class MyClass {
    private int num = 0;

    public static void main(String args[]) throws ParseException {
        MyClass m1 = new MyClass();
        System.out.print( m1.strToInt("10") );
        System.out.println( m1.strToInt(m1.num + "1") );

        DateTest test = new DateTest();
        test.testDate();
    }

    public int strToInt( String num ) {
        this.num = Integer.parseInt(num);
        return this.num;
    }
}