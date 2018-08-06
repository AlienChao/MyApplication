package com.example.mylibrary;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ConfigTimeUtil {

    public static final int SECONDS_IN_DAY = 60 * 60 * 24;
    public static final long MILLIS_IN_DAY = 1000L * SECONDS_IN_DAY;
    //
    public static boolean isSameDayOfMillis(final long ms1, final long ms2) {

        final long interval = ms1 - ms2;
        return interval < MILLIS_IN_DAY
                && interval > -1L * MILLIS_IN_DAY
                && toDay(ms1) == toDay(ms2);
    }

    private static long toDay(long millis) {
        return (millis + TimeZone.getDefault().getOffset(millis)) / MILLIS_IN_DAY;
    }

    public static boolean isSameDayOfMillisStr(String str) {
        boolean flag =false;
       // Log.i("aPay-config", "isSameDayOfMillisStr: "+getDateStr() +"-str:"+str);

        if(str.equals(getDateStr())){
            flag =true;
        }
        return flag;
    }
    public static String getDateStr() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");// HH:mm:ss
        //获取当前时间
        Date date = new Date(System.currentTimeMillis());
        return simpleDateFormat.format(date);
    }


}
