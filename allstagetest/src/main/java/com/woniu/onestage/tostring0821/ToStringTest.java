package com.woniu.onestage.tostring0821;
import java.util.Date;

/**
 * ToStringTest
 */

public class ToStringTest {

    public static void main(String[] args) {
        
        //
        Person p1 = new Person("tom", 20);
        System.out.println(p1.toString());
        System.out.println(p1); //杈撳嚭鈥滃湴鍧�淇℃伅鈥�

        //toString鏂规硶琚噸鍐�
        String str = new String("abc");
        System.out.println(str); //杈撳嚭鍐呭
        
        Date d = new Date(); 
        System.out.println(d); //杈撳嚭鍐呭
    }
}