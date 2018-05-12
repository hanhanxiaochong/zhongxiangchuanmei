package com.hanhanxiaochong.zhongxiangchuanmei.view.main.act;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseLayout;
import com.hanhanxiaochong.zhongxiangchuanmei.view.main.adapter.OrderAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/12.
 * Desc   :
 */

public class ShopViews extends BaseLayout {

    @BindView(R.id.points_order_recyclerview)
    RecyclerView pointsOrderRecyclerview;
    @BindView(R.id.smart)
    SmartRefreshLayout smart;


    private OrderAdapter orderAdapter;
    private int i;
    private String type;

    public ShopViews(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_points_allorder;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        List<String> s1 = new ArrayList<>();
        s1.add("1");
        s1.add("2");
        pointsOrderRecyclerview.setLayoutManager(new LinearLayoutManager(mContext));
//        orderAdapter = new OrderAdapter(getContext(), R.layout.item_order, s1);
        pointsOrderRecyclerview.setAdapter(orderAdapter);
    }

    public void setPosition(int i){
        this.i = i;
    }

}
