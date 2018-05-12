package com.hanhanxiaochong.zhongxiangchuanmei.view.main.act;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseFragment;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseLayout;
import com.hanhanxiaochong.zhongxiangchuanmei.view.main.adapter.AllOrederFrgmentAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.view.main.adapter.OrderFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/5.
 * Desc   :
 */

public class OrderLayout extends BaseLayout {

    @BindView(R.id.vp_content)
    ViewPager vpContent;
    @BindView(R.id.tl_tab)
    TabLayout tlTab;

    private MainActivity activity;
    private OrderFragmentAdapter fragmentAdapter;
    public OrderLayout(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_order;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        activity = (MainActivity) mContext;
        String[] titles = new String[]{"待付款", "待服务", "待收货", "待评价", "全部"};
        List<View> datas = new ArrayList<>();
        ArrayList<BaseFragment> fragments = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            OrderFragment orderFragment = new OrderFragment();
            orderFragment.setPosition(i);
            fragments.add(orderFragment);
//            ShopViews allFragment = new ShopViews(mContext);
//            datas.add(allFragment);
        }

        vpContent.setAdapter(new AllOrederFrgmentAdapter(activity.getSupportFragmentManager(), fragments, titles));
//
//        fragmentAdapter = new OrderFragmentAdapter()
//        vpContent.setAdapter(new ShopPagerAdapter(datas));
//
        tlTab.setTabMode(TabLayout.GRAVITY_CENTER);
        tlTab.setupWithViewPager(vpContent);
    }
}
