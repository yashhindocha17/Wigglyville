package com.example.wigglyville;

import static com.example.wigglyville.R.id.pomeranian_img;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class promeDog extends AppCompatActivity {

    Button btn;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prome_dog);
        btn=findViewById(R.id.buttonbuy);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(promeDog.this, "Coming soon...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}