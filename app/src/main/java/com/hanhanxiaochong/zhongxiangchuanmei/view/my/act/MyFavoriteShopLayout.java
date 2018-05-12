package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseLayout;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.adapter.AddressAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/9.
 * Desc   :
 */

public class MyFavoriteShopLayout extends BaseLayout {

    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    private AddressAdapter addressAdapter;

    public MyFavoriteShopLayout(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_recyclerview;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        recyclerview.setLayoutManager(new LinearLayoutManager(mContext));
        addressAdapter = new AddressAdapter(mContext, R.layout.item_nearby_shop, list);
        recyclerview.setAdapter(addressAdapter);

    }
}
