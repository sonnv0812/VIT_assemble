package com.example.vit.ui.active.list.upcoming;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vit.R;
import com.example.vit.data.model.ActivityModel;
import com.example.vit.data.repository.active.list.ListActivitiesRepository;
import com.example.vit.data.repository.active.list.ListActivitiesRepositoryImpl;
import com.example.vit.listener.OnItemClickListener;
import com.example.vit.ui.active.list.adapter.ListActivitiesAdapter;

import java.util.List;

public class UpcomingFragment extends Fragment implements UpcomingContract.View {

    private UpcomingContract.Presenter presenter;
    private ListActivitiesAdapter adapter = new ListActivitiesAdapter();
    private RecyclerView recyclerUpcoming;
    private TextView textNullData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_upcoming, container, false);

        initPresenter();
        presenter.requestData();

        recyclerUpcoming = view.findViewById(R.id.recycler_list_upcoming);
        recyclerUpcoming.setAdapter(adapter);
        textNullData = view.findViewById(R.id.text_upcoming_null);

        return view;
    }

    private void initPresenter() {
        ListActivitiesRepository repository = new ListActivitiesRepositoryImpl();
        presenter = new UpcomingPresenter(this, repository);
    }

    @Override
    public void onResume() {
        super.onResume();
        adapter.setOnItemClickListener(new OnItemClickListener<ActivityModel>() {
            @Override
            public void onClick(ActivityModel activityModel, int position) {

            }
        });
    }

    @Override
    public void updateData(List<ActivityModel> activities) {
        recyclerUpcoming.setVisibility(View.VISIBLE);
        textNullData.setVisibility(View.GONE);
        adapter.updateData(activities);
    }

    @Override
    public void showViewNullData() {
        recyclerUpcoming.setVisibility(View.GONE);
        textNullData.setVisibility(View.VISIBLE);
    }
}
