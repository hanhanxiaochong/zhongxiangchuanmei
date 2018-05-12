package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.adapter.AddressAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/10.
 * Desc   :
 */

public class MyVipActivity extends BaseActivity {
    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.txt_right)
    TextView txtRight;
    @BindView(R.id.recyclerview_myvip)
    RecyclerView recyclerviewMyvip;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_my_vip);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        imgLeft.setImageResource(R.mipmap.icon_close_black);
        txtTitle.setText("会员");
        txtRight.setText("申请成为发起人");
        txtRight.setTextSize(12);

        List<String> list = new ArrayList<>();
        list.add("");list.add("");
        AddressAdapter addressAdapter = new AddressAdapter(mContext, R.layout.item_hot_project, list);
        recyclerviewMyvip.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerviewMyvip.setAdapter(addressAdapter);

    }


    @OnClick({R.id.ll_leftview, R.id.ll_rightview})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.ll_rightview:
                break;
        }
    }
}
