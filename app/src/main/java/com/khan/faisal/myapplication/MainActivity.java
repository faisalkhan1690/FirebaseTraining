package com.khan.faisal.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity {

    private Tracker mTracker;

    private final String mEventLogin="Event_Login";
    private final String mEventLogout="Event_Logout";
    private final String mEventPlanView="Event_Plan_View";
    private final String mEventPlanBuy="Event_Plan_Buy";


    private final String mKeySalesPerson="Sales_Person_Id";
    private final String mKeyCustomerId="Customer_Id";
    private final String mKeyPlanID="Plan_Id";



    private final String mSalesPersonId="sales@test.com";
    private final String mCustomerId="customer@test.com";
    private final String mPlanOne="Plan_One";
    private final String mPlanTwo="Plan_Three";
    private final String mPlanThree="Plan_Three";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnalyticsApplication application = (AnalyticsApplication) getApplication();
        mTracker = application.getDefaultTracker();

    }


    public void loginUser(View view){

        HashMap<String,String> dataMap=new HashMap<>();
        dataMap.put(mKeySalesPerson, mSalesPersonId);
        dataMap.put(mKeyCustomerId, mCustomerId);
        mTracker.send(new HitBuilders.EventBuilder()
                .setCategory(mEventLogin)
                .setAction(mEventLogin)
                .setLabel(mEventLogin)
                .setAll(dataMap)
                .build());
    }

    public void logout(View view){
        HashMap<String,String> dataMap=new HashMap<>();
        dataMap.put(mKeySalesPerson, mSalesPersonId);
        dataMap.put(mKeyCustomerId, mCustomerId);
        mTracker.send(new HitBuilders.EventBuilder()
                .setCategory(mEventLogout)
                .setAction(mEventLogout)
                .setLabel(mEventLogout)
                .setAll(dataMap)
                .build());
    }

    public void planViewOne(View view){
        HashMap<String,String> dataMap=new HashMap<>();
        dataMap.put(mKeySalesPerson, mSalesPersonId);
        dataMap.put(mKeyCustomerId, mCustomerId);
        dataMap.put(mKeyPlanID, mPlanOne);
        mTracker.send(new HitBuilders.EventBuilder()
                .setCategory(mEventPlanView)
                .setAction(mEventPlanView)
                .setLabel(mEventPlanView)
                .setAll(dataMap)
                .build());
    }

    public void planViewTwo(View view){
        HashMap<String,String> dataMap=new HashMap<>();
        dataMap.put(mKeySalesPerson, mSalesPersonId);
        dataMap.put(mKeyCustomerId, mCustomerId);
        dataMap.put(mKeyPlanID, mPlanTwo);
        mTracker.send(new HitBuilders.EventBuilder()
                .setCategory(mEventPlanView)
                .setAction(mEventPlanView)
                .setLabel(mEventPlanView)
                .setAll(dataMap)
                .build());

    }
    public void planViewThree(View view){
        HashMap<String,String> dataMap=new HashMap<>();
        dataMap.put(mKeySalesPerson, mSalesPersonId);
        dataMap.put(mKeyCustomerId, mCustomerId);
        dataMap.put(mKeyPlanID, mPlanThree);
        mTracker.send(new HitBuilders.EventBuilder()
                .setCategory(mEventPlanView)
                .setAction(mEventPlanView)
                .setLabel(mEventPlanView)
                .setAll(dataMap)
                .build());

    }
    public void planBuyOne(View view){
        HashMap<String,String> dataMap=new HashMap<>();
        dataMap.put(mKeySalesPerson, mSalesPersonId);
        dataMap.put(mKeyCustomerId, mCustomerId);
        dataMap.put(mKeyPlanID, mPlanOne);
        mTracker.send(new HitBuilders.EventBuilder()
                .setCategory(mEventPlanBuy)
                .setAction(mEventPlanBuy)
                .setLabel(mEventPlanBuy)
                .setAll(dataMap)
                .build());

    }
    public void planBuyTwo(View view){
        HashMap<String,String> dataMap=new HashMap<>();
        dataMap.put(mKeySalesPerson, mSalesPersonId);
        dataMap.put(mKeyCustomerId, mCustomerId);
        dataMap.put(mKeyPlanID, mPlanTwo);
        mTracker.send(new HitBuilders.EventBuilder()
                .setCategory(mEventPlanBuy)
                .setAction(mEventPlanBuy)
                .setLabel(mEventPlanBuy)
                .setAll(dataMap)
                .build());

    }
    public void planBuyThree(View view){
        HashMap<String,String> dataMap=new HashMap<>();
        dataMap.put(mKeySalesPerson, mSalesPersonId);
        dataMap.put(mKeyCustomerId, mCustomerId);
        dataMap.put(mKeyPlanID, mPlanThree);
        mTracker.send(new HitBuilders.EventBuilder()
                .setCategory(mEventPlanBuy)
                .setAction(mEventPlanBuy)
                .setLabel(mEventPlanBuy)
                .setAll(dataMap)
                .build());

    }
}
