package com.example.wigglyville;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DogActivity extends AppCompatActivity {

    ImageView im1,im2,im3,im4,im5,im6,im7;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        im1=findViewById(R.id.bulldog_img);
        im2=findViewById(R.id.labrador_img);
        im3=findViewById(R.id.Husky_img);
        im4=findViewById(R.id.pug_img);
        im5=findViewById(R.id.pomeranian_img);
        im6=findViewById(R.id.shih_img);
        im7=findViewById(R.id.German_img);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DogActivity.this,BullDog.class);
                startActivity(intent);
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DogActivity.this,LabraDog.class);
                startActivity(intent);
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DogActivity.this,HuskeyDog.class);
                startActivity(intent);
            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DogActivity.this,PugDog.class);
                startActivity(intent);
            }
        });
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DogActivity.this,promeDog.class);
                startActivity(intent);
            }
        });
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DogActivity.this,shihtzu.class);
                startActivity(intent);
            }
        });
        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DogActivity.this,GermanShe_dog.class);
                startActivity(intent);
            }
        });



    }
}