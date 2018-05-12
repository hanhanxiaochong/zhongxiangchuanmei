package com.hanhanxiaochong.zhongxiangchuanmei.bean.base;

import android.content.Context;

import com.hanhanxiaochong.zhongxiangchuanmei.util.StringUtils;
import com.hanhanxiaochong.zhongxiangchuanmei.util.VersionManagementUtil;

import java.util.Date;

import cn.finalteam.toolsfinal.coder.MD5Coder;


/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2017/9/11.
 * Desc   : 网络请求头部信息
 */

public class PostHead {
    //每个项目编码
    private String app_code;
    //后台版本
    private String app_version;
    //请求发起时间戳
    private String response_time;
    //
    private String app_sign;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    private String token;

    public PostHead(Context context){
        app_code = "OuSoft@EW";
        app_version = String.valueOf(VersionManagementUtil.getVersionCode(context));
        response_time = StringUtils.dateToString(new Date(System.currentTimeMillis()), "yyyy-MM-dd HH:mm:ss");
        app_sign = MD5Coder.getMD5Code(app_code + response_time + "key_01");
    };


    public String getApp_code() {
        return app_code;
    }

    public void setApp_code(String app_code) {
        this.app_code = app_code;
    }

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }

    public String getResponse_time() {
        return response_time;
    }

    public void setResponse_time(String response_time) {
        this.response_time = response_time;
    }

    public String getApp_sign() {
        return app_sign;
    }

    public void setApp_sign(String app_sign) {
        this.app_sign = app_sign;
    }
}
