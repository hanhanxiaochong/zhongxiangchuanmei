package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.view.View;
import android.widget.CheckBox;
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
 * Desc   : 修改个人资料act
 */

public class UpdateUserInfoActivity extends BaseActivity {

    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.txt_right)
    TextView txtRight;
    @BindView(R.id.view_bottomline)
    View viewBottomline;
    @BindView(R.id.img_userhead)
    ImageView imgUserhead;
    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.cb_female)
    CheckBox cbFemale;
    @BindView(R.id.cb_male)
    CheckBox cbMale;
    @BindView(R.id.txt_age)
    TextView txtAge;
    @BindView(R.id.txt_area)
    TextView txtArea;
    @BindView(R.id.et_user_sign)
    EditText etUserSign;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_update_userinfo);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();
    }

    private void setTopView(){
        txtTitle.setText("个人资料");
        imgLeft.setImageResource(R.mipmap.icon_left);
        txtRight.setText("保存");
    }

    @OnClick({R.id.ll_leftview, R.id.ll_rightview, R.id.ll_update_userhead, R.id.ll_update_age, R
            .id.ll_update_area})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.ll_rightview:
                //todo
                break;
            case R.id.ll_update_userhead:
                break;
            case R.id.ll_update_age:
                break;
            case R.id.ll_update_area:
                break;
        }
    }
}
