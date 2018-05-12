package com.hanhanxiaochong.zhongxiangchuanmei.view.order.act;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/2.
 * Desc   : 订单待收货act
 */

public class OrderWaitTakeDeliveryActivity extends BaseActivity {

    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
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
    @BindView(R.id.txt_order_way)
    TextView txtOrderWay;
    @BindView(R.id.ll_wait_takedelivery)
    LinearLayout llWaitTakedelivery;
    @BindView(R.id.txt_check_product)
    TextView txtCheckProduct;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_order_wait_takedelivery);
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

    @OnClick({R.id.ll_leftview, R.id.img_location, R.id.img_phone, R.id.txt_check, R.id
            .txt_confirm, R.id.txt_check_product})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.img_location:
                break;
            case R.id.img_phone:
                break;
            case R.id.txt_check:
                break;
            case R.id.txt_confirm:
                break;
            case R.id.txt_check_product:
                break;
        }
    }
}
