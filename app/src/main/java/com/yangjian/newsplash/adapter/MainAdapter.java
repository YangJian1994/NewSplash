package com.yangjian.newsplash.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yangjian.newsplash.Constant;
import com.yangjian.newsplash.R;

/**
 * Created by Yang on 2018/6/27.
 * Function：MainFragment界面适配器
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private String[] titles;
    private int[] imgIds;
    private LayoutInflater inflater;

    public MainAdapter(Context context) {
        this.titles = Constant.TITLES;
        this.imgIds = Constant.PHOTOS;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = inflater.inflate(R.layout.item_main, parent, false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (titles[position] != null) {
            holder.iv.setImageResource(imgIds[position]);
            holder.tv.setText(titles[position]);
        }
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv;
        private TextView tv;

        public ViewHolder(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.title_picture);
            tv = itemView.findViewById(R.id.title_text);
        }
    }
}
