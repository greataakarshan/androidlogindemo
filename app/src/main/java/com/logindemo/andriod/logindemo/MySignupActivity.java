package com.logindemo.andriod.logindemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.duration;
import static android.R.attr.label;

public class MySignupActivity extends AppCompatActivity {


     ArrayList<Info> arrinfo= new ArrayList<Info>();

    public ArrayList<Info> getList() {
        return arrinfo ;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_signup);




        final EditText iname = (EditText) findViewById(R.id.editText3);
        final EditText iuname = (EditText) findViewById(R.id.editText4);
        final EditText ipassword = (EditText) findViewById(R.id.editText5);

        Button b1 = (Button) findViewById(R.id.button4);

        final String s1= iname.getText().toString();
        final String s2= iuname.getText().toString();
        final String s3=ipassword.getText().toString();
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                arrinfo.add(new Info(s1,s2,s3));
                Context context = getApplicationContext();
                CharSequence text = "Registered Successfully";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                Intent redirectIntent = new Intent(MySignupActivity.this, MainActivity.class);
                redirectIntent.putExtra("arrinfo", arrinfo);
                startActivity(redirectIntent);

            }
        });

//same here too seeeee

        //call this function independently and export to view to ckeck what the output is
        //nahi samjha



    }
}
