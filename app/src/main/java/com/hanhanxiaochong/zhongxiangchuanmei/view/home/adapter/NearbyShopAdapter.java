package com.hanhanxiaochong.zhongxiangchuanmei.view.home.adapter;

import android.content.Context;
import android.view.View;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.config.CommonAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.config.OnItemClickListener;
import com.hanhanxiaochong.zhongxiangchuanmei.config.ViewHolder;

import java.util.List;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/23.
 * Desc   :
 */

public class NearbyShopAdapter extends CommonAdapter<String> {

    private OnItemClickListener onItemClickListener;

    public NearbyShopAdapter(Context context, int layoutId, List<String> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, String s, final int position) {

        holder.setOnClickListener(R.id.item_nearby_shop, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onItemClick(NearbyShopAdapter.this, position);
            }
        });
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }
}
