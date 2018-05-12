package com.hanhanxiaochong.zhongxiangchuanmei.view.home.act;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.config.CommonAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.config.OnItemClickListener;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.adapter.NearbyShopAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/23.
 * Desc   :
 */

public class NearbyShopActivity extends BaseActivity {

    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_nearby_shop);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        recyclerview.setLayoutManager(new LinearLayoutManager(mContext));
        NearbyShopAdapter adapter = new NearbyShopAdapter(mContext, R.layout.item_nearby_shop, list);
        recyclerview.setAdapter(adapter);
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(CommonAdapter arg0, int arg1) {
                startActivity(new Intent(NearbyShopActivity.this, NearbyShopDetailActivity.class));
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.ll_topleft)
    public void onViewClicked() {
        finish();
    }
}
