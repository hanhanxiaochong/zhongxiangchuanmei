package com.hanhanxiaochong.zhongxiangchuanmei.view.main.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.config.CommonAdapter;
import com.hanhanxiaochong.zhongxiangchuanmei.config.ViewHolder;
import com.hanhanxiaochong.zhongxiangchuanmei.view.order.act.OrderWaitCommentActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.order.act.OrderWaitPayActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.order.act.OrderWaitServiceActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.order.act.OrderWaitTakeDeliveryActivity;
import com.hanhanxiaochong.zhongxiangchuanmei.view.shop.act.ProductDetailActivity;

import java.util.List;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/4/12.
 * Desc   :
 */

public class OrderAdapter extends CommonAdapter<String> {

    private int i;

    public OrderAdapter(Context context, int layoutId, List<String> datas, int i) {
        super(context, layoutId, datas);
        this.i = i;

    }

    @Override
    protected void convert(final ViewHolder holder, String s, int position) {
        holder.setOnClickListener(R.id.item_shop, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ProductDetailActivity.class);
                mContext.startActivity(intent);
            }
        });

        if (i == 0){
            holder.setVisible(R.id.ll_wait_pay, true);
        }else if (i == 1){
            holder.setVisible(R.id.ll_wait_service, true);
        }else if (i == 2){
            holder.setVisible(R.id.ll_wait_confirm, true);
        }else if (i == 3){
            holder.setVisible(R.id.ll_wait_comment, true);
        }else if (i == 4){
//            holder.setVisible(R.id.ll_wait_service, true);
        }

        holder.setOnClickListener(R.id.item_order, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0){
                    mContext.startActivity(new Intent(mContext, OrderWaitPayActivity.class));
                }else if (i == 1){
                    mContext.startActivity(new Intent(mContext, OrderWaitServiceActivity.class));
                }else if (i == 2){
                    mContext.startActivity(new Intent(mContext, OrderWaitTakeDeliveryActivity.class));
                }else if (i == 3){
                    mContext.startActivity(new Intent(mContext, OrderWaitCommentActivity.class));
                }
            }
        });
    }
}
