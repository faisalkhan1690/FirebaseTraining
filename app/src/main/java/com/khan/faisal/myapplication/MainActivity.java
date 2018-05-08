package com.khan.faisal.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.google.analytics.tracking.android.Fields;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.MapBuilder;
import com.google.analytics.tracking.android.Tracker;


public class MainActivity extends AppCompatActivity {

    private Tracker mTracker;

    private final String mScreenLogin="Login_Screen";
    private final String mScreenLogout="Logout_Screen";
    private final String mScreenPlanView="Plan_View_Screen";
    private final String mScreenPlanBuy="Plan_Buy_Screen";


    private String mSalesPersonId="sales@test.com";
    private String mCustomerId="customer@test.com";
    private final String mPlanOne="Plan_One";
    private final String mPlanTwo="Plan_Three";
    private final String mPlanThree="Plan_Three";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTracker = GoogleAnalytics.getInstance(this).getDefaultTracker();

    }


    public void loginUser(View view){
        EditText etSalesPersonId=findViewById(R.id.et_sales_person_id);
        EditText eCustomerId=findViewById(R.id.et_customer_id);

        mSalesPersonId=etSalesPersonId.getText().toString();
        mSalesPersonId=eCustomerId.getText().toString();

        mTracker.set(Fields.customDimension(1), mSalesPersonId);
        mTracker.set(Fields.customDimension(2), mCustomerId);
        mTracker.set(Fields.customDimension(3), null);
        mTracker.set(Fields.SCREEN_NAME, mScreenLogin);
        mTracker.send(MapBuilder.createAppView().build());
    }

    public void logout(View view){
        mTracker.set(Fields.customDimension(1), mSalesPersonId);
        mTracker.set(Fields.customDimension(2), mCustomerId);
        mTracker.set(Fields.customDimension(3), null);
        mTracker.set(Fields.SCREEN_NAME, mScreenLogout);
        mTracker.send(MapBuilder.createAppView().build());
    }

    public void planViewOne(View view){
        mTracker.set(Fields.customDimension(3), mPlanOne);
        mTracker.set(Fields.SCREEN_NAME, mScreenPlanView);
        mTracker.send(MapBuilder.createAppView().build());
    }

    public void planViewTwo(View view){
        mTracker.set(Fields.customDimension(3), mPlanTwo);
        mTracker.set(Fields.SCREEN_NAME, mScreenPlanView);
        mTracker.send(MapBuilder.createAppView().build());

    }
    public void planViewThree(View view){
        mTracker.set(Fields.customDimension(3), mPlanThree);
        mTracker.set(Fields.SCREEN_NAME, mScreenPlanView);
        mTracker.send(MapBuilder.createAppView().build());

    }
    public void planBuyOne(View view){
        mTracker.set(Fields.customDimension(3), mPlanOne);
        mTracker.set(Fields.SCREEN_NAME, mScreenPlanBuy);
        mTracker.send(MapBuilder.createAppView().build());

    }
    public void planBuyTwo(View view){
        mTracker.set(Fields.customDimension(3), mPlanTwo);
        mTracker.set(Fields.SCREEN_NAME, mScreenPlanBuy);
        mTracker.send(MapBuilder.createAppView().build());

    }
    public void planBuyThree(View view){
        mTracker.set(Fields.customDimension(3), mPlanThree);
        mTracker.set(Fields.SCREEN_NAME, mScreenPlanBuy);
        mTracker.send(MapBuilder.createAppView().build());

    }
}
