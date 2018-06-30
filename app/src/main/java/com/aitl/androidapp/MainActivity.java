package com.aitl.androidapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    EditText editTextName, editTextN1, editTextN2;
    TextView testViewMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        myButton = (Button) findViewById(R.id.button);
        editTextName = (EditText) findViewById(R.id.editTextName);
        testViewMessage = (TextView) findViewById(R.id.testViewMessage);
        editTextN1 = (EditText) findViewById(R.id.editTextN1);
        editTextN2 = (EditText) findViewById(R.id.editTextN2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void MyButtonOnClick(View view) {

        String name = editTextName.getText().toString();

        int n1 = Integer.valueOf(editTextN1.getText().toString());
        int n2 = Integer.valueOf(editTextN2.getText().toString());

        int sum = n1+ n2;

        testViewMessage.setText("Sum = "+sum);

        Toast.makeText(getApplicationContext(),"Hi "+name+". Welcome to AITL",Toast.LENGTH_SHORT).show();
    }

    public void NewActivity(View view) {
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("name","Advance Integrated Tech Lan");

        startActivity(intent);

    }


}
