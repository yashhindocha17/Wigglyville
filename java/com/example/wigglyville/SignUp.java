package com.example.wigglyville;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {

    EditText email, pword, conpword, name;
    FirebaseAuth auth;
    FirebaseDatabase database;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        progressDialog = new ProgressDialog(SignUp.this);
        progressDialog.setTitle("Please Wait");
        progressDialog.setMessage("Creating User.....");

        name = findViewById(R.id.Pname);
        email = findViewById(R.id.Email);
        pword = findViewById(R.id.Pword);
        conpword = findViewById(R.id.ConPword);
    }

    public void signup(View view){

        String password=pword.getText().toString();
        String emailid =email.getText().toString();
        String conpassword = conpword.getText().toString();
        String pname = name.getText().toString();

        if(pname.isEmpty()){
            Toast.makeText(this, "Name is Empty", Toast.LENGTH_SHORT).show();
            return;
        }

        if(emailid.isEmpty()){
            Toast.makeText(this, "email is Empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(password.isEmpty()){
            Toast.makeText(this, "password is Empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(password.length()<8){
            Toast.makeText(this, "password Length Must Be Greater then 8", Toast.LENGTH_SHORT).show();
            return;
        }
        if(!password.equals(conpassword)){
            Toast.makeText(this, "password dose not match", Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.show();


        auth.createUserWithEmailAndPassword(emailid,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    progressDialog.dismiss();

                    SignUpModel model = new SignUpModel(pname,emailid,password);
                    String id = task.getResult().getUser().getUid();
                    database.getReference().child("Users").child(id).setValue(model);

                    Toast.makeText(SignUp.this,"Registration Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(SignUp.this, HomePage.class));
                    finish();
                }
                else {
                    progressDialog.dismiss();
                    Toast.makeText(SignUp.this, "Error : " +task.getException().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

//    public void alreadylogin(View view) {
//        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//        startActivity(intent);
//    }
}