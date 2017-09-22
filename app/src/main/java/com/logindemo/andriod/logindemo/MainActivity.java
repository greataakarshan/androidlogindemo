package com.logindemo.andriod.logindemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Info> arrinfo= new ArrayList<Info>();
    if(((ArrayList<Info>) getIntent().getSerializableExtra("arrinfo"))!=false)
    {
        ArrayList<Info> myList = (ArrayList<Info>) getIntent().getSerializableExtra("arrinfo");
        ArrayList<Info> arrinfo= myList;
    }

//    ArrayList<Info> myList = (ArrayList<Info>) getIntent().getSerializableExtra("arrinfo");
//    ArrayList<Info> arrinfo= myList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button supbutton = (Button) findViewById(R.id.button);
        Button lbutton = (Button) findViewById(R.id.button2);

        lbutton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View v) {
                Intent redirectIntent = new Intent(MainActivity.this, MyLoginActivity.class);
                redirectIntent.putExtra("arrinfo", arrinfo);
                startActivity(redirectIntent);
            }});


        supbutton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View v) {
                Intent signupIntent = new Intent(MainActivity.this, MySignupActivity.class);
                startActivity(signupIntent);}});

















    }
}
