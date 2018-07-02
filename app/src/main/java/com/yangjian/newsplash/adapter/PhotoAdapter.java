package com.yangjian.newsplash.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangjian.newsplash.R;
import com.yangjian.newsplash.bean.Photo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yang on 2018/6/29.
 * Function：
 */

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder> {

    private List<Photo> photos;
    private Context context;
    private LayoutInflater inflater;

    public PhotoAdapter(Context context) {
        this.photos = new ArrayList<>();
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = inflater.inflate(R.layout.item_photo, parent, false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Photo photo = photos.get(position);
        if (photo.getPreviewURL() != null) {
            Glide.with(context)
                    .load(photo.getPreviewURL())
                    .error(R.drawable.panda)
                    .centerCrop()
                    .placeholder(R.drawable.panda)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(holder.iv);
        } else {
            holder.iv.setImageResource(R.drawable.panda);
        }
    }

    @Override
    public int getItemCount() {
        return photos != null ? photos.size() : 0;
    }

    public void setData(List<Photo> photos) {
        this.photos = photos;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv;

        public ViewHolder(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.card_image);
        }
    }
}
