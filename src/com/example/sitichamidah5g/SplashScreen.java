package com.example.sitichamidah5g;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
 
public class SplashScreen extends Activity{
    private static final int SPLASH_TIME = 3 * 1000;// Set waktu 3 Detik
    ProgressBar prg;
 
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);//layout yang diload
        prg = (ProgressBar)findViewById(R.id.progressBar1);//Tampilan progress Bar
        prg.setAlpha(SPLASH_TIME);
        new Handler().postDelayed(new Runnable() {
 
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,Home.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME);
 
        new Handler().postDelayed(new Runnable() {
              @Override
              public void run() {
                     }
                }, SPLASH_TIME);
    }
}