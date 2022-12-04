package com.example.wigglyville;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CatActivity extends AppCompatActivity {

    ImageView im1,im2,im3,im4,im5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        im1=findViewById(R.id.bombaycat_img);
        im2=findViewById(R.id.british_img);
        im3=findViewById(R.id.american_img);
        im4=findViewById(R.id.persian_img);
        im5=findViewById(R.id.mainecoon_img);


        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(CatActivity.this,bombaycat.class);
                startActivity(intent);
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(CatActivity.this,british_cat.class);
                startActivity(intent);
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(CatActivity.this,American_cat.class);
                startActivity(intent);
            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {Intent intent =new Intent(CatActivity.this,persian_cat.class);
                startActivity(intent);
            }
        });
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(CatActivity.this,mainecoon_cat.class);
                startActivity(intent);
            }
        });

    }
}