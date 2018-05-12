package com.hanhanxiaochong.zhongxiangchuanmei.view.my.act;

import android.support.v4.view.ViewPager;
import android.view.View;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.config.CommonVpAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.main.act.SystemMsgLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/16.
 * Desc   : 消息act
 */

public class MsgActivity extends BaseActivity implements ViewPager.OnPageChangeListener{

    @BindView(R.id.view_left_dot)
    View viewLeftDot;
    @BindView(R.id.view_right_dot)
    View viewRightDot;
    @BindView(R.id.view_left_line)
    View viewLeftLine;
    @BindView(R.id.view_right_line)
    View viewRightLine;
    @BindView(R.id.vp_msg)
    ViewPager vpMsg;

    private CommonVpAdapter commonVpAdapter;


    @Override
    protected void initView() {
        setContentView(R.layout.activity_msg);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {
        List<View> viewList = new ArrayList<>();
        MsgLayout msgLayout = new MsgLayout(this);
        SystemMsgLayout systemMsgLayout = new SystemMsgLayout(this);
        viewList.add(msgLayout);
        viewList.add(systemMsgLayout);
        commonVpAdapter = new CommonVpAdapter(viewList);
        vpMsg.setAdapter(commonVpAdapter);
        vpMsg.setOnPageChangeListener(this);

    }

    @OnClick({R.id.ll_close, R.id.ll_announcement, R.id.ll_system_msg})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_close:
                finish();
                break;
            case R.id.ll_announcement:
                resetState();
                viewLeftLine.setVisibility(View.VISIBLE);
                viewRightDot.setVisibility(View.VISIBLE);
                vpMsg.setCurrentItem(0);
                break;
            case R.id.ll_system_msg:
                viewRightLine.setVisibility(View.VISIBLE);
                viewLeftDot.setVisibility(View.VISIBLE);
                vpMsg.setCurrentItem(1);
                break;
        }
    }

    private void resetState(){
        viewLeftDot.setVisibility(View.INVISIBLE);
        viewLeftLine.setVisibility(View.INVISIBLE);
        viewRightDot.setVisibility(View.INVISIBLE);
        viewRightLine.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        resetState();
        if (position == 0){
            viewLeftLine.setVisibility(View.VISIBLE);
            viewRightDot.setVisibility(View.VISIBLE);
            vpMsg.setCurrentItem(0);
        }else if (position == 1){
            viewRightLine.setVisibility(View.VISIBLE);
            viewLeftDot.setVisibility(View.VISIBLE);
            vpMsg.setCurrentItem(1);
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
