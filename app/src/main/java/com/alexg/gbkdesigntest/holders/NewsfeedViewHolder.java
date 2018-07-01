package com.alexg.gbkdesigntest.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alexg.gbkdesigntest.R;


public class NewsfeedViewHolder extends RecyclerView.ViewHolder {

    public TextView titleView;
    public TextView likesView;
    public TextView commentsView;
    public ImageView imageView;
    public ImageView likeImageView;

    public NewsfeedViewHolder(View itemView) {
        super(itemView);
        titleView = itemView.findViewById(R.id.item_newsfeed_title);
        likesView = itemView.findViewById(R.id.item_newsfeed_likes);
        commentsView = itemView.findViewById(R.id.item_newsfeed_comments);
        imageView = itemView.findViewById(R.id.item_newsfeed_image);
        likeImageView = itemView.findViewById(R.id.item_newsfeed_like_image);
    }
}
