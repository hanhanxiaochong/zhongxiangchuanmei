package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/16.
 * Desc   : 公告详情act
 */

public class AnnouncementInfoActivity extends BaseActivity {

    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.txt_time)
    TextView txtTime;
    @BindView(R.id.txt_content)
    TextView txtContent;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_announcementinfo);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {

    }

    @OnClick(R.id.ll_close)
    public void onViewClicked() {
        finish();
    }
}
