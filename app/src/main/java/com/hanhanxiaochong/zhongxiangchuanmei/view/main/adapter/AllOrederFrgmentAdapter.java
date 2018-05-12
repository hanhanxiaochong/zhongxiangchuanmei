package com.hanhanxiaochong.zhongxiangchuanmei.view.main.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseFragment;

import java.util.ArrayList;

/**
 * Created by dahei on 2018/1/2.
 */

public class AllOrederFrgmentAdapter extends FragmentPagerAdapter {

    private final ArrayList<BaseFragment> datas;
    private String[] titles;

    public AllOrederFrgmentAdapter(FragmentManager fm, ArrayList<BaseFragment> datas, String [] titles) {
        super(fm);
        this.datas=datas;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return datas.get(position);
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
