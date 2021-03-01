package com.example.vit.ui.main.home;

import android.content.Intent;

import com.example.vit.data.model.ItemCardHome;

import java.util.List;

public interface HomeContract {
    interface View {
        void updateInitUI(List<ItemCardHome> items);
    }

    interface Presenter {
        void getInitUI(int userType);
    }
}
