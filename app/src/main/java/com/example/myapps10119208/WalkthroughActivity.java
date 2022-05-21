package com.example.myapps10119208;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import me.relex.circleindicator.CircleIndicator;


//dibuat tgl 12 mei 2022 oleh agung segara rizki 10119208
public class WalkthroughActivity extends AppCompatActivity {

    ViewPager viewPager;
    SlideViewAdapter sV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        viewPager = findViewById(R.id.viewPage);
        sV = new SlideViewAdapter(this);
        viewPager.setAdapter(sV);

        CircleIndicator ci = (CircleIndicator) findViewById(R.id.titik);
        ci.setViewPager(viewPager);


    }
    public void mulai(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}