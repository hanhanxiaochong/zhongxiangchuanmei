package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.adapter.AddressAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/10.
 * Desc   :
 */

public class AlertCustomerActivity extends BaseActivity {
    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.recyclerview_alertcustomer)
    RecyclerView recyclerviewAlertcustomer;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_alert_customer);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        imgLeft.setImageResource(R.mipmap.icon_left);
        txtTitle.setText("订单管理");

        List<String> list = new ArrayList<>();
        list.add("");list.add("");
        AddressAdapter addressAdapter = new AddressAdapter(mContext, R.layout.item_alert_customer, list);
        recyclerviewAlertcustomer.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerviewAlertcustomer.setAdapter(addressAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.ll_leftview)
    public void onViewClicked() {
        finish();
    }
}
