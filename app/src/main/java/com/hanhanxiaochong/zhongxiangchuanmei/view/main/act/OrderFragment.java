package com.hanhanxiaochong.zhongxiangchuanmei.view.main.act;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseFragment;
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

public class OrderFragment extends BaseFragment {

    @BindView(R.id.points_order_recyclerview)
    RecyclerView recycler;
    @BindView(R.id.smart)
    SmartRefreshLayout smart;

    private OrderAdapter orderAdapter;
    private List<String> s = new ArrayList<>();
    private int i;

    @Override
    protected View getMyView() {
        return LayoutInflater.from(getContext()).inflate(R.layout.fragment_points_allorder, null);
    }

    @Override
    protected void init() {
        switch (i){
            case 0:
                s.clear();
                s.add("3");
                orderAdapter = new OrderAdapter(getContext(), R.layout.item_order, s, 0);
                break;
            case 1:
                s.clear();
                s.add("1");
                s.add("2");
                s.add("3");
                orderAdapter = new OrderAdapter(getContext(), R.layout.item_order, s, 1);
                break;
            case 2:
                s.clear();
                s.add("1");
                s.add("2");
                orderAdapter = new OrderAdapter(getContext(), R.layout.item_order, s, 2);
                break;
            case 3:
                s.clear();
                s.add("1");
                s.add("2");
                s.add("3");
                s.add("3");
                orderAdapter = new OrderAdapter(getContext(), R.layout.item_order, s, 3);
                break;
            case 4:
                s.clear();
                s.add("1");
                s.add("2");
                s.add("3");
                s.add("1");
                s.add("2");
                s.add("3");
                orderAdapter = new OrderAdapter(getContext(), R.layout.item_order, s, 4);
                break;
        }
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        recycler.setAdapter(orderAdapter);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void listen() {

    }

    public void setPosition(int i) {
        this.i = i;
    }
}
