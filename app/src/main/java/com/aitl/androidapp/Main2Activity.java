package com.aitl.androidapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        Log.d("MainActivity2","onCreate Called!...");


    }


    public void FargmentDynamicOnclick(View view) {

        loadFragment(BlankFragment.newInstance("3","EFG"));
    }

    public void FramnentStaticOnClick(View view) {


        loadFragment(BlankFragment2.newInstance("6","ABC"));
    }

    public void FargmentDynamic3(View view) {
        loadFragment(BlankFragment3.newInstance("8","XYZ"));
    }

    public void FargmentDynamic4(View view) {
        loadFragment(BlankFragment4.newInstance("8","XYZ"));
    }

    void loadFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,fragment);
        fragmentTransaction.commit();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity2","OnStart Called!...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity2","onResume Called!...");

        loadFragment(BlankFragment4.newInstance("8","XYZ"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity2","onPause Called!...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","onStop Called!...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity2","onDestroy Called!...");
    }



}
