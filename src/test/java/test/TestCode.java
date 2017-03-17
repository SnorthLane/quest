package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eric on 2017/2/20.
 */
public class TestCode {

    @Test
    public void test1(){
        List list = new ArrayList();
        list.add("qqyumidi");
        list.add("corn");
        list.add(100);

        for (int i = 0; i < list.size(); i++) {
//            String name = (String) list.get(i); // 1
            System.out.println("name:" + list.get(i));
        }
    }
}
