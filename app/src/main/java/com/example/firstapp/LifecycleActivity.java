package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.d("msg", "oncreate");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("msg", "onstart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("msg", "onresume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("msg", "onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("msg", "onstop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("msg", "ondestory");

    }
}
