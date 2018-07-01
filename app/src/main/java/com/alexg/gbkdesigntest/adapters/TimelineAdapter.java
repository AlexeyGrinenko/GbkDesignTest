package com.alexg.gbkdesigntest.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alexg.gbkdesigntest.R;
import com.alexg.gbkdesigntest.holders.TimelineViewHolder;
import com.alexg.gbkdesigntest.models.TimelineModel;

import java.util.List;

public class TimelineAdapter extends RecyclerView.Adapter<TimelineViewHolder> {

    private Context mContext;

    private List<TimelineModel> mTimelineModelList;

    public TimelineAdapter(Context context, List<TimelineModel> pointModelList) {
        mContext = context;
        mTimelineModelList = pointModelList;
    }

    @Override
    public TimelineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list_timeline, parent, false);
        return new TimelineViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TimelineViewHolder holder, final int position) {
        TimelineModel model = mTimelineModelList.get(position);
        holder.titleView.setText(model.title);
        holder.subtitleView.setText(model.subtitle);
        holder.timeView.setText(model.time);
        if (model.isAm) {
            holder.ampmView.setText("AM");
        } else {
            holder.ampmView.setText("PM");
        }
        if (model.isActive) {
            holder.circleView.setImageResource(R.drawable.bg_green_circle);
        } else {
            holder.circleView.setImageResource(R.drawable.bg_red_circle);
        }
        holder.imageOneView.setImageResource(model.photoOne);
        holder.imageTwoView.setImageResource(model.photoTwo);
        holder.imageThreeView.setImageResource(model.photoThree);
    }

    @Override
    public int getItemCount() {
        return mTimelineModelList.size();
    }
}
