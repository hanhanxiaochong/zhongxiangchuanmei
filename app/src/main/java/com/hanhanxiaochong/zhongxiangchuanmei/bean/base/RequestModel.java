package com.hanhanxiaochong.zhongxiangchuanmei.bean.base;


/**
 * Created by dahei on 2017/10/18.
 */

public class RequestModel {

    private PostHead head;
    private RequestBase biz;
    private static RequestModel model;

    //私有构造
    private RequestModel(){}

    //实现该类的单一
    public static RequestModel getInstance(){
        if(model==null){
            synchronized(RequestModel.class){
                if(model==null){
                    model=new RequestModel();
                }
            }
        }
        return model;
    }


    //设置头
    public void setHead(PostHead head) {
        this.head = head;
    }

    public PostHead getHead() {
        return head;
    }

    public RequestBase getBiz() {
        return biz;
    }

    //设置请求体
    public void setBiz(RequestBase biz) {
        this.biz = biz;
    }

}
