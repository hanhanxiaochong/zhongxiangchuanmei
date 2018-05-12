package com.hanhanxiaochong.zhongxiangchuanmei.view.main.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/12.
 * Desc   :
 */

public class ShopPagerAdapter extends PagerAdapter {

    private List<View> viewList;
    private String[] titles;

    public ShopPagerAdapter(List<View> views){
        this.viewList = views;
    }


    @Override
    public int getCount() {
        return viewList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(viewList.get(position));

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = viewList.get(position);
        container.addView(view);
        return view;
    }
}
