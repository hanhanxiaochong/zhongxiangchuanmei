package com.hanhanxiaochong.zhongxiangchuanmei.view.main.act;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseLayout;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.AddressActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.MsgActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.MyAboutUsActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.MyCallUsActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.MyFavoriteActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.MyFeedbackActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.MyInviteActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.MyVipActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.SettingActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.my.act.UpdateUserInfoActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/5.
 * Desc   :
 */

public class MyLayout extends BaseLayout {

    @BindView(R.id.img_userhead)
    ImageView imgUserhead;
    @BindView(R.id.txt_username)
    TextView txtUsername;
    @BindView(R.id.txt_user_sign)
    TextView txtUserSign;

    public MyLayout(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_my;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void init() {

    }

    @OnClick({R.id.rl_set_userinfo, R.id.ll_my_vip, R.id.ll_my_wallet, R.id.ll_my_msg, R.id
            .ll_my_address, R.id.ll_my_favorites, R.id.ll_my_invite, R.id.ll_my_shopcar, R.id
            .ll_my_aboutus, R.id.ll_my_setting, R.id.ll_my_service, R.id.ll_my_alert, R.id
            .ll_my_feedback})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_set_userinfo:
                Intent userinfoIntent = new Intent(mContext, UpdateUserInfoActivity.class);
                mContext.startActivity(userinfoIntent);
                break;
            case R.id.ll_my_vip:
                Intent intent8 = new Intent(mContext, MyVipActivity.class);
                mContext.startActivity(intent8);
                break;
            case R.id.ll_my_wallet:
                Intent intent9 = new Intent(mContext, MyWalletActivity.class);
                mContext.startActivity(intent9);
                break;
            case R.id.ll_my_msg:
                Intent intent = new Intent(mContext, MsgActivity.class);
                mContext.startActivity(intent);
                break;
            case R.id.ll_my_address:
                Intent intent1 = new Intent(mContext, AddressActivity.class);
                mContext.startActivity(intent1);
                break;
            case R.id.ll_my_favorites:
                Intent intent2 = new Intent(mContext, MyFavoriteActivity.class);
                mContext.startActivity(intent2);
                break;
            case R.id.ll_my_invite:
                Intent intent3 = new Intent(mContext, MyInviteActivity.class);
                mContext.startActivity(intent3);
                break;
            case R.id.ll_my_shopcar:
                break;
            case R.id.ll_my_aboutus:
                Intent intent4 = new Intent(mContext, MyAboutUsActivity.class);
                mContext.startActivity(intent4);
                break;
            case R.id.ll_my_setting:
                Intent settingIntent = new Intent(mContext, SettingActivity.class);
                mContext.startActivity(settingIntent);
                break;
            case R.id.ll_my_service:
                Intent intent6 = new Intent(mContext, MyCallUsActivity.class);
                mContext.startActivity(intent6);
                break;
            case R.id.ll_my_alert:
                Intent intent7 = new Intent(mContext, MyAlertActivity.class);
                mContext.startActivity(intent7);
                break;
            case R.id.ll_my_feedback:
                Intent intent5 = new Intent(mContext, MyFeedbackActivity.class);
                mContext.startActivity(intent5);
                break;
        }
    }
}
