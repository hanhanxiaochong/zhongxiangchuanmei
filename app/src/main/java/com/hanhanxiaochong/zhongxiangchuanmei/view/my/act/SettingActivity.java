package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.main.act.LoginActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/17.
 * Desc   : 系统设置act
 */

public class SettingActivity extends BaseActivity {

    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.txt_trush)
    TextView txtTrush;
    @BindView(R.id.txt_version_code)
    TextView txtVersionCode;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_setting);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();
    }

    private void setTopView() {
        txtTitle.setText("设置");
        imgLeft.setImageResource(R.mipmap.icon_left);
    }

    @OnClick({R.id.ll_leftview, R.id.ll_update_userinfo, R.id.ll_bind_phone, R.id
            .ll_userinfo_check, R.id.ll_update_loginpwd, R.id.ll_update_paypwd, R.id.ll_clear, R
            .id.ll_check_update, R.id.btn_exit_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.ll_update_userinfo:
                Intent intent = new Intent(this, UpdateUserInfoActivity.class);
                startActivity(intent);
                break;
            case R.id.ll_bind_phone:
                Intent bindIntent = new Intent(this, BindPhoneActivity.class);
                startActivity(bindIntent);
                break;
            case R.id.ll_userinfo_check:
                Intent idIntent = new Intent(this, IDCardRenzhengActivity.class);
                startActivity(idIntent);
                break;
            case R.id.ll_update_loginpwd:
                break;
            case R.id.ll_update_paypwd:
                break;
            case R.id.ll_clear:
                break;
            case R.id.ll_check_update:
                break;
            case R.id.btn_exit_login:
                Intent intent1 = new Intent(this, LoginActivity.class);
                startActivity(intent1);
                finish();
                break;
        }
    }
}
