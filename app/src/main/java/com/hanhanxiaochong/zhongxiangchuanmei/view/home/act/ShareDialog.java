package com.hanhanxiaochong.zhongxiangchuanmei.view.home.act;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.util.SupportMultipleScreensUtil;

import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/2.
 * Desc   :
 */

public class ShareDialog extends Dialog {

    private Context mContext;
    private View view;


    public ShareDialog(@NonNull Context context) {
        super(context);
        this.mContext = context;
    }

    public ShareDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected ShareDialog(@NonNull Context context, boolean cancelable, @Nullable
            OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view =  LayoutInflater.from(mContext).inflate(R.layout.dialog_share, null);
        SupportMultipleScreensUtil.scale(view);
        setContentView(view);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //一定要在setContentView之后调用，否则无效
        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        //设置dialog大小
//        Window dialogWindow = getWindow();
//        WindowManager manager = ((BaseActivity) mContext).getWindowManager();
//        //获取dialog的当前参数
//        WindowManager.LayoutParams params = dialogWindow.getAttributes();
//        params.width = WindowManager.LayoutParams.MATCH_PARENT;
//        params.height = WindowManager.LayoutParams.MATCH_PARENT;
//        dialogWindow.setAttributes(params);
////        setContentView(R.layout.dialog_share);
    }

    @OnClick({R.id.view_black, R.id.ll_close, R.id.ll_wechat, R.id.ll_moments, R.id.ll_weibo, R
            .id.ll_qq})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.view_black:
                dismiss();
                break;
            case R.id.ll_close:
                dismiss();
                break;
            case R.id.ll_wechat:
                break;
            case R.id.ll_moments:
                break;
            case R.id.ll_weibo:
                break;
            case R.id.ll_qq:
                break;
        }
    }
}
