package com.hanhanxiaochong.zhongxiangchuanmei.view.shop.adapter;

import android.content.Context;

import com.hanhanxiaochong.zhongxiangchuanmei.config.CommonAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.config.OnItemClickListener;
import com.hanhanxiaochong.zhongxiangchuanmei.config.ViewHolder;

import java.util.List;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/9.
 * Desc   :
 */

public class ShopNextFirstAdapter extends CommonAdapter<String> {

    private OnItemClickListener onItemClickListener;

    public ShopNextFirstAdapter(Context context, int layoutId, List<String> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, String s, int position) {

    }


}
