package com.example.uniqe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class hondura1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hondura1);
    }

    public void back(View view) {
        Intent back2=new Intent(this,MainActivity.class);
        startActivity(back2);
    }
}