package com.hanhanxiaochong.zhongxiangchuanmei.view.main.act;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/16.
 * Desc   : 注册act
 */

public class RegistActivity extends BaseActivity {
    @BindView(R.id.et_phone_number)
    EditText etPhoneNumber;
    @BindView(R.id.txt_yanzheng)
    TextView txtYanzheng;
    @BindView(R.id.et_yanzheng)
    EditText etYanzheng;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.et_invite_code)
    EditText etInviteCode;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_regist);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {

    }

    @OnClick({R.id.txt_login, R.id.txt_yanzheng, R.id.txt_regist, R.id.txt_user_agreement})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.txt_login:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.txt_yanzheng:
                break;
            case R.id.txt_regist:
                break;
            case R.id.txt_user_agreement:
                break;
        }
    }
}
