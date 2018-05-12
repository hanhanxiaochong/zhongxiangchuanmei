package com.hanhanxiaochong.zhongxiangchuanmei.view.home.act;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/2.
 * Desc   : 预约成功act
 */

public class AppointmentSuccessActivity extends BaseActivity {

    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.txt_code)
    TextView txtCode;
    @BindView(R.id.txt_service)
    TextView txtService;
    @BindView(R.id.txt_order)
    TextView txtOrder;
    @BindView(R.id.txt_shopping)
    TextView txtShopping;
    @BindView(R.id.txt_state)
    TextView txtState;
    @BindView(R.id.txt_notice)
    TextView txtNotice;

    private String result;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_appointment_success);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        result = getIntent().getStringExtra("result");
        setTopView();
    }

    private void setTopView() {
        imgLeft.setImageResource(R.mipmap.icon_close_black);
        if (result.equals("0")){
            txtTitle.setText("预约成功");
        }else if (result.equals("1")){
            txtTitle.setText("下单成功");
            txtState.setText("下单成功");
            txtCode.setVisibility(View.GONE);
            txtNotice.setText("请尽快到店取货");
        }
    }

    @OnClick({R.id.ll_leftview, R.id.txt_service, R.id.txt_order, R.id.txt_shopping})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.txt_service:
                break;
            case R.id.txt_order:
                break;
            case R.id.txt_shopping:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
