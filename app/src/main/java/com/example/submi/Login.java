package com.example.submi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {
    TextInputEditText editTextemail, editTextpassword;
    Button buttonreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextemail = findViewById(R.id.email);
        editTextpassword = findViewById(R.id.password);
        buttonreg = findViewById(R.id.btn_login);

      buttonreg.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String email;
              String password;
              email = String.valueOf(editTextemail.getText());
              password =String.valueOf(editTextpassword.getText());

              if (TextUtils.isEmpty(email)){
                  Toast.makeText(Login.this,"Enter Your Email", Toast.LENGTH_SHORT).show();
                  return;
              }

              if (TextUtils.isEmpty(password)){
                  Toast.makeText(Login.this,"Enter Your paswword", Toast.LENGTH_SHORT).show();
              }

              Intent i = new Intent(Login.this, Home.class);
              startActivity(i);
          }
      });


    }
}