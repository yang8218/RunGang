package com.yang.rungang.listener;

/**
 * 为RecycleView添加点击事件
 *
 * Created by 洋 on 2016/5/21.
 */
public interface OnRecyclerViewListener {

    void onItemClick(int position);

    boolean onItemLongClick(int position);
}
