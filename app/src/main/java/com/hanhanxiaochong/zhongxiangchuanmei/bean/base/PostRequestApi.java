package com.hanhanxiaochong.zhongxiangchuanmei.bean.base;

import com.hanhanxiaochong.zhongxiangchuanmei.config.HttpPostService;
import com.wzgiceman.rxretrofitlibrary.retrofit_rx.Api.BaseApi;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2017/10/16.
 * Desc   :
 */

public class PostRequestApi extends BaseApi {

    private String json;
    private String mMethod;

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public PostRequestApi(String method){
        this.mMethod = method;
        setMothed(mMethod);
    }

    @Override
    public Observable getObservable(Retrofit retrofit) {
        HttpPostService service = retrofit.create(HttpPostService.class);
        return service.postConection(mMethod, getJson());
    }
}
