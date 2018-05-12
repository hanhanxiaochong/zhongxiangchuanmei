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
 * Time   : 2018/4/5.
 * Desc   : 登录act
 */

public class LoginActivity extends BaseActivity {
    @BindView(R.id.txt_login_way)
    TextView txtLoginWay;
    @BindView(R.id.et_phone_number)
    EditText etPhoneNumber;
    @BindView(R.id.txt_yanzheng)
    TextView txtYanzheng;
    @BindView(R.id.et_password)
    EditText etPassword;

    private boolean pwdFlag = false;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {

    }

    @OnClick({R.id.txt_regist, R.id.ll_qq_login, R.id.ll_wechat_login, R.id.ll_alipay_login, R.id.ll_sina_login, R.id.txt_login_way, R.id.txt_yanzheng, R.id.txt_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.txt_regist:
                Intent intent = new Intent(this, RegistActivity.class);
                startActivity(intent);
                break;
            case R.id.ll_qq_login:
                break;
            case R.id.ll_wechat_login:
                break;
            case R.id.ll_alipay_login:
                break;
            case R.id.ll_sina_login:
                break;
            case R.id.txt_login_way:
                if (pwdFlag){
                    pwdFlag = false;
                    txtYanzheng.setVisibility(View.GONE);
                    etPassword.setHint("密码");
                    txtLoginWay.setText("点击使用验证码登录");
                }else {
                    pwdFlag = true;
                    txtYanzheng.setVisibility(View.VISIBLE);
                    etPassword.setHint("验证码");
                    txtLoginWay.setText("点击使用密码登录");
                }
                break;
            case R.id.txt_yanzheng:
                break;
            case R.id.txt_login:
                Intent loginIntent = new Intent(this, MainActivity.class);
                startActivity(loginIntent);
                finish();
                break;
        }
    }
}
