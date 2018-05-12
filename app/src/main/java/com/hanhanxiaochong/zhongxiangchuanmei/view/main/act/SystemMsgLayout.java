package com.hanhanxiaochong.zhongxiangchuanmei.view.main.act;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseLayout;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.adapter.MsgAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/16.
 * Desc   :
 */

public class SystemMsgLayout extends BaseLayout {

    @BindView(R.id.recyclerview_msg)
    RecyclerView recyclerviewMsg;

    private MsgAdapter msgAdapter;

    public SystemMsgLayout(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_msg;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        recyclerviewMsg.setLayoutManager(new LinearLayoutManager(mContext));
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("2");
        list2.add("2");
        msgAdapter = new MsgAdapter(mContext, R.layout.item_msg_system, list2);
        recyclerviewMsg.setAdapter(msgAdapter);
    }
}
