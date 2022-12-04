package com.example.wigglyville;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class shihtzu extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shihtzu);

        btn=findViewById(R.id.buttonbuy);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(shihtzu.this, "Coming soon...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}