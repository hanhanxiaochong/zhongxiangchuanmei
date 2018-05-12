package com.hanhanxiaochong.zhongxiangchuanmei.view.home.act;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseLayout;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.adapter.OnlyVipAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/30.
 * Desc   : 我的礼包--会员专享
 */

public class OnlyVipLayout extends BaseLayout {

    @BindView(R.id.recyclerview_vip)
    RecyclerView recyclerviewVip;

    private OnlyVipAdapter onlyVipAdapter;

    public OnlyVipLayout(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_onlyvip;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {

        List<String> list = new ArrayList<>();
        list.add("");
        recyclerviewVip.setLayoutManager(new LinearLayoutManager(mContext));
        onlyVipAdapter = new OnlyVipAdapter(mContext, R.layout.item_onlyvip, list);
        recyclerviewVip.setAdapter(onlyVipAdapter);
    }
}
