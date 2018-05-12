package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

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
 * Time   : 2018/5/9.
 * Desc   : 我的收藏act
 */

public class MyFavoriteActivity extends BaseActivity implements ViewPager.OnPageChangeListener{
    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.view_left_line)
    View viewLeftLine;
    @BindView(R.id.view_right_line)
    View viewRightLine;
    @BindView(R.id.vp_favorite)
    ViewPager vpFavorite;

    private MyFavoriteShopLayout myFavoriteShopLayout;
    private MyFavoriteProjectLayout myFavoriteProjectLayout;
    private CommonVpAdapter commonVpAdapter;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_my_favorite);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();
        myFavoriteProjectLayout = new MyFavoriteProjectLayout(mContext);
        myFavoriteShopLayout = new MyFavoriteShopLayout(mContext);
        List<View> viewList = new ArrayList<>();
        viewList.add(myFavoriteProjectLayout);
        viewList.add(myFavoriteShopLayout);
        commonVpAdapter = new CommonVpAdapter(viewList);
        vpFavorite.setAdapter(commonVpAdapter);
        vpFavorite.setOnPageChangeListener(this);
    }

    private void setTopView() {
        imgLeft.setImageResource(R.mipmap.icon_left);
        txtTitle.setText("我的收藏");
    }

    private void resetState(){
        viewLeftLine.setVisibility(View.INVISIBLE);
        viewRightLine.setVisibility(View.INVISIBLE);
    }

    @OnClick({R.id.ll_leftview, R.id.ll_left, R.id.ll_right})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.ll_left:
                resetState();
                viewLeftLine.setVisibility(View.VISIBLE);
                vpFavorite.setCurrentItem(0);
                break;
            case R.id.ll_right:
                viewRightLine.setVisibility(View.VISIBLE);
                vpFavorite.setCurrentItem(1);
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        resetState();
        if (position == 0){
            viewLeftLine.setVisibility(View.VISIBLE);
        }else if (position == 1){
            viewRightLine.setVisibility(View.VISIBLE);
        }
        vpFavorite.setCurrentItem(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
