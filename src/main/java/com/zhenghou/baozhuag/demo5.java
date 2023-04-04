package com.zhenghou.baozhuag;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo5 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));


        Calendar c = Calendar.getInstance();
        c.set(2015,1,1);
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));




    }
}

