package com.hanhanxiaochong.zhongxiangchuanmei.view.shop.act;

import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.config.CommonAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.config.OnItemClickListener;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.main.act.ShopEvent;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.MsgActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.shop.adapter.ShopNextFirstAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.view.shop.adapter.ShopNextSecondAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import de.greenrobot.event.EventBus;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/9.
 * Desc   : 商品二级页面
 */

public class ShopNextActivity extends BaseActivity {


    @BindView(R.id.et_home_search)
    EditText etHomeSearch;
    @BindView(R.id.recyclerview_first)
    RecyclerView recyclerviewFirst;
    @BindView(R.id.recyclerview_second)
    RecyclerView recyclerviewSecond;


    private ShopNextFirstAdapter shopNextFirstAdapter;
    private ShopNextSecondAdapter ShopNextSecondAdapter;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_shop_next);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        recyclerviewFirst.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerviewSecond.setLayoutManager(new GridLayoutManager(mContext, 3));

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        shopNextFirstAdapter = new ShopNextFirstAdapter(mContext, R.layout.item_shopnext_first,
                list);
        ShopNextSecondAdapter = new ShopNextSecondAdapter(mContext, R.layout.item_shopnext_second,
                list);
        ShopNextSecondAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(CommonAdapter arg0, int arg1) {
                EventBus.getDefault().post(new ShopEvent());
                finish();
            }
        });
        recyclerviewFirst.setAdapter(shopNextFirstAdapter);
        recyclerviewSecond.setAdapter(ShopNextSecondAdapter);

    }

    @OnClick({R.id.ll_left, R.id.img_home_msg})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_left:
                finish();
                break;
            case R.id.img_home_msg:
                Intent intent = new Intent(mContext, MsgActivity.class);
                startActivity(intent);
                break;
        }
    }
}
