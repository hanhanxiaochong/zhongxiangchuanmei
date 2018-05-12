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
 * Time   : 2018/4/19.
 * Desc   : 身份认证act
 */

public class IDCardRenzhengActivity extends BaseActivity {


    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.et_name)
    EditText etName;
    @BindView(R.id.et_idcard_number)
    EditText etIdcardNumber;
    @BindView(R.id.txt_front_side)
    TextView txtFrontSide;
    @BindView(R.id.txt_back_side)
    TextView txtBackSide;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_idcard_renzheng);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();
    }

    private void setTopView() {
        txtTitle.setText("身份认证");
        imgLeft.setImageResource(R.mipmap.icon_left);
    }

    @OnClick({R.id.ll_leftview, R.id.txt_front_side, R.id.txt_back_side, R.id.btn_confirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.txt_front_side:
                break;
            case R.id.txt_back_side:
                break;
            case R.id.btn_confirm:
                break;
        }
    }
}
