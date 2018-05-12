package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/9.
 * Desc   : 意见反馈act
 */

public class MyFeedbackActivity extends BaseActivity {

    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.view_bottomline)
    View viewBottomline;
    @BindView(R.id.et_feedback)
    EditText etFeedback;
    @BindView(R.id.ll_write_feedback)
    LinearLayout llWriteFeedback;
    @BindView(R.id.ll_success)
    LinearLayout llSuccess;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_my_feedback);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();
    }

    private void setTopView() {
        imgLeft.setImageResource(R.mipmap.icon_close_black);
        txtTitle.setText("意见反馈");
        viewBottomline.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.ll_leftview, R.id.btn_confirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.btn_confirm:
                llWriteFeedback.setVisibility(View.GONE);
                llSuccess.setVisibility(View.VISIBLE);
                break;
        }
    }
}
