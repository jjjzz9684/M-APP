package com.example.hnsle.m_app;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class record extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        ListView listview;
        ListViewAdapter adapter = new ListViewAdapter();

        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        //산 그림, 산 이름, 마지막 등산 날짜, 등산로, 걸린 시간
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.aa), "aa", "bb", "cc", "dd");

    }

}
