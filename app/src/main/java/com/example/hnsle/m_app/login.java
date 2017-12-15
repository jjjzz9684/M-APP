package com.example.hnsle.m_app;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {  //로그인 이라기 보단 갈림길...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void showRecord(View view) {
        Intent intent = new Intent(this, record.class);
        startActivity(intent);
    }

    public void startClimbing(View view) {
        Intent intent = new Intent(this, startClimbing.class);
        startActivity(intent);
    }

}
