package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

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
 * Time   : 2018/5/10.
 * Desc   : 联系我们act
 */

public class MyCallUsActivity extends BaseActivity {

    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_my_callus);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        imgLeft.setImageResource(R.mipmap.icon_left);
        txtTitle.setText("修改支付密码");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.ll_leftview, R.id.txt_callus})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.txt_callus:
                break;
        }
    }
}
