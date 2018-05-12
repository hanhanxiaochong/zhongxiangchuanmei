package com.hanhanxiaochong.zhongxiangchuanmei.view.home.act;

import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/2.
 * Desc   : 立即预约act
 */

public class AppointmentActivity extends BaseActivity {
    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
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
        setContentView(R.layout.activity_appointment);
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
        txtTitle.setText("立即预约");
    }

    @OnClick({R.id.ll_leftview, R.id.ll_choose_technician, R.id.ll_choose_time, R.id
            .ll_choose_coupon, R.id.txt_appointment})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.ll_choose_technician:
                showTip("选择技师");
                break;
            case R.id.ll_choose_time:
                showTip("选择预约时间");
                break;
            case R.id.ll_choose_coupon:
                showTip("选择优惠券");
                break;
            case R.id.txt_appointment:
                Intent intent = new Intent(mContext, AppointmentSuccessActivity.class);
                intent.putExtra("result", "0");
                startActivity(intent);
                break;
        }
    }
}
