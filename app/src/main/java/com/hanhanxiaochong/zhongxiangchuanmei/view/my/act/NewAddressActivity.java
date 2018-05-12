package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/9.
 * Desc   :
 */

public class NewAddressActivity extends BaseActivity {
    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.txt_right)
    TextView txtRight;
    @BindView(R.id.edit_name)
    EditText editName;
    @BindView(R.id.edit_phone)
    EditText editPhone;
    @BindView(R.id.text_address)
    TextView textAddress;
    @BindView(R.id.rlayout_address)
    RelativeLayout rlayoutAddress;
    @BindView(R.id.edit_address)
    EditText editAddress;
    @BindView(R.id.checkbox)
    CheckBox checkbox;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_newaddress);
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
        txtTitle.setText("编辑");
        txtRight.setText("完成");
    }

    @OnClick({R.id.ll_leftview, R.id.ll_rightview, R.id.rlayout_address})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.ll_rightview:
                Intent intent = new Intent(mContext, AddressActivity.class);
                intent.putExtra("result", "result");
                startActivity(intent);
                break;
            case R.id.rlayout_address:
                break;
        }
    }
}
