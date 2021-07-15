package com.example.vit.ui.active.list.registered;

import com.example.vit.data.model.ActivityModel;

import java.util.List;

public interface RegisteredContract {
    interface View {
        void updateData(List<ActivityModel> activities);

        void showViewNullData();
    }

    interface Presenter {
        void requestData();
    }
}
