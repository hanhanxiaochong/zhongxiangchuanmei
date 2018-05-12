package com.hanhanxiaochong.zhongxiangchuanmei.view.home.act;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.adapter.HotProjectAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/2.
 * Desc   : 热门项目
 */

public class HotProjectActivity extends BaseActivity {

    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.recyclerview_hotproject)
    RecyclerView recyclerviewHotproject;
    @BindView(R.id.view_bottomline)
    View viewBottomline;

    private HotProjectAdapter hotProjectAdapter;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_hot_project);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");

        recyclerviewHotproject.setLayoutManager(new LinearLayoutManager(mContext));
        hotProjectAdapter = new HotProjectAdapter(mContext, R.layout.item_hot_project, list);
        recyclerviewHotproject.setAdapter(hotProjectAdapter);
    }

    private void setTopView() {
        imgLeft.setImageResource(R.mipmap.icon_left);
        txtTitle.setText("热门项目");
        viewBottomline.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.ll_leftview)
    public void onViewClicked() {
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
