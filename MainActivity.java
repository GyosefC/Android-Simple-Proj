package com.example.uniqe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void share(View view) {
        Intent myIntent=new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody="Unique";
        String shareSub="your subject here";
        myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
        startActivity(Intent.createChooser(myIntent,"share using"));

    }

    public void contact(View view) {

    }

    public void mar(View view) {

        Intent mar2=new Intent(this,markhor1.class);
        startActivity(mar2);
    }

    public void oka(View view) {
        Intent oka2=new Intent(this,okapi1.class);
        startActivity(oka2);
    }

    public void slo(View view) {
        Intent slo2=new Intent(this,sloth1.class);
        startActivity(slo2);
    }

    public void fos(View view) {
        Intent fos2=new Intent(this,fosa.class);
        startActivity(fos2);
    }

    public void water(View view) {
        Intent water2=new Intent(this,water1.class);
        startActivity(water2);
    }

    public void hond(View view) {
        Intent hond2=new Intent(this,hondura1.class);
        startActivity(hond2);
    }
}