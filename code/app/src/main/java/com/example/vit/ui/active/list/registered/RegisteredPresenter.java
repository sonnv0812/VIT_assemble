package com.example.vit.ui.active.list.registered;

import android.util.Log;

import com.example.vit.config.ActiveStatus;
import com.example.vit.config.LogcatTag;
import com.example.vit.data.base.OnDataLoadedListener;
import com.example.vit.data.model.ActivityModel;
import com.example.vit.data.repository.active.list.ListActivitiesRepository;

import java.util.ArrayList;
import java.util.List;

public class RegisteredPresenter implements RegisteredContract.Presenter {

    private RegisteredContract.View view;
    private ListActivitiesRepository repository;

    public RegisteredPresenter(RegisteredContract.View view, ListActivitiesRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    @Override
    public void requestData() {
        List<ActivityModel> activities = new ArrayList<>();
        repository.getDataFirebase(new OnDataLoadedListener<List<ActivityModel>>() {
            @Override
            public void onSuccess(List<ActivityModel> data) {
                if (data == null)
                    view.showViewNullData();
                else {
                    for (ActivityModel activity : data) {
                        if (activity.getStatus() == ActiveStatus.REGISTERED ||
                                activity.getStatus() == ActiveStatus.PARTICIPATED)
                            activities.add(activity);
                    }
                    view.updateData(activities);
                }
            }

            @Override
            public void onFailure(Exception exception) {
                Log.e(LogcatTag.LOADED_FIREBASE_ERROR, exception.getMessage());
            }
        });
    }
}
