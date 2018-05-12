package com.hanhanxiaochong.zhongxiangchuanmei.view.main.act;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gyf.barlibrary.ImmersionBar;
import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/10.
 * Desc   :
 */

public class MyWalletActivity extends BaseActivity {
    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.txt_right)
    TextView txtRight;
    @BindView(R.id.ll_rightview)
    RelativeLayout llRightview;
    @BindView(R.id.rl_topview)
    RelativeLayout rlTopview;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_my_wallet);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        ImmersionBar.with(MyWalletActivity.this).fitsSystemWindows(true).statusBarColor(R.color
                .red4).statusBarDarkFont(false).init(); //解决状态栏和布局重叠问题;
        rlTopview.setBackgroundColor(getResources().getColor(R.color.red4));
        imgLeft.setImageResource(R.mipmap.icon_close_white);
        txtTitle.setText("钱包");
        txtRight.setText("流水明细");
        txtTitle.setTextColor(getResources().getColor(R.color.white));
        txtRight.setTextColor(getResources().getColor(R.color.white));
    }

    @OnClick({R.id.ll_leftview, R.id.ll_rightview})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.ll_rightview:
                break;
        }
    }
}
