package com.example.vit.data.repository.active.list;

import com.example.vit.data.base.OnDataLoadedListener;
import com.example.vit.data.model.ActivityModel;

import java.util.List;

public interface ListActivitiesRepository {
    void getDataFirebase(OnDataLoadedListener<List<ActivityModel>> callback);
}
