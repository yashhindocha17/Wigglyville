package com.example.wigglyville;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CatPage extends AppCompatActivity {

    ImageView im1,im2,im3,im4,im5,im6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_page);
        getSupportActionBar().hide();

        im1=findViewById(R.id.imageView3);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CatPage.this,CatActivity.class);
                startActivity(intent);
            }
        });
        im2=findViewById(R.id.imageView4);
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CatPage.this,Clinic.class);
                startActivity(intent);
            }
        });
        im3=findViewById(R.id.imageView5);
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CatPage.this, "Work in progress...", Toast.LENGTH_SHORT).show();
            }
        });
        im4=findViewById(R.id.imageView8);
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CatPage.this, "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });
        im5=findViewById(R.id.imageView9);
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CatPage.this, "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });
        im6=findViewById(R.id.imageView6);
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CatPage.this, "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}