package com.hanhanxiaochong.zhongxiangchuanmei.view.home.act;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.adapter.CommentsAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/2.
 * Desc   :
 */

public class CommentsActivity extends BaseActivity {
    @BindView(R.id.img_left)
    ImageView imgLeft;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.recyclerview_comments)
    RecyclerView recyclerviewComments;

    private CommentsAdapter commentsAdapter;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_comments_detail);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        setTopView();
        List<String> list = new ArrayList<>();
        list.add("");list.add("");list.add("");
        recyclerviewComments.setLayoutManager(new LinearLayoutManager(mContext));
        commentsAdapter = new CommentsAdapter(mContext, R.layout.item_comments, list);
        recyclerviewComments.setAdapter(commentsAdapter);
    }

    private void setTopView() {
        imgLeft.setImageResource(R.mipmap.icon_close_black);
        txtTitle.setText("项目评价");
    }

    @OnClick(R.id.ll_leftview)
    public void onViewClicked() {
        finish();
    }
}
