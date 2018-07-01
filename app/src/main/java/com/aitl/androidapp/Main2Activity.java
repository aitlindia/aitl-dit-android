package com.aitl.androidapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private Button button1,button2;
    private FrameLayout container;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameTV = (TextView) findViewById(R.id.nmaTV);

        Intent intent2 = getIntent();

        String name = intent2.getStringExtra("name");

        nameTV.setText(name);
    }



    public void FargmentDynamicOnclick(View view) {

        loadFragment(BlankFragment.newInstance("3","EFG"));
    }

    public void FramnentStaticOnClick(View view) {


        loadFragment(BlankFragment2.newInstance("6","ABC"));
    }

    void loadFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,fragment);
        fragmentTransaction.commit();
    }
}
