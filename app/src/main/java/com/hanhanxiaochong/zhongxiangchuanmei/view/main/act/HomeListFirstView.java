package com.hanhanxiaochong.zhongxiangchuanmei.view.main.act;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseLayout;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.act.HotProjectDetailActivity;

import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/11.
 * Desc   :
 */

public class HomeListFirstView extends BaseLayout {

    public HomeListFirstView(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.item_home_list_hotproject;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {

    }

    @OnClick({R.id.ll_one, R.id.ll_two, R.id.ll_three, R.id.ll_four})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_one:
                Intent intent = new Intent(mContext, HotProjectDetailActivity.class);
                mContext.startActivity(intent);
                break;
            case R.id.ll_two:
                Intent intent1 = new Intent(mContext, HotProjectDetailActivity.class);
                mContext.startActivity(intent1);
                break;
            case R.id.ll_three:
                Intent intent2 = new Intent(mContext, HotProjectDetailActivity.class);
                mContext.startActivity(intent2);
                break;
            case R.id.ll_four:
                Intent intent3 = new Intent(mContext, HotProjectDetailActivity.class);
                mContext.startActivity(intent3);
                break;
        }
    }
}
