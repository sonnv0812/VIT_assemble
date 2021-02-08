package com.example.vit.ui.main.home;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vit.R;
import com.example.vit.data.model.ItemCardHome;
import com.example.vit.listener.OnItemClickListener;

public class IndexViewHolder extends RecyclerView.ViewHolder {

    private ImageView image;
    private TextView textTitle, textSubtitle;
    private CardView cardView;
    private ItemCardHome item;

    public IndexViewHolder(@NonNull View itemView, final OnItemClickListener<ItemCardHome> listener) {
        super(itemView);
        image = itemView.findViewById(R.id.image_index);
        textTitle = itemView.findViewById(R.id.text_title);
        textSubtitle = itemView.findViewById(R.id.text_subtitle);
        cardView = itemView.findViewById(R.id.container_card_home);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null)
                    listener.onClick(item, getAdapterPosition());
            }
        });
    }

    public void bindHolder(ItemCardHome index) {
        item = index;

        image.setImageResource(index.getImage());
        textTitle.setText(index.getTitle());
        textSubtitle.setText(index.getSubtitle());
//        cardView.setCardBackgroundColor(index.getColor());
    }
}
