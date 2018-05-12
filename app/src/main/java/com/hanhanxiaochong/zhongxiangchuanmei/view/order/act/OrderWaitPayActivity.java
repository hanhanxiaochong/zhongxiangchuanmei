package com.hanhanxiaochong.zhongxiangchuanmei.view.order.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.act.AppointmentSuccessActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/2.
 * Desc   : 订单待支付act
 */

public class OrderWaitPayActivity extends BaseActivity {

    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.txt_countdown)
    TextView txtCountdown;
    @BindView(R.id.txt_shopname)
    TextView txtShopname;
    @BindView(R.id.txt_order_number)
    TextView txtOrderNumber;
    @BindView(R.id.txt_order_state)
    TextView txtOrderState;
    @BindView(R.id.txt_order_phone)
    TextView txtOrderPhone;
    @BindView(R.id.txt_order_time)
    TextView txtOrderTime;
    @BindView(R.id.txt_money)
    TextView txtMoney;
    @BindView(R.id.cb_alipay)
    CheckBox cbAlipay;
    @BindView(R.id.cb_wechat)
    CheckBox cbWechat;
    @BindView(R.id.cb_bank)
    CheckBox cbBank;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_order_waitpay);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();
    }

    private void setTopView() {
        imgLeft.setImageResource(R.mipmap.icon_left);
        txtTitle.setText("订单详情");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.ll_leftview, R.id.img_location, R.id.img_phone, R.id.txt_pay})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.img_location:
                showTip("地图位置");
                break;
            case R.id.img_phone:
                break;
            case R.id.txt_pay:
                Intent intent = new Intent(this, AppointmentSuccessActivity.class);
                intent.putExtra("result", "0");
                startActivity(intent);
                break;
        }
    }
}
