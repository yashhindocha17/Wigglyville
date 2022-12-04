package com.example.wigglyville;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GermanShe_dog extends AppCompatActivity {
    Button btn;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_german_she_dog);
        btn=findViewById(R.id.buttonbuy);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GermanShe_dog.this, "Coming soon...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}