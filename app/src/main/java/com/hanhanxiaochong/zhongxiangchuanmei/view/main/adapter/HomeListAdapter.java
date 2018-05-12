package com.hanhanxiaochong.zhongxiangchuanmei.view.main.adapter;

import android.content.Context;
import android.widget.LinearLayout;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.config.CommonAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.config.ViewHolder;
import com.hanhanxiaochong.zhongxiangchuanmei.view.main.act.HomeListFirstView;

import java.util.List;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/11.
 * Desc   :
 */

public class HomeListAdapter extends CommonAdapter<String> {

    public HomeListAdapter(Context context, int layoutId, List<String> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, String s, int position) {
        holder.setText(R.id.txt_type, s);
        LinearLayout linearLayout = holder.getView(R.id.ll_project);
        HomeListFirstView homeListFirstView = new HomeListFirstView(mContext);
        homeListFirstView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(homeListFirstView);

    }
}
