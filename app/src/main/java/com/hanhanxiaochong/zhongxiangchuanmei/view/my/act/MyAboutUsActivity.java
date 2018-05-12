package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.act.ShareDialog;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.adapter.AddressAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/9.
 * Desc   : 关于我们act
 */

public class MyAboutUsActivity extends BaseActivity {


    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.recyclerview_aboutus)
    RecyclerView recyclerviewAboutus;
    @BindView(R.id.img_right)
    ImageView imgRight;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_my_aboutus);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();
        List<String> list = new ArrayList<>();
        list.add("");list.add("");list.add("");list.add("");
        recyclerviewAboutus.setLayoutManager(new LinearLayoutManager(mContext));
        AddressAdapter addressAdapter = new AddressAdapter(mContext, R.layout.item_my_aboutus, list);
        recyclerviewAboutus.setAdapter(addressAdapter);
    }

    private void setTopView() {
        imgLeft.setImageResource(R.mipmap.icon_left);
        imgRight.setImageResource(R.mipmap.icon_share);
        txtTitle.setText("关于我们");
    }

    @OnClick({R.id.ll_leftview, R.id.ll_rightview})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.ll_rightview:
                ShareDialog shareDialog = new ShareDialog(mContext);
                shareDialog.show();
                break;
        }
    }
}
