package com.khan.faisal.myapplication;

import android.app.Application;

import com.google.analytics.tracking.android.GoogleAnalytics;

public class AnalyticsApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        GoogleAnalytics.getInstance(this).getTracker("UA-118493085-1");
    }
}