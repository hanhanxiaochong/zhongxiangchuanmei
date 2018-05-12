package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/17.
 * Desc   : 绑定手机号act
 */

public class BindPhoneActivity extends BaseActivity {
    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.txt_phone_number)
    TextView txtPhoneNumber;
    @BindView(R.id.et_phone_number)
    EditText etPhoneNumber;
    @BindView(R.id.txt_get_yanzhengma)
    TextView txtGetYanzhengma;
    @BindView(R.id.et_yanzheng)
    EditText etYanzheng;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_bind_phone);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();
    }

    private void setTopView() {
        txtTitle.setText("绑定手机号");
        imgLeft.setImageResource(R.mipmap.icon_left);
    }

    @OnClick({R.id.ll_leftview, R.id.txt_get_yanzhengma, R.id.btn_confirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.txt_get_yanzhengma:
                break;
            case R.id.btn_confirm:
                break;
        }
    }
}
