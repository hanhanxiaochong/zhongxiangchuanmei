package com.hanhanxiaochong.zhongxiangchuanmei.view.home.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/2.
 * Desc   :
 */

public class HotProjectDetailActivity extends BaseActivity {
    @Override
    protected void initView() {
        setContentView(R.layout.activity_hotproject_detail);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.img_share, R.id.img_favorite, R.id.ll_comments, R.id.rl_bottom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_share:
                ShareDialog shareDialog = new ShareDialog(mContext);
                shareDialog.show();
                break;
            case R.id.img_favorite:
                break;
            case R.id.ll_comments:
                Intent intent = new Intent(mContext, CommentsActivity.class);
                startActivity(intent);
                break;
            case R.id.rl_bottom:
                Intent intent1 = new Intent(mContext, ChooseShopActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
