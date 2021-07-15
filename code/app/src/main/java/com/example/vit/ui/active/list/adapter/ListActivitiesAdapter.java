package com.example.vit.ui.active.list.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vit.R;
import com.example.vit.data.model.ActivityModel;
import com.example.vit.listener.OnItemClickListener;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ListActivitiesAdapter extends RecyclerView.Adapter<ListActivitiesViewHolder> {

    private List<ActivityModel> listActivities = new ArrayList<>();
    private OnItemClickListener<ActivityModel> listener;

    @NonNull
    @NotNull
    @Override
    public ListActivitiesViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_active, parent, false);
        return new ListActivitiesViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ListActivitiesViewHolder holder, int position) {
        holder.bindData(listActivities.get(position));
    }

    @Override
    public int getItemCount() {
        return listActivities == null ? 0 : listActivities.size();
    }

    public void setOnItemClickListener(OnItemClickListener<ActivityModel> listener) {
        this.listener = listener;
    }

    public void updateData(List<ActivityModel> newActivity) {
        listActivities.clear();
        listActivities.addAll(newActivity);
        notifyDataSetChanged();
    }

    public void addData(List<ActivityModel> moreActivity) {
        int oldSize = listActivities.size();
        listActivities.addAll(moreActivity);
        int newSize = listActivities.size();
        notifyItemRangeChanged(oldSize, newSize);
    }
}
