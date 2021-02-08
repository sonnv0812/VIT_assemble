package com.example.vit.ui.main.menu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.vit.R;
import com.example.vit.ui.log.ActiveLogActivity;
import com.example.vit.ui.main.activity.MainActivity;
import com.example.vit.ui.profile.edit.EditProfileActivity;
import com.example.vit.ui.profile.profile.ProfileActivity;
import com.example.vit.ui.setting.password.ChangePasswordActivity;

public class MenuFragment extends Fragment {

    private ConstraintLayout constraintProfile, constraintLogout,
            constrainActiveLog, constraintSaved, constraintChangePassword;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home_menu, container, false);
        constraintProfile = view.findViewById(R.id.constraint_profile);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        ActionBar actionBar = ((MainActivity) getActivity()).getSupportActionBar();
        actionBar.hide();

        constraintProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
    }

}
