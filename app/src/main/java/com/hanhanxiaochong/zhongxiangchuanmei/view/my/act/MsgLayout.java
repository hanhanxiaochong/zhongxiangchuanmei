package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.config.CommonAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.config.OnItemClickListener;
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

public class MsgLayout extends BaseLayout {

    @BindView(R.id.recyclerview_msg)
    RecyclerView recyclerviewMsg;

    private MsgAdapter msgAdapter;

    public MsgLayout(Context context) {
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
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        msgAdapter = new MsgAdapter(mContext, R.layout.item_msg_announcement, list1);
        recyclerviewMsg.setAdapter(msgAdapter);
        msgAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(CommonAdapter arg0, int arg1) {
                Intent intent = new Intent(mContext, AnnouncementInfoActivity.class);
                mContext.startActivity(intent);
            }
        });
    }

}
