package com.hanhanxiaochong.zhongxiangchuanmei.view.home.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.config.CommonAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.config.ViewHolder;
import com.hanhanxiaochong.zhongxiangchuanmei.view.home.act.HotProjectDetailActivity;

import java.util.List;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/2.
 * Desc   : 热门项目adapter
 */

public class HotProjectAdapter extends CommonAdapter<String> {

    public HotProjectAdapter(Context context, int layoutId, List<String> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, String s, int position) {

        holder.setOnClickListener(R.id.item_hotproject, new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, HotProjectDetailActivity.class);
                mContext.startActivity(intent);
            }
        });
    }
}
