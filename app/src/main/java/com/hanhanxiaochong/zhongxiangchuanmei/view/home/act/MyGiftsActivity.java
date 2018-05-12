package com.hanhanxiaochong.zhongxiangchuanmei.view.home.act;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.config.CommonVpAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/30.
 * Desc   : 我的礼包act
 */

public class MyGiftsActivity extends BaseActivity implements ViewPager.OnPageChangeListener{

    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.txt_system_give)
    TextView txtSystemGive;
    @BindView(R.id.txt_vip)
    TextView txtVip;
    @BindView(R.id.view_left_line)
    View viewLeftLine;
    @BindView(R.id.view_right_line)
    View viewRightLine;
    @BindView(R.id.vp_myGifts)
    ViewPager vpMyGifts;

    private SystemGiveLayout systemGiveLayout;
    private OnlyVipLayout onlyVipLayout;
    private CommonVpAdapter vpAdapter;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_my_gifts);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();
        List<View> viewList = new ArrayList<>();
        systemGiveLayout = new SystemGiveLayout(mContext);
        onlyVipLayout = new OnlyVipLayout(mContext);
        viewList.add(systemGiveLayout);
        viewList.add(onlyVipLayout);
        vpAdapter = new CommonVpAdapter(viewList);
        vpMyGifts.setAdapter(vpAdapter);
        vpMyGifts.setOnPageChangeListener(this);
    }

    private void setTopView() {
        imgLeft.setImageResource(R.mipmap.icon_close_black);
        txtTitle.setText("我的卡包");
    }


    @OnClick({R.id.ll_leftview, R.id.txt_system_give, R.id.txt_vip})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.txt_system_give:
                resetState();
                viewLeftLine.setVisibility(View.VISIBLE);
                vpMyGifts.setCurrentItem(0);
                break;
            case R.id.txt_vip:
                resetState();
                viewRightLine.setVisibility(View.VISIBLE);
                vpMyGifts.setCurrentItem(1);
                break;
        }
    }

    private void resetState() {
        viewLeftLine.setVisibility(View.INVISIBLE);
        viewRightLine.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        resetState();
        switch (position){
            case 0:
                viewLeftLine.setVisibility(View.VISIBLE);
                break;
            case 1:
                viewRightLine.setVisibility(View.VISIBLE);
                break;
        }
        vpMyGifts.setCurrentItem(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
