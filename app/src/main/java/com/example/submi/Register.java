package com.example.submi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Register extends AppCompatActivity {
    TextInputEditText editTextUsername, editTextEmail, editTextPassword;
    Button buttonReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        editTextUsername = findViewById(R.id.name);
        buttonReg = findViewById(R.id.btn_singin);

        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username;
                String email;
                String paswword;
                email= String.valueOf(editTextEmail.getText());
                paswword= String.valueOf(editTextPassword.getText());
                username= String.valueOf(editTextUsername.getText());


                if (TextUtils.isEmpty(email)){
                    Toast.makeText(Register.this,"Enter Your Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(paswword)){
                    Toast.makeText(Register.this,"Enter Your paswword", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(username)){
                    Toast.makeText(Register.this,"Enter Your username", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}