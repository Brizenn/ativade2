package com.example.appsplash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                try {
                    try {
                        sleep(505);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    startActivity(new Intent(MainActivity.this, SplashActivy.class));
                    finish();


                } catch (RuntimeException e) {
                    throw new RuntimeException(e);
                }
            }


        }; thread1.start();
    }
}