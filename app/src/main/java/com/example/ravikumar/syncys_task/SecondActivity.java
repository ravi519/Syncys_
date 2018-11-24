package com.example.ravikumar.syncys_task;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView tv1,tv2,tv3,tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);


    String name = getIntent().getStringExtra("name");
    String login  = getIntent().getStringExtra("login");
    String type = getIntent().getStringExtra("type");
    String url = getIntent().getStringExtra("url");

    tv1.setText(name);
    tv1.setText(login);
    tv1.setText(type);
    tv1.setText(url);


    }

}
