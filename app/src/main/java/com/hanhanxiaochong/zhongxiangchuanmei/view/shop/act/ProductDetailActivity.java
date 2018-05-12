package com.hanhanxiaochong.zhongxiangchuanmei.view.shop.act;

import android.content.Intent;
import android.view.View;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.act.CommentsActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.act.ShareDialog;

import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/2.
 * Desc   :
 */

public class ProductDetailActivity extends BaseActivity {
    @Override
    protected void initView() {
        setContentView(R.layout.activity_product_detail);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {

    }

    @OnClick({R.id.ll_back, R.id.img_share, R.id.img_shoppingcar, R.id.ll_comments, R.id
            .txt_buynow})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_back:
                break;
            case R.id.img_share:
                ShareDialog shareDialog = new ShareDialog(mContext);
                shareDialog.show();
                break;
            case R.id.img_shoppingcar:
                showTip("加入购物车");
                break;
            case R.id.ll_comments:
                Intent intent = new Intent(mContext, CommentsActivity.class);
                startActivity(intent);
                break;
            case R.id.txt_buynow:
                Intent intent1 = new Intent(mContext, PayDetailActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
