package com.example.myapps10119208;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.content.Intent;
import android.annotation.SuppressLint;
import android.os.Bundle;

//dibuat tgl 11 mei 2022 oleh agung segara rizki 10119208
@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //initialize handler
        Handler handler = new Handler();

        //start handler
        handler.postDelayed(() -> {
            //initialize intent
            Intent intent = new Intent(this, WalkthroughActivity.class);
            startActivity(intent);

            //stop intent
            finish();

        }, 3000);

    }
}