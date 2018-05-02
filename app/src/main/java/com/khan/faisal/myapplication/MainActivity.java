package com.khan.faisal.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;


public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

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
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

    }


    public void loginUser(View view){
        Bundle bundle = new Bundle();
        bundle.putString(mKeySalesPerson, mSalesPersonId);
        bundle.putString(mKeyCustomerId, mCustomerId);
        mFirebaseAnalytics.logEvent(mEventLogin, bundle);
    }

    public void logout(View view){
        Bundle bundle = new Bundle();
        bundle.putString(mKeySalesPerson, mSalesPersonId);
        bundle.putString(mKeyCustomerId, mCustomerId);
        mFirebaseAnalytics.logEvent(mEventLogout, bundle);
    }

    public void planViewOne(View view){
        Bundle bundle = new Bundle();
        bundle.putString(mKeySalesPerson, mSalesPersonId);
        bundle.putString(mKeyCustomerId, mCustomerId);
        bundle.putString(mKeyPlanID, mPlanOne);
        mFirebaseAnalytics.logEvent(mEventPlanView, bundle);
    }

    public void planViewTwo(View view){
        Bundle bundle = new Bundle();
        bundle.putString(mKeySalesPerson, mSalesPersonId);
        bundle.putString(mKeyCustomerId, mCustomerId);
        bundle.putString(mKeyPlanID, mPlanTwo);
        mFirebaseAnalytics.logEvent(mEventPlanView, bundle);

    }
    public void planViewThree(View view){
        Bundle bundle = new Bundle();
        bundle.putString(mKeySalesPerson, mSalesPersonId);
        bundle.putString(mKeyCustomerId, mCustomerId);
        bundle.putString(mKeyPlanID, mPlanThree);
        mFirebaseAnalytics.logEvent(mEventPlanView, bundle);

    }
    public void planBuyOne(View view){
        Bundle bundle = new Bundle();
        bundle.putString(mKeySalesPerson, mSalesPersonId);
        bundle.putString(mKeyCustomerId, mCustomerId);
        bundle.putString(mKeyPlanID, mPlanOne);
        mFirebaseAnalytics.logEvent(mEventPlanBuy, bundle);

    }
    public void planBuyTwo(View view){
        Bundle bundle = new Bundle();
        bundle.putString(mKeySalesPerson, mSalesPersonId);
        bundle.putString(mKeyCustomerId, mCustomerId);
        bundle.putString(mKeyPlanID, mPlanTwo);
        mFirebaseAnalytics.logEvent(mEventPlanBuy, bundle);

    }
    public void planBuyThree(View view){
        Bundle bundle = new Bundle();
        bundle.putString(mKeySalesPerson, mSalesPersonId);
        bundle.putString(mKeyCustomerId, mCustomerId);
        bundle.putString(mKeyPlanID, mPlanThree);
        mFirebaseAnalytics.logEvent(mEventPlanBuy, bundle);

    }
}
