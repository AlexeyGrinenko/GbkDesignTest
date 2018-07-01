package com.alexg.gbkdesigntest.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alexg.gbkdesigntest.R;


public class TimelineViewHolder extends RecyclerView.ViewHolder {

    public TextView timeView;
    public TextView ampmView;
    public TextView titleView;
    public TextView subtitleView;
    public ImageView circleView;
    public ImageView imageOneView;
    public ImageView imageTwoView;
    public ImageView imageThreeView;

    public TimelineViewHolder(View itemView) {
        super(itemView);
        timeView = itemView.findViewById(R.id.item_timeline_tv_time);
        ampmView = itemView.findViewById(R.id.item_timeline_tv_time_am);
        titleView = itemView.findViewById(R.id.item_timeline_tv_title);
        subtitleView = itemView.findViewById(R.id.item_timeline_tv_subtitle);
        circleView = itemView.findViewById(R.id.item_timeline_iv_circle);
        imageOneView = itemView.findViewById(R.id.item_timeline_iv_one);
        imageTwoView = itemView.findViewById(R.id.item_timeline_iv_two);
        imageThreeView = itemView.findViewById(R.id.item_timeline_iv_three);
    }
}
