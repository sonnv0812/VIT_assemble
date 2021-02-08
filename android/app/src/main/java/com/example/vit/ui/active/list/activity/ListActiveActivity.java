package com.example.vit.ui.active.list.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.vit.R;
import com.example.vit.config.FragmentListActive;
import com.google.android.material.tabs.TabLayout;

public class ListActiveActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ListActivePagerAdapter listActivePagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_active);

        listActivePagerAdapter = new ListActivePagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager = findViewById(R.id.viewpager_list_active);
        viewPager.setAdapter(listActivePagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout_list_active);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(FragmentListActive.ALL);
        tabLayout.getTabAt(FragmentListActive.REGISTERED);
    }
}