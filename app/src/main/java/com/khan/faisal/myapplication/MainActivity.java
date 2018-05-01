package com.khan.faisal.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        firebaseAnalytics.setCurrentScreen(this, "My Custom activity","My Data");

    }

    public void startScreen(View view){
        startActivity(new Intent(MainActivity.this,SecondActivity.class));
    }
}
