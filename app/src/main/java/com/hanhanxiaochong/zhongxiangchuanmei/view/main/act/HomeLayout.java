package com.hanhanxiaochong.zhongxiangchuanmei.view.main.act;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseLayout;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.act.HomeVipActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.act.HotProjectActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.act.MyGiftsActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.act.NearbyShopActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.main.adapter.HomeListAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.MsgActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/5.
 * Desc   :
 */

public class HomeLayout extends BaseLayout {

    @BindView(R.id.txt_city)
    TextView txtCity;
    @BindView(R.id.et_home_search)
    EditText etHomeSearch;
    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    private HomeListAdapter homeListAdapter;

    public HomeLayout(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_home;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        List<String> list = new ArrayList<>();
        list.add("热门推荐");
        list.add("会员专享");
        list.add("畅销项目");
        recyclerview.setLayoutManager(new LinearLayoutManager(mContext));
        homeListAdapter = new HomeListAdapter(mContext, R.layout.item_home_list, list);
        recyclerview.setAdapter(homeListAdapter);


    }

    @OnClick({R.id.txt_city, R.id.img_home_msg, R.id.ll_home_announcement, R.id.ll_home_vip, R.id
            .ll_home_nearby_shop, R.id.ll_home_hotproject, R.id.ll_home_mygifts})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.txt_city:
                break;
            case R.id.img_home_msg:
                Intent intent = new Intent(mContext, MsgActivity.class);
                mContext.startActivity(intent);
                break;
            case R.id.ll_home_announcement:
                Intent intent1 = new Intent(mContext, MsgActivity.class);
                mContext.startActivity(intent1);
                break;
            case R.id.ll_home_vip:
                Intent intent2 = new Intent(mContext, HomeVipActivity.class);
                mContext.startActivity(intent2);
                break;
            case R.id.ll_home_nearby_shop:
                Intent intent3 = new Intent(mContext, NearbyShopActivity.class);
                mContext.startActivity(intent3);
                break;
            case R.id.ll_home_hotproject:
                Intent intent5 = new Intent(mContext, HotProjectActivity.class);
                mContext.startActivity(intent5);
                break;
            case R.id.ll_home_mygifts:
                Intent intent4 = new Intent(mContext, MyGiftsActivity.class);
                mContext.startActivity(intent4);
                break;
        }
    }
}
