package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.adapter.MyInviteAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/9.
 * Desc   :
 */

public class MyInviteActivity extends BaseActivity {
    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.recyclerview_myinvite)
    RecyclerView recyclerviewMyinvite;

    private MyInviteAdapter myInviteAdapter;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_my_invite);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();
        List<String> list = new ArrayList<>();
        list.add(""); list.add(""); list.add(""); list.add("");
        recyclerviewMyinvite.setLayoutManager(new LinearLayoutManager(mContext));
        myInviteAdapter = new MyInviteAdapter(mContext, R.layout.item_my_invite, list);
        recyclerviewMyinvite.setAdapter(myInviteAdapter);
    }

    private void setTopView() {
        imgLeft.setImageResource(R.mipmap.icon_close_black);
        txtTitle.setText("我的邀请");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.ll_leftview)
    public void onViewClicked() {
        finish();
    }
}
