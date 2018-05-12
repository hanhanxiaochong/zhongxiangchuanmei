package com.hanhanxiaochong.zhongxiangchuanmei.view.main.act;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseLayout;
import com.hanhanxiaochong.zhongxiangchuanmei.view.main.adapter.ShopAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.MsgActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.shop.act.ShopNextActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import de.greenrobot.event.EventBus;
import de.greenrobot.event.Subscribe;
import de.greenrobot.event.ThreadMode;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/5.
 * Desc   :
 */

public class ShopLayout extends BaseLayout {
    @BindView(R.id.et_home_search)
    EditText etHomeSearch;
    @BindView(R.id.ll_shaixuan)
    LinearLayout llShaixuan;
    @BindView(R.id.recyclerview_shop)
    RecyclerView recyclerviewShop;
    @BindView(R.id.ll_mianmo)
    RelativeLayout llMianmo;
    @BindView(R.id.ll_yanshuang)
    RelativeLayout llYanshuang;
    @BindView(R.id.ll_xiezhuang)
    RelativeLayout llXiezhuang;
    @BindView(R.id.img_home_msg)
    ImageView imgHomeMsg;
    @BindView(R.id.ll_one)
    LinearLayout llOne;
    @BindView(R.id.ll_two)
    LinearLayout llTwo;
    @BindView(R.id.txt_hot)
    TextView txtHot;
    @BindView(R.id.rl_hot)
    RelativeLayout rlHot;
    @BindView(R.id.txt_mianmo)
    TextView txtMianmo;

    private ShopAdapter shopAdapter;
    private String isFirst;

    public ShopLayout(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_shop;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        EventBus.getDefault().register(this);
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        recyclerviewShop.setLayoutManager(new LinearLayoutManager(mContext));
        shopAdapter = new ShopAdapter(mContext, R.layout.item_shop, list);
        recyclerviewShop.setAdapter(shopAdapter);

    }

    @OnClick(R.id.img_home_msg)
    public void onViewClicked() {
        Intent intent = new Intent(mContext, MsgActivity.class);
        mContext.startActivity(intent);
    }

    @OnClick({R.id.ll_mianmo, R.id.ll_yanshuang, R.id.ll_xiezhuang})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_mianmo:
                Intent intent = new Intent(mContext, ShopNextActivity.class);
                mContext.startActivity(intent);
                break;
            case R.id.ll_yanshuang:
                break;
            case R.id.ll_xiezhuang:
                break;
        }
    }

    @Subscribe(threadMode = ThreadMode.MainThread)
    public void helloEventBus(ShopEvent shopEvent) {
        llOne.setVisibility(INVISIBLE);
        llTwo.setVisibility(VISIBLE);
        txtHot.setTextColor(getResources().getColor(R.color.txt_black));
        txtMianmo.setTextColor(getResources().getColor(R.color.pink));
        llShaixuan.setVisibility(VISIBLE);
    }
}
