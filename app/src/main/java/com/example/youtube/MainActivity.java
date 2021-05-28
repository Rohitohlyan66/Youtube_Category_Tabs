package com.example.youtube;

import android.os.Bundle;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Removing Toolbar Elevation
        getSupportActionBar().setElevation(0);

        //Checking all tab on start of activity
        radioGroup = findViewById(R.id.radio_group);
        radioGroup.check(R.id.all);

    }

}