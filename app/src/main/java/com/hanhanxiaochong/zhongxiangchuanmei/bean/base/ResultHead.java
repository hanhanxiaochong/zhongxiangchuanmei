package com.hanhanxiaochong.zhongxiangchuanmei.bean.base;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2017/9/11.
 * Desc   : 网络请求结果头部信息
 */

public class ResultHead {
    private int code;
    private String err;
    private String request_time;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public String getRequest_time() {
        return request_time;
    }

    public void setRequest_time(String request_time) {
        this.request_time = request_time;
    }
}
