package com.example.wigglyville;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SliderMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_menu);
        getSupportActionBar().hide();
    }
}