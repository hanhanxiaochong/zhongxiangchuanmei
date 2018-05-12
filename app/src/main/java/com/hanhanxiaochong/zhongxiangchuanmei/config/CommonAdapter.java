package com.hanhanxiaochong.zhongxiangchuanmei.config;

import android.content.Context;
import android.view.LayoutInflater;

import java.util.List;

/**
 * Created by zhy on 16/4/9.
 */
public abstract class CommonAdapter<T> extends MultiItemTypeAdapter<T>
{
    protected Context mContext;
    protected int mLayoutId;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;
    protected OnItemClickListener mOnItemClickListener;

    public CommonAdapter(final Context context, final int layoutId, List<T> datas)
    {
        super(context, datas);
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mLayoutId = layoutId;
        mDatas = datas;

        addItemViewDelegate(new ItemViewDelegate<T>()
        {
            @Override
            public int getItemViewLayoutId()
            {
                return layoutId;
            }

            @Override
            public boolean isForViewType( T item, int position)
            {
                return true;
            }

            @Override
            public void convert(ViewHolder holder, T t, final int position)
            {
                CommonAdapter.this.convert(holder, t, position);

//                if(mLayoutId!=0){
//                    holder.getConvertView().setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
////                            mOnItemClickListener.onItemClick(CommonAdapter.this,position);
//                        }
//                    });
//                }
            }
        });
    }

    protected abstract void convert(ViewHolder holder, T t, int position);


    public void setmOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

}
