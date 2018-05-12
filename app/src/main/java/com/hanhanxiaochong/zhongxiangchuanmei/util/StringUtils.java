package com.hanhanxiaochong.zhongxiangchuanmei.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @version 1.0
 * @Author SunnyCoffee
 * @Date 2014-1-28
 * @Desc 工具类
 */

public class StringUtils {
    private static StringUtils mInstance;
    public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DEFAULT_FORMAT_DATE = "yyyy-MM-dd";

    public static StringUtils getsInstances() {
        if (mInstance == null) {
            mInstance = new StringUtils();
        }
        return mInstance;
    }

    public String formattime(String millisecond) {
        int mi = Integer.parseInt(millisecond);
        int second = mi / 1000;
        int hh = second / 3600;
        int mm = second % 3600 / 60;
        int ss = second % 60;
        String str = null;
        if (hh != 0) {
            str = String.format("%02d:%02d\'%02d\"", hh, mm, ss);//至少两位的十进制数
        } else if (hh == 0&& mm!=0){
            str = String.format("%02d\'%02d\"", mm, ss);
        }else {
            str = String.format("%02d\"", ss);
        }
        return str;
    }
    public static String getCurrentTime(String format) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.getDefault());
        String currentTime = sdf.format(date);
        return currentTime;
    }

    public static String getOtherDay(int diff) {
        Calendar mCalendar = Calendar.getInstance();
        mCalendar.add(Calendar.DATE, diff);
        return getDateFormat(mCalendar.getTime());
    }
    public static String getDateFormat(Date date) {
        return dateSimpleFormat(date, defaultDateFormat.get());
    }
    public static String dateSimpleFormat(Date date, SimpleDateFormat format) {
        if (format == null)
            format = defaultDateTimeFormat.get();
        return (date == null ? "" : format.format(date));
    }
    public static final ThreadLocal<SimpleDateFormat> defaultDateTimeFormat = new ThreadLocal<SimpleDateFormat>() {

        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DEFAULT_DATE_TIME_FORMAT);
        }

    };
    public static final ThreadLocal<SimpleDateFormat> defaultDateFormat = new ThreadLocal<SimpleDateFormat>() {

        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DEFAULT_FORMAT_DATE);
        }

    };

    public static String datestring(String time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date(Long.parseLong(time));
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        String dangqian = sdf.format(gc.getTime());
        return dangqian;
    }
    public static String formatDateTime(String time) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        if(time==null ||"".equals(time)){
            return "";
        }
        Date date = null;
        try {
            date = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar current = Calendar.getInstance();

        Calendar today = Calendar.getInstance();	//今天

        today.set(Calendar.YEAR, current.get(Calendar.YEAR));
        today.set(Calendar.MONTH, current.get(Calendar.MONTH));
        today.set(Calendar.DAY_OF_MONTH,current.get(Calendar.DAY_OF_MONTH));
        //  Calendar.HOUR——12小时制的小时数 Calendar.HOUR_OF_DAY——24小时制的小时数
        today.set( Calendar.HOUR_OF_DAY, 0);
        today.set( Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);

        Calendar yesterday = Calendar.getInstance();	//昨天

        yesterday.set(Calendar.YEAR, current.get(Calendar.YEAR));
        yesterday.set(Calendar.MONTH, current.get(Calendar.MONTH));
        yesterday.set(Calendar.DAY_OF_MONTH,current.get(Calendar.DAY_OF_MONTH)-1);
        yesterday.set( Calendar.HOUR_OF_DAY, 0);
        yesterday.set( Calendar.MINUTE, 0);
        yesterday.set(Calendar.SECOND, 0);

        current.setTime(date);

        if(current.after(today)){
            return time.split(" ")[1];
        }else if(current.before(today) && current.after(yesterday)){

            return "昨天 "+time.split(" ")[1];
        }else{
            int index = time.indexOf("-")+1;
            return time.substring(index, time.length());
        }
    }
    public static boolean isEmpty(String value) {
        if (value != null && !value.equals("")
                && !value.equals("null")) {
            return true;
        }
        return false;
    }

    public static String getCurrentTime() {
        return getCurrentTime("yyyy-MM-dd  HH:mm:ss");
    }

    public static String covertDateToString2(Date date) {

        return dateToString(date, "yyyy-MM-dd");

    }
    public static String dateToString(Date date, String formatStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        try {
            return sdf.format(date);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static String stringFilter(String str) throws PatternSyntaxException {
        String regEx = "[\\s]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("");
    }

    public static String getAfterTwo(){
        Date dNow = new Date();   //当前时间
        Date dBefore = new Date();
        Calendar calendar = Calendar.getInstance();  //得到日历
        calendar.setTime(dNow);//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH, +2);  //设置为前一天
        dBefore = calendar.getTime();   //得到前一天的时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String format = sdf.format(dBefore);
            return format ;
    }

    /*
 * 毫秒转化时分秒毫秒
 */
    public static String formatTime(Long ms) {
//        Integer ss = 1000;
//        Integer mi = ss * 60;
//        Integer hh = mi * 60;
//        Integer dd = hh * 24;

        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        String xxx = format.format(ms);

//        Long day = ms / dd;
//        Long hour = (ms - day * dd) / hh;
//        Long minute = (ms - day * dd - hour * hh) / mi;
//        Long second = (ms - day * dd - hour * hh - minute * mi) / ss;
//        Long milliSecond = ms - day * dd - hour * hh - minute * mi - second * ss;
//
//        StringBuffer sb = new StringBuffer();
//        if(hour > 0) {
//            sb.append(hour);
//        }
//        if(minute > 0) {
//            sb.append(minute);
//        }
        return xxx;
    }
}
