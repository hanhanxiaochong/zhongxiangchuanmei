package com.hanhanxiaochong.zhongxiangchuanmei.view.home.act;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/23.
 * Desc   :
 */

public class HomeVipActivity extends BaseActivity {

    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_home_vip);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();

    }

    private void setTopView() {
        imgLeft.setImageResource(R.mipmap.icon_close_black);
        txtTitle.setText("会员专享");
    }


    @OnClick({R.id.ll_leftview, R.id.btn_recharge})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.btn_recharge:
                break;
        }
    }
}
