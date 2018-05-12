package com.hanhanxiaochong.zhongxiangchuanmei.view.main.act;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.AlertCustomerActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.AlertOrderActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/10.
 * Desc   : 我是员工act
 */

public class MyAlertActivity extends BaseActivity {

    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_my_alert);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        imgLeft.setImageResource(R.mipmap.icon_left);
        txtTitle.setText("员工");
    }

    @OnClick({R.id.ll_leftview, R.id.ll_alert_order, R.id.ll_alert_customer, R.id
            .ll_alert_wallet, R.id.ll_alert_arrive})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.ll_alert_order:
                Intent intent = new Intent(mContext, AlertOrderActivity.class);
                startActivity(intent);
                break;
            case R.id.ll_alert_customer:
                Intent intent1 = new Intent(mContext, AlertCustomerActivity.class);
                startActivity(intent1);
                break;
            case R.id.ll_alert_wallet:
                break;
            case R.id.ll_alert_arrive:
                break;
        }
    }
}
