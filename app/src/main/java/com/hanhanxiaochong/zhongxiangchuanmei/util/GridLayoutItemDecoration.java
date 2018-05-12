package com.hanhanxiaochong.zhongxiangchuanmei.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Kang on 2017/12/21.
 * GridView分割线样式
 */

public class GridLayoutItemDecoration extends RecyclerView.ItemDecoration {
    private Drawable mDivider;
    public GridLayoutItemDecoration(Context context, int drawableResId) {
        mDivider = ContextCompat.getDrawable(context,drawableResId);
    }
    /*
    * 基本操作  留出分割线位置
    * */

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int bottom = mDivider.getIntrinsicHeight();
        int right = mDivider.getIntrinsicWidth();
        if (isLastCloumn(view,parent)){
            right = 0;
        }
        if (isLastRow(view,parent)){
            bottom = 0;
        }
        outRect.bottom = bottom;
        outRect.right = right;
    }

    @Override
    public void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        drawHorizontal(canvas,parent);
        drawVertical(canvas,parent);
    }
    /*
        * 绘制垂直方向
        * */
    private void drawVertical(Canvas canvas, RecyclerView parent) {
        int childCount = parent.getChildCount();
        for (int i = 0;i < childCount;i++){
            View childview = parent.getChildAt(i);
            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) childview.getLayoutParams();
            int left = childview.getRight() + params.rightMargin;
            int top = childview.getTop() - params.topMargin;
            int right = left + mDivider.getIntrinsicWidth();
            int bottom = childview.getBottom() + params.bottomMargin;
            mDivider.setBounds(left,top,right,bottom);
            mDivider.draw(canvas);
        }
    }

    /*
    * 绘制水平方向
    * */
    private void drawHorizontal(Canvas canvas, RecyclerView parent) {
        int childCount = parent.getChildCount();
        for (int i = 0;i < childCount;i++){
            View childview = parent.getChildAt(i);
            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) childview.getLayoutParams();
            int left = childview.getLeft() - params.leftMargin;
            int top = childview.getBottom() + params.bottomMargin;
            int right = childview.getRight() + mDivider.getIntrinsicWidth() + params.rightMargin;
            int bottom = top + mDivider.getIntrinsicHeight();
            mDivider.setBounds(left,top,right,bottom);
            mDivider.draw(canvas);
        }
    }

    public boolean isLastCloumn(View view,RecyclerView parent) {
        //获取当前位置
        int currentposition = ((RecyclerView.LayoutParams)view.getLayoutParams()).getViewLayoutPosition();

        int spanCount = getSpanCount(parent);

        return (currentposition + 1) % spanCount == 0;
    }

    private int getSpanCount(RecyclerView parent) {
        //获取列数
        RecyclerView.LayoutManager layoutmanager = parent.getLayoutManager();
        if (layoutmanager instanceof GridLayoutManager){
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutmanager;
            int spanCount = gridLayoutManager.getSpanCount();
            return spanCount;
        }
        return 1;
    }

    public boolean isLastRow(View view, RecyclerView parent) {
        //列数
        int spanCount = getSpanCount(parent);
        //行数
        int rownum = parent.getAdapter().getItemCount()%spanCount == 0?parent.getAdapter().getItemCount()/spanCount:(parent.getAdapter().getItemCount()/spanCount + 1);
        //当前的位置 > (行数 - 1)*列数
        int currentposition = ((RecyclerView.LayoutParams)view.getLayoutParams()).getViewLayoutPosition();
        return (currentposition + 1) > (rownum - 1)*spanCount;
    }
}
