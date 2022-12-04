package com.example.wigglyville;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class persian_cat extends AppCompatActivity {
Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persian_cat);

        btn=findViewById(R.id.buttonbuy);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(persian_cat.this, "Coming soon...", Toast.LENGTH_SHORT).show();
            }
        });

    }
}