package com.example.vit.data.repository.active.list;

import com.example.vit.data.base.OnDataLoadedListener;
import com.example.vit.data.model.ActivityModel;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class ListActivitiesRepositoryImpl implements ListActivitiesRepository {

    @Override
    public void getDataFirebase(OnDataLoadedListener<List<ActivityModel>> callback) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();

    }
}
