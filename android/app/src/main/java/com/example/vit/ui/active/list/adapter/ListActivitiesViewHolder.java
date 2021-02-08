package com.example.vit.ui.active.list.adapter;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vit.R;
import com.example.vit.config.ActiveStatus;
import com.example.vit.data.model.ActivityModel;
import com.example.vit.listener.OnItemClickListener;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ListActivitiesViewHolder extends RecyclerView.ViewHolder {

    private ActivityModel itemData;
    private TextView textName, textStatus, textDay, textDate, textTime;

    public ListActivitiesViewHolder(@NonNull @NotNull View itemView, OnItemClickListener<ActivityModel> listener) {
        super(itemView);

        textName = itemView.findViewById(R.id.text_item_name);
        textDate = itemView.findViewById(R.id.text_item_date);
        textDay = itemView.findViewById(R.id.text_item_days);
        textStatus = itemView.findViewById(R.id.text_item_status);
        textTime = itemView.findViewById(R.id.text_activity_time);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(itemData, getAbsoluteAdapterPosition());
                }
            }
        });
    }

    public void bindData(ActivityModel activityModel) {
        itemData = activityModel;

        textName.setText(itemData.getName());

        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        Date time = new Date(itemData.getTime());
        textTime.setText(sdf.format(time));

        switch (itemData.getStatus()) {
            case ActiveStatus.UNREGISTERED:
                textStatus.setTextColor(Color.parseColor("#c4c4c4"));
                textStatus.setText(R.string.unregistered_status);
                break;
            case ActiveStatus.NOT_REGISTERED:
                textStatus.setTextColor(Color.RED);
                textStatus.setText(R.string.not_registered_status);
                break;
            case ActiveStatus.PARTICIPATED:
                textStatus.setTextColor(Color.GREEN);
                textStatus.setText(R.string.participated_status);
                break;
            case ActiveStatus.REGISTERED:
                textStatus.setTextColor(Color.parseColor("#a67700"));
                textStatus.setText(R.string.registered_status);
                break;

        }

    }
}
