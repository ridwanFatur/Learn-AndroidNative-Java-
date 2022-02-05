package com.ridwanproduction.learnandroidjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate called");
        setContentView(R.layout.activity_main);


        Button buttonNotif = findViewById(R.id.buttonNotif);
        buttonNotif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Test Click");
                Intent intent = new Intent(MainActivity.this, TweetCollectorService.class);
                startService(intent);
//                Intent serviceIntent = new Intent(TweetCollectorService.class.getName());
//                startService(serviceIntent);
//                Intent serviceIntent = new Intent(MainActivity.this, TweetCollectorService.class);
//                ContextCompat.startForegroundService(MainActivity.this, serviceIntent);
            }
        });
    }

}