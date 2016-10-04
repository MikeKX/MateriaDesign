package com.example.mike.materiadesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mike.materiadesign.utils.AppSharedPreferences;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppSharedPreferences mAppSharedPreferences=new AppSharedPreferences(this);
        mAppSharedPreferences.setFirstName("Kim");

        Log.d("TAG","my first name is:" +mAppSharedPreferences.getFirstName());
    }
}
