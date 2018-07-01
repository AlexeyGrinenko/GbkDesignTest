package com.alexg.gbkdesigntest.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alexg.gbkdesigntest.R;
import com.alexg.gbkdesigntest.holders.NewsfeedViewHolder;
import com.alexg.gbkdesigntest.models.NewsfeedModel;

import java.util.List;

public class NewsfeedAdapter extends RecyclerView.Adapter<NewsfeedViewHolder> {

    private Context mContext;

    private List<NewsfeedModel> mNewsfeedModelList;

    public NewsfeedAdapter(Context context, List<NewsfeedModel> pointModelList) {
        mContext = context;
        mNewsfeedModelList = pointModelList;
    }

    @Override
    public NewsfeedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list_newsfeed, parent, false);
        return new NewsfeedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsfeedViewHolder holder, final int position) {
        NewsfeedModel model = mNewsfeedModelList.get(position);
        holder.titleView.setText(model.title);
        holder.likesView.setText(model.likes + " " + mContext.getString(R.string.text_likes));
        holder.commentsView.setText(model.comment + " " + mContext.getString(R.string.text_comments));
        holder.imageView.setImageResource(model.photo);
        if (model.isLiked) {
            holder.likeImageView.setImageResource(R.drawable.ic_heart_red);
        }
    }

    @Override
    public int getItemCount() {
        return mNewsfeedModelList.size();
    }
}
