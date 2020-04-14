package com.example.appdevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import java.nio.channels.InterruptedByTimeoutException;

public class Splash extends AppCompatActivity {
    MediaPlayer ourSound;
    public final String TAG = "debug";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //android uses HANDLER for splash screen instead of threads.

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent startnext = new Intent("android.intent.action.MAINACTIVITY");
                startActivity(startnext);
            }
        },1000);

//        ourSound = MediaPlayer.create(Splash.this, R.raw.startupsound);
//        Thread timer = new Thread()
//        {
//          public void run()
//          {
//              try{
//                  //ourSound.start();
//                  sleep(2000);
//              }catch(InterruptedException e){
//                  Log.d(TAG, "run: An exception" + " " + e.getMessage());
//              }finally {
//                  Intent startnext = new Intent("android.intent.action.MAINACTIVITY");
//                  startActivity(startnext);
//              }
//          }
//
//        };
//    timer.start();
    }//onCreate

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
