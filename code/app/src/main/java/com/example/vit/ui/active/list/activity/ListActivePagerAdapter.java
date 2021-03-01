package com.example.vit.ui.active.list.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.vit.config.FragmentListActive;
import com.example.vit.ui.active.list.all.AllActiveFragment;
import com.example.vit.ui.active.list.registered.RegisteredActiveFragment;

public class ListActivePagerAdapter extends FragmentStatePagerAdapter {

    public ListActivePagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case FragmentListActive.ALL:
                fragment = new AllActiveFragment();
                break;
            case FragmentListActive.REGISTERED:
                fragment = new RegisteredActiveFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return FragmentListActive.COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case FragmentListActive.ALL:
                title = "Tất cả";
                break;
            case FragmentListActive.REGISTERED:
                title = "Đã đăng ký";
        }
        return title;
    }
}
