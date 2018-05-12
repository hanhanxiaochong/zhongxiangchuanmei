package com.hanhanxiaochong.zhongxiangchuanmei.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kang on 2017/8/14.
 */

public class NumUtil {
    SimpleDateFormat formatter    =   new SimpleDateFormat("yyyyMMdd");
    Date curDate = new Date(System.currentTimeMillis());//获取当前时间
    String strs = formatter.format(curDate);
    public String getStrs(){
        String str = curDate.getTime()+"";
        return str;
    }

    public String getNumber() {

        String strRand="" ;
        for(int i = 0;i < 8 ;i++){
            strRand += String.valueOf((int)(Math.random() * 10)) ;
        }
        String ordernum = "EW"+strs+strRand;
        return ordernum;
    }

    // 两次点击按钮之间的点击间隔不能少于1000毫秒
    private static final int MIN_CLICK_DELAY_TIME = 1000;
    private static long lastClickTime;

    public static boolean isFastClick() {
        boolean flag = false;
        long curClickTime = System.currentTimeMillis();
        if ((curClickTime - lastClickTime) >= MIN_CLICK_DELAY_TIME) {
            flag = true;
        }
        lastClickTime = curClickTime;
        return flag;
    }
}
