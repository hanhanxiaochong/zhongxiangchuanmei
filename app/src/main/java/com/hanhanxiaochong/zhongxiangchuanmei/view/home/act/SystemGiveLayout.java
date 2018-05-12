package com.hanhanxiaochong.zhongxiangchuanmei.view.home.act;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseLayout;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.adapter.SystemGiveAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/30.
 * Desc   : 我的礼包--系统赠送
 */

public class SystemGiveLayout extends BaseLayout {

    @BindView(R.id.recyclerview_sys)
    RecyclerView recyclerviewSys;

    private SystemGiveAdapter systemGiveAdapter;

    public SystemGiveLayout(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_system_give;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        List<String> list = new ArrayList<>();
        list.add("");
        recyclerviewSys.setLayoutManager(new LinearLayoutManager(mContext));
        systemGiveAdapter = new SystemGiveAdapter(mContext, R.layout.item_sys_give, list);
        recyclerviewSys.setAdapter(systemGiveAdapter);
    }
}
