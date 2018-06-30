package com.aitl.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameTV = (TextView) findViewById(R.id.nmaTV);

        Intent intent2 = getIntent();

        String name = intent2.getStringExtra("name");

        nameTV.setText(name);
    }
}
