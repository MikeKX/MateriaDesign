package com.example.mike.materiadesign.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by mc on 10/4/16.
 */

public class AppSharedPreferences {

    private static final String APP_SHARED_PREFS = "AppSharedTesting";

    private SharedPreferences mSharedPreferences;

    private SharedPreferences.Editor mEditor;

    public AppSharedPreferences(Context context){
        this.mSharedPreferences=context.getSharedPreferences(APP_SHARED_PREFS, Activity.MODE_PRIVATE);
        this.mEditor=mSharedPreferences.edit();

    }

    public void setFirstName(String firstName){
        this.mEditor.putString("first_name",firstName);
        this.mEditor.commit();

    }

    public String getFirstName(){

        String firstName="";
        if(null !=mSharedPreferences){
            firstName=mSharedPreferences.getString("first_name"," ");
        }
        return firstName;
    }



















}
