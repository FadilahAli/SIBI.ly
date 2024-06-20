package com.example.submi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    ImageButton btnkamus, btnforum, btntaks, btngame, btnadd, btnisyarat, camera;


    @SuppressLint({"MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);

        camera = findViewById(R.id.camera);
        btngame = findViewById(R.id.game);
        btnkamus = findViewById(R.id.kamus);
        btnadd = findViewById(R.id.add);
        btnisyarat = findViewById(R.id.isyarat);
        btntaks = findViewById(R.id.taks);
        btnforum = findViewById(R.id.forum);

        btnisyarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,Isyarat.class);
                startActivity(i);
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,Camera.class);
                startActivity(i);
            }
        });



    }
}