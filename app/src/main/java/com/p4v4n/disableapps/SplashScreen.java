package com.p4v4n.disableapps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /** START - this is the purpose of this Activity */
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
        /** END - everything more than this is time consuming */
    }
}