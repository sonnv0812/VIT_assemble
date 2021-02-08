package com.example.vit.ui.active.add;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.vit.R;
import com.example.vit.data.repository.active.add.AddActiveRepository;
import com.example.vit.data.repository.active.add.AddActiveRepositoryImpl;

public class AddActiveActivity extends AppCompatActivity
        implements AddActiveContract.View {

    private EditText editNameActive, editDescription, editDress, editPlace;
    private TextView textTime, textDate;
    private ImageButton buttonDate, buttonTime;
    private Button buttonSend;
    private AddActiveContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_active);
        initView();
    }

    private void initView() {
        editNameActive = findViewById(R.id.edit_name_active);
        editDescription = findViewById(R.id.edit_activity_description);
        editDress = findViewById(R.id.edit_dress);
        editPlace = findViewById(R.id.edit_place);
        textTime = findViewById(R.id.text_activity_time);
        textDate = findViewById(R.id.text_activity_date);
        buttonDate = findViewById(R.id.button_date);
        buttonTime = findViewById(R.id.button_time);
        buttonSend = findViewById(R.id.button_send_activity);

        AddActiveRepository repository = new AddActiveRepositoryImpl();
        presenter = new AddActivePresenter(this, repository);
    }
}
