package com.hanhanxiaochong.zhongxiangchuanmei.view.shop.act;

import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.act.AppointmentSuccessActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/2.
 * Desc   :
 */

public class PayDetailActivity extends BaseActivity {
    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.cb_alipay)
    CheckBox cbAlipay;
    @BindView(R.id.cb_wechat)
    CheckBox cbWechat;
    @BindView(R.id.cb_bank)
    CheckBox cbBank;


    @Override
    protected void initView() {
        setContentView(R.layout.activity_paydetail);
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
        txtTitle.setText("立即下单");
    }


    @OnClick({R.id.ll_leftview, R.id.txt_confirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.txt_confirm:
                Intent intent = new Intent(mContext, AppointmentSuccessActivity.class);
                intent.putExtra("result", "1");
                startActivity(intent);
                break;
        }
    }
}
