package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.util.StringUtils;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.adapter.AddressAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/9.
 * Desc   :
 */

public class AddressActivity extends BaseActivity {
    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.txt_right)
    TextView txtRight;
    @BindView(R.id.recycler_address)
    RecyclerView recyclerAddress;
    @BindView(R.id.layout_addressyes)
    LinearLayout layoutAddressyes;
    @BindView(R.id.txt_down_create)
    TextView txtDownCreate;
    @BindView(R.id.layout_addressno)
    LinearLayout layoutAddressno;

    private AddressAdapter addressAdapter;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_addressmanagement);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();

        String result = getIntent().getStringExtra("result");
        if (StringUtils.isEmpty(result)){
            layoutAddressno.setVisibility(View.GONE);
            layoutAddressyes.setVisibility(View.VISIBLE);
            List<String> list = new ArrayList<>();
            list.add("");
            list.add("");
            recyclerAddress.setLayoutManager(new LinearLayoutManager(mContext));
            addressAdapter = new AddressAdapter(mContext, R.layout.item_address, list);
            recyclerAddress.setAdapter(addressAdapter);

        }else {
            layoutAddressyes.setVisibility(View.GONE);
            layoutAddressno.setVisibility(View.VISIBLE);
        }
    }

    private void setTopView() {
        imgLeft.setImageResource(R.mipmap.icon_left);
        txtTitle.setText("管理收货地址");
        txtRight.setText("创建");
    }

    @OnClick({R.id.ll_leftview, R.id.ll_rightview, R.id.txt_down_create})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_leftview:
                finish();
                break;
            case R.id.ll_rightview:
                Intent intent = new Intent(mContext, NewAddressActivity.class);
                startActivity(intent);
                break;
            case R.id.txt_down_create:
                Intent intent1 = new Intent(mContext, NewAddressActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
