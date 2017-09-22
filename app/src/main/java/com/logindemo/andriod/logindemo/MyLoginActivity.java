package com.logindemo.andriod.logindemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.duration;

public class MyLoginActivity extends AppCompatActivity {

    MySignupActivity o1 =new MySignupActivity();
    ArrayList<Info> myList = (ArrayList<Info>) getIntent().getSerializableExtra("arrinfo");
    ArrayList<Info> arrinfo= myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_login);



        final EditText iname = (EditText) findViewById(R.id.editText);
        final EditText iuname = (EditText) findViewById(R.id.editText2);

        final String s1= iname.getText().toString();
        final String s2= iuname.getText().toString();

        Button b1 = (Button) findViewById(R.id.button4);




        Button b3= (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                for(Info i : arrinfo){
                    if(i.getUname().equals(s1))
                    {

                        Context context = getApplicationContext();
                        CharSequence text = "User name exists";
                        int duration = Toast.LENGTH_LONG;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                        if(i.getPassword().equals(s2))
                        {

                            context = getApplicationContext();
                            text = "Correct username and password";
                            duration = Toast.LENGTH_LONG;
                            toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent redirectIntent = new Intent(MyLoginActivity.this, WelcomeActivity.class);
                            startActivity(redirectIntent);
                        }
                        else
                        {
                            toast = Toast.makeText(context, "Wrong password", duration);
                            break;
                        }
                    }
                    else
                    {
                        Context context = getApplicationContext();
                        CharSequence text = "User name doesnt exists";
                        int duration = Toast.LENGTH_LONG;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    gt: ;
                }

            }
        });







    }
}
