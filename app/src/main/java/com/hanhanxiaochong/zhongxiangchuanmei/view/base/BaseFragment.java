package com.hanhanxiaochong.zhongxiangchuanmei.view.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.hanhanxiaochong.zhongxiangchuanmei.presenter.base.BasePresenter;
import com.hanhanxiaochong.zhongxiangchuanmei.util.SupportMultipleScreensUtil;
import com.hanhanxiaochong.zhongxiangchuanmei.widget.MyProgressDialog;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by dahei on 2017/9/13.
 */

public abstract class BaseFragment<P extends BasePresenter> extends Fragment {
    protected P mPresenter;
    private Toast toast;
    protected View parentView;
    private MyProgressDialog progress;

    private Unbinder unbinder;
    private View myView;

    protected boolean isVisible;
    private boolean isPrepared;
    private boolean isFirst = true;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = getMyView();
        ButterKnife.bind(this, myView);
        unbinder = ButterKnife.bind(this, myView);
        return myView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        isPrepared = true;
//        init();
        screenAdapter();
//        initPresenter();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(getUserVisibleHint()){
            isVisible = true;
            lazyLoad();
        }else{
            isVisible = false;
            onInvisible();
        }

    }

    /*
    * fagment被制为空的时候处理这个方法
    * 不必实现
    */
    protected void onInvisible(){}

    /**
     * 懒加载
     */
    protected void lazyLoad(){
        if(!isPrepared || !isVisible || !isFirst){
            return;
        }
        initPresenter();
        init();
//        initDatas();
//        isFirst = false;
    }


    @Override
    public void onStart() {
        super.onStart();
//        screenAdapter();
    }

    @Override
    public void onResume() {
        super.onResume();
        if(getUserVisibleHint()){
            setUserVisibleHint(true);
        }
        listen();
    }

    //获取fragment的view
    protected abstract View getMyView();

    //fragment的屏幕适配
    private void screenAdapter() {
        SupportMultipleScreensUtil.scale(getView());
    }
    //初始化操作
    protected abstract void init();
    //处理数据
    protected void initDatas(){}
    //处理后台逻辑
    protected abstract void initPresenter();
    //设置各个控件的监听
    protected abstract void listen();

    protected synchronized void increaToast(String msg) {
        if(toast==null){
            toast = Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT);
            toast.show();
        }else{
            toast.setText(msg);
            toast.show();
        }
    }

    //显示加载框
    protected void openProgress(){
        if (progress == null) {
            progress = new MyProgressDialog(getContext());
        }
        if (!progress.isShowing()) {
            progress.show();
        }
    }

    //关闭加载框
    protected void closeProgress(){
        if(progress!=null&&progress.isShowing()){
            progress.dismiss();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(progress!=null){
            progress=null;
        }
        unbinder.unbind();
    }
}
