package com.example.vit.ui.main.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vit.R;
import com.example.vit.data.model.ItemCardHome;
import com.example.vit.listener.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class IndexAdapter extends RecyclerView.Adapter<IndexViewHolder> {

    private List<ItemCardHome> items = new ArrayList<>();
    private OnItemClickListener<ItemCardHome> listener;

    @NonNull
    @Override
    public IndexViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_home, parent, false);
        return new IndexViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull IndexViewHolder holder, int position) {
        holder.bindHolder(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }

    public void setItemClickListener(OnItemClickListener<ItemCardHome> listener) {
        this.listener = listener;
    }

    public void updateData(List<ItemCardHome> newItems) {
        items.clear();
        items.addAll(newItems);
        notifyDataSetChanged();
    }
}
