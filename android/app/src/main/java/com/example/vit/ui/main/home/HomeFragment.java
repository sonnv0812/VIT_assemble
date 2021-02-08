package com.example.vit.ui.main.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vit.R;
import com.example.vit.config.HomeActive;
import com.example.vit.data.model.ItemCardHome;
import com.example.vit.listener.OnItemClickListener;
import com.example.vit.ui.active.add.AddActiveActivity;
import com.example.vit.ui.active.list.activity.ListActiveActivity;

import java.util.List;

public class HomeFragment extends Fragment implements HomeContract.View {

    private int userType;
    private IndexAdapter adapter = new IndexAdapter();
    private RecyclerView recyclerHome;
    private HomeContract.Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home_home, container, false);
//        userType = getArguments().getInt("userType");
        recyclerHome = root.findViewById(R.id.recycler_home);
        initUI();
        adapter.setItemClickListener(new OnItemClickListener<ItemCardHome>() {
            @Override
            public void onClick(ItemCardHome itemCardHome, int position) {
                switch (position) {
                    case HomeActive.ADD:
                        Intent intent = new Intent(getContext(), AddActiveActivity.class);
                        startActivity(intent);
                        break;
                    case HomeActive.INFO:
                        Intent intent1 = new Intent(getContext(), ListActiveActivity.class);
                        startActivity(intent1);
                        break;
                }
            }
        });
        recyclerHome.setAdapter(adapter);
        return root;
    }

    private void initUI() {
        presenter = new HomePresenter(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.getInitUI(1);
    }

    @Override
    public void updateInitUI(List<ItemCardHome> items) {
        adapter.updateData(items);
    }

}
