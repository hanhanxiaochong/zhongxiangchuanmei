package com.hanhanxiaochong.zhongxiangchuanmei.bean.base;

import android.content.Context;

import com.hanhanxiaochong.zhongxiangchuanmei.util.SharedPreferencesUtil;


/**
 * Created by dahei on 2017/10/18.
 * 构建请求的数据
 */

public class RequestModelBuilder {

    private RequestModel model=RequestModel.getInstance();
    //构建请求的头
    public RequestModelBuilder buildHead(Context mContext){
        PostHead head=new PostHead(mContext);
        head.setToken(SharedPreferencesUtil.getsInstances(mContext).getString("token",""));
        model.setHead(head);
        return this;
    }

    //构建请求的model参数
    public RequestModelBuilder buildRequest(RequestBase request){
        model.setBiz(request);
        return this;
    }

    //构建类
    public RequestModel builder(){
        return model;
    }
}
