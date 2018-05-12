package com.hanhanxiaochong.zhongxiangchuanmei.view.main.act;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.gyf.barlibrary.ImmersionBar;
import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.main.adapter.MainPagerAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.widget.CustomViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.main_viewpager)
    CustomViewPager mainViewpager;
    @BindView(R.id.rb_home)
    RadioButton rbHome;
    @BindView(R.id.rb_shop)
    RadioButton rbShop;
    @BindView(R.id.rb_order)
    RadioButton rbOrder;
    @BindView(R.id.rb_my)
    RadioButton rbMy;
    @BindView(R.id.main_bottom_btn)
    RadioGroup mainBottomBtn;

    private List<View> viewList = new ArrayList<>();
    private MainPagerAdapter mainPagerAdapter;
    private LinearLayout homeLayout;
    private LinearLayout shopLayout;
    private LinearLayout orderLayout;
    private LinearLayout myLayout;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        homeLayout = new HomeLayout(mContext);
        shopLayout = new ShopLayout(mContext);
        orderLayout = new OrderLayout(mContext);
        myLayout = new MyLayout(mContext);
        viewList.add(homeLayout);
        viewList.add(shopLayout);
        viewList.add(orderLayout);
        viewList.add(myLayout);

        mainPagerAdapter = new MainPagerAdapter(viewList);
        mainViewpager.setAdapter(mainPagerAdapter);

        mainBottomBtn.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_home:
                        ImmersionBar.with(MainActivity.this)
                                .fitsSystemWindows(true)
                                .statusBarColor(R.color.white)
                                .statusBarDarkFont(true)
                                .init(); //解决状态栏和布局重叠问题;
                        mainViewpager.setCurrentItem(0);
                        break;
                    case R.id.rb_shop:
                        ImmersionBar.with(MainActivity.this)
                                .fitsSystemWindows(true)
                                .statusBarColor(R.color.white)
                                .statusBarDarkFont(true)
                                .init(); //解决状态栏和布局重叠问题;
                        mainViewpager.setCurrentItem(1);
                        break;
                    case R.id.rb_order:
                        ImmersionBar.with(MainActivity.this)
                                .fitsSystemWindows(true)
                                .statusBarColor(R.color.white)
                                .statusBarDarkFont(true)
                                .init(); //解决状态栏和布局重叠问题;
                        mainViewpager.setCurrentItem(2);
                        break;
                    case R.id.rb_my:
                        ImmersionBar.with(MainActivity.this)
                                .fitsSystemWindows(true)
                                .statusBarColor(R.color.pink)
                                .statusBarDarkFont(false)
                                .init(); //解决状态栏和布局重叠问题;
                        mainViewpager.setCurrentItem(3);
                        break;
                }
            }
        });
    }

//    @OnClick({R.id.rb_home, R.id.rb_shop, R.id.rb_order, R.id.rb_my})
//    public void onViewClicked(View view) {
//        switch (view.getId()) {
//            case R.id.rb_home:
//                rbHome.setClickable(true);
//                mainViewpager.setCurrentItem(0);
//                break;
//            case R.id.rb_shop:
//                rbShop.setClickable(true);
//                mainViewpager.setCurrentItem(1);
//                break;
//            case R.id.rb_order:
//                rbOrder.setClickable(true);
//                mainViewpager.setCurrentItem(2);
//                break;
//            case R.id.rb_my:
//                rbMy.setClickable(true);
//                mainViewpager.setCurrentItem(3);
//                break;
//        }
//    }

}
