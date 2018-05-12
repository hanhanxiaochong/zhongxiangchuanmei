package com.hanhanxiaochong.zhongxiangchuanmei.view.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.gyf.barlibrary.ImmersionBar;
import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.bean.base.PostRequestApi;
import com.hanhanxiaochong.zhongxiangchuanmei.bean.base.RequestBase;
import com.hanhanxiaochong.zhongxiangchuanmei.bean.base.RequestModel;
import com.hanhanxiaochong.zhongxiangchuanmei.bean.base.RequestModelBuilder;
import com.hanhanxiaochong.zhongxiangchuanmei.presenter.base.BasePresenter;
import com.hanhanxiaochong.zhongxiangchuanmei.util.AppManager;
import com.hanhanxiaochong.zhongxiangchuanmei.util.SupportMultipleScreensUtil;
import com.hanhanxiaochong.zhongxiangchuanmei.widget.MyProgressDialog;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by Administrator on 2017/1/4/0004.
 */

/**
 * Created by 36483 on 2016/12/19.
 */

public abstract class BaseActivity<P extends BasePresenter> extends RxAppCompatActivity implements IBaseView {
    protected P mPresenter;

    protected MyProgressDialog progressDialog;

    protected Context mContext;
    private static final String TAG = "BaseActivity";
    protected AppManager appManager;
    protected Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appManager = AppManager.getInstant();
        ImmersionBar.with(this)
                .fitsSystemWindows(true)
                .statusBarColor(R.color.white)
                .statusBarDarkFont(true)
                .init(); //解决状态栏和布局重叠问题;
        if((getIntent().getFlags() & Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0){
            finish();
            return;
        }
        mContext=this;
        initView();
        screenAdapter();
        ButterKnife.bind(this);
        initPresenter();
        init();
        appManager.addActivity(this);
        unbinder = ButterKnife.bind(this);
    }
    //加载完布局后进行屏幕适配
    private void screenAdapter() {
        View rootView=findViewById(android.R.id.content);
        SupportMultipleScreensUtil.init(getApplication());
        SupportMultipleScreensUtil.scale(rootView);
    }

    protected abstract void initView();

    protected abstract void initPresenter();

    protected abstract void init();

    @Override
    public void showTip(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loadFailure(String errorMsg) {

    }

    @Override
    public void loadSuccess(Object object) {

    }

    //请求网络
    protected void requestBaseNet(RequestBase hRequest, String http) {
        showLoadingDialog();
        PostRequestApi postRequestApi = new PostRequestApi(http);
        //请求参数的设置
        RequestModel model = new RequestModelBuilder()
                .buildRequest(hRequest)
                .buildHead(this)
                .builder();
        postRequestApi.setJson(JSON.toJSONString(model));
        mPresenter.startPost(this,postRequestApi);
    }

    protected void requestBaseNetNoHead(RequestBase hRequest, String http) {
        showLoadingDialog();
        PostRequestApi postRequestApi = new PostRequestApi(http);
        //请求参数的设置
        RequestModel model = new RequestModelBuilder()
                .buildRequest(hRequest)
                .builder();
        postRequestApi.setJson(JSON.toJSONString(model));
        mPresenter.startPost(this,postRequestApi);
    }

    @Override
    public void showLoadingDialog() {
        if (progressDialog == null) {
            progressDialog = new MyProgressDialog(this);
        }
        if (!isFinishing() && !progressDialog.isShowing()) {
            progressDialog.show();
        }
    }

    @Override
    public void closeLoadingDialog() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
//        ImmersionBar.with(this).destroy();
        unbinder.unbind();
    }

    //Android 界面点击其他部分隐藏弹出框
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if (isShouldHideInput(v, ev)) {

                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm != null) {
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
            return super.dispatchTouchEvent(ev);
        }
        // 必不可少，否则所有的组件都不会有TouchEvent了
        if (getWindow().superDispatchTouchEvent(ev)) {
            return true;
        }
        return onTouchEvent(ev);
    }

    public boolean isShouldHideInput(View v, MotionEvent event) {
        if (v != null && (v instanceof EditText)) {
            int[] leftTop = { 0, 0 };
            // 获取输入框当前的location位置
            v.getLocationInWindow(leftTop);
            int left = leftTop[0];
            int top = leftTop[1];
            int bottom = top + v.getHeight();
            int right = left + v.getWidth();
            if (event.getX() > left && event.getX() < right
                    && event.getY() > top && event.getY() < bottom) {
                // 点击的是输入框区域，保留点击EditText的事件
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

}
