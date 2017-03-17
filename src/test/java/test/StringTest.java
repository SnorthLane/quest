package test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Eric on 2017/3/10.
 */
public class StringTest {

    @Test
    public void testStr(){
        String str1="abc";
        String str2="abc";
        System.out.println(str1 == str2);//true
        Assert.assertTrue(str1 == str2);

        String str3 = new String("abc");

        System.out.println(str1 == str3);//false
        System.out.println(str1.equals(str3));//true

        int a1 = 5;
        Integer b1 = 5;
        System.out.println(a1 == b1);

    }

    @Test
    public void testInt(){
        Integer a= 1000;
        Integer b = 1000;
        System.out.println(a==b);//false

        Integer c = 100;
        Integer d = 100;
        System.out.println(c==d);//true

        int e = 1000;
        Integer f = 1000;
        System.out.println(e == f);//true

    }

}
