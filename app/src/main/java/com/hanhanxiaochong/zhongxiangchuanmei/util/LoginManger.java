package com.hanhanxiaochong.zhongxiangchuanmei.util;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.hanhanxiaochong.zhongxiangchuanmei.view.main.act.LoginActivity;


/**
 * Created by dahei on 2018/1/15.
 * 登陆管理
 */

public class LoginManger {
    private static LoginManger manger;

    private LoginManger(){}

    public static LoginManger getInstance(){
        if(manger==null){
            synchronized (LoginManger.class){
                if(manger==null){
                    manger=new LoginManger();
                }
            }
        }
        return manger;
    }

    public boolean registe(Context context, boolean isMain){
        Log.e("IS_LOGIN",SharedPreferencesUtil.getsInstances(context).getString(Preferences.IS_LOGIN,"false"));
        if(SharedPreferencesUtil.getsInstances(context).getString(Preferences.IS_LOGIN,"false").equals("true")){
            return true;
        }else if (SharedPreferencesUtil.getsInstances(context).getString(Preferences.IS_LOGIN,"false").equals("false")){
            Intent intent = new Intent(context, LoginActivity.class);
            intent.putExtra("isMain", isMain);
            context.startActivity(intent);
        }
        return false;
    }

    public void unRegiste(Context context){
        if(context!=null){
            context=null;
        }
    }
}
