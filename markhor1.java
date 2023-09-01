package com.example.uniqe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class markhor1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markhor1);
    }

    public void back(View view) {
        Intent back3=new Intent(this,MainActivity.class);
        startActivity(back3);
    }
}