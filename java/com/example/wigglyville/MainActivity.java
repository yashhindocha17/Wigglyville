package com.example.wigglyville;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    EditText en_email, en_pword;
    String email, pword;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();
        getSupportActionBar().hide();

        if(auth.getCurrentUser() != null){
            startActivity(new Intent(MainActivity. this, HomePage.class));
            finish();
        }

        en_email = findViewById(R.id.email);
        en_pword = findViewById(R.id.pword);

        textView = findViewById(R.id.tv);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SignUp.class);
                startActivity(i);
            }
        });
    }

    public void login(View view) {
        email = en_email.getText().toString();
        pword = en_pword.getText().toString();

        if (email.isEmpty()){
            Toast.makeText(this, "Email is empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(pword.isEmpty()){
            Toast.makeText(this, "Password is empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(pword.length()<8){
            Toast.makeText(this, "Password length must be greater then 8", Toast.LENGTH_SHORT).show();
            return;
        }

        auth.signInWithEmailAndPassword(email,pword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(MainActivity.this,"Login Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, HomePage.class));
                    finish();
                }
                else {
                    Toast.makeText(MainActivity.this,"Please enter Valid Email and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void register(View view){
        Intent go_reg = new Intent(MainActivity.this, SignUp.class);
        go_reg.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(go_reg);
    }
}